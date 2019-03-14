/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Department;
import data.Player;
import data.Region;
import data.Unit;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import ui.GUI;
import ui.UI;

/**
 *
 * @author Nicolás Moreno
 */
public class GameEngine {
    
    private static JFXPanel fxPanel = new JFXPanel();

    private static ArrayList<Player> players = new ArrayList<>();

    private static HashMap<String, Region> map = new HashMap<>();
    private static HashMap<String, Department> allDepartments = new HashMap<>();

    private static int initialArmies = 40;
    private static int initialDepartmentsByPlayer = 16;

    private static int turnNumber = 1;

    private static UI ui;

    public static void main(String args[]) {
        setUp();
        startGame();
    }

    public static void setUp() {
        
        //set UI
        ui = new GUI();
        //set players
        players.add(new Player());
        players.add(new Player());
        players.get(0).setFaction("España");
        players.get(1).setFaction("Colonia");
        //set regions 
        setUpRegions();
        //set departments 
        setUpAllDepartments();
        setPlayersDeparments();

        try {
            playMusic();
        } catch (Exception ex) {
            Logger.getLogger(GameEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void setUpRegions() {
        map.put("Amazonia", RegionFactory.setUpAmazoniaRegion());
        map.put("Caribe", RegionFactory.setUpCaribeRegion());
        map.put("Orinoquia", RegionFactory.setUpOrinoquiaRegion());
        map.put("Andina", RegionFactory.setUpAndinaRegion());
        map.put("Pacifica", RegionFactory.setUpPacificoRegion());

    }

    public static void setUpAllDepartments() {
        allDepartments.putAll(map.get("Amazonia").getDepartments());
        allDepartments.putAll(map.get("Caribe").getDepartments());
        allDepartments.putAll(map.get("Orinoquia").getDepartments());
        allDepartments.putAll(map.get("Andina").getDepartments());
        allDepartments.putAll(map.get("Pacifica").getDepartments());
    }

    public static void setPlayersDeparments() {
        Random random = new Random();

        ArrayList<Department> departmentArray = new ArrayList<>();
        allDepartments.values().forEach((department) -> {
            departmentArray.add(department);
        });

        while (!departmentArray.isEmpty()) {
            try {
                assignDepartemntToPlayer(players.get(0), departmentArray.remove(random.nextInt(allDepartments.size())));
                assignDepartemntToPlayer(players.get(1), departmentArray.remove(random.nextInt(allDepartments.size())));
            } catch (IndexOutOfBoundsException e) {
            }
        }
    }

    public static void assignDepartemntToPlayer(Player player, Department department) {
        Unit unitPlayer = new Unit(1, player, "image_soldier_" + player.getFaction(), "soldier");
        department.setOwner(player);
        department.getUnits().add(unitPlayer);
        player.getOccupedCountries().add(department);
    }

    private static void startGame() {
        ui.printMap(allDepartments);

        while (verifyWinner() == null) {
            Player player = players.get(turnNumber % 2);
            ui.printPlayerDepartments(player.getOccupedCountries());
            player.setAvaliableArmies(calculateNumberArmiesToSetUp(player));
            ui.printPlayerStatus(player);

            //wait for action
            Boolean endTurn = false;
            do {
                ui.printPlayerStatus(player);
                String action = ui.askForAction();
                switch (action) {
                    case "attack":
                        if (turnNumber < 3) {
                            ui.printError("No se puede atacar en el primer turno");
                        } else {
                            attackDepartment(ui.selectAttackerDepartment(), ui.selectTargetDepartment(), player);
                        }
                        break;
                    case "putUnits":
                        putUnit(player, ui.selectUnit());
                        break;
                    case "endTurn":
                        endTurn = true;
                        break;
                }
                ui.printPlayerStatus(player);
            } while (!endTurn);
            turnNumber += 1;
        }

    }

    private static Boolean putUnit(Player player, String unitToPut) {

        int unitValue = 0;

        if ("soldier".equals(unitToPut)) {
            unitValue = 1;
        }
        if ("horse".equals(unitToPut)) {
            unitValue = 5;
        }
        if ("tank".equals(unitToPut)) {
            unitValue = 10;
        }

        if (unitValue > player.getAvaliableArmies()) {
            ui.showUnitError();
            return false;
        }

        Department departmentToPut = ui.selectDepartment();

        if (!player.equals(departmentToPut.getOwner())) {
            ui.showUnitDepartmentError();
            return false;
        }
        player.setAvaliableArmies(player.getAvaliableArmies() - unitValue);

        departmentToPut.getUnits().add(new Unit(unitValue, player, "", unitToPut));
        ui.showSuccessUnit();
        return true;
    }

    private static int calculateNumberArmiesToSetUp(Player player) {
        if (turnNumber < 3) {
            return player.getOccupedCountries().size() + 10;
        }
        return player.getOccupedCountries().size();
    }

    private static void attackDepartment(Department selectedAttackerDepartment, Department selectedTargetDepartment, Player turnPlayer) {

        if (!selectedAttackerDepartment.getOwner().equals(turnPlayer)) {
            ui.printError("No se puede atacar desde un territorio no conquistado");
            return;
        }

        if (selectedAttackerDepartment.getName().equals(selectedTargetDepartment.getName())) {
            ui.printError("No se puede atacar el mismo departamento");
            return;
        }

        int attackerArmies = 0;
        for (Unit unit : selectedAttackerDepartment.getUnits()) {
            attackerArmies += unit.getArmies();
        }

        if (attackerArmies <= 1) {
            ui.printError("No se puede atacar con menos de dos ejercitos");
            return;
        }

        /*
        if(selectedAttackerDepartment.getNeighbours().get(selectedTargetDepartment.getName())==null){
            ui.printError("Solo se pueden atacar territorios aledaños");
            return;
        }*/
        if (selectedAttackerDepartment.getOwner().equals(selectedTargetDepartment.getOwner())) {
            ui.printError("Solo se pueden atacar territorios enemigos");
            return;
        }

        int ownerArmies = calculateArmies(selectedAttackerDepartment);
        int targetArmies = calculateArmies(selectedAttackerDepartment);

        Random random = new Random();
        if (random.nextBoolean()) {
            int enemyAliveArmies = targetArmies - ownerArmies;
            if (enemyAliveArmies <= 0) {
                //territorio capturado
                selectedTargetDepartment.getOwner().getOccupedCountries().remove(selectedTargetDepartment);
                selectedTargetDepartment.setOwner(selectedAttackerDepartment.getOwner());
                regroupArmies(selectedTargetDepartment, 1);
                selectedAttackerDepartment.getOwner().getOccupedCountries().add(selectedTargetDepartment);
                ui.printMessage("El territorio ha sido capturado con exito");
            } else {
                regroupArmies(selectedTargetDepartment, enemyAliveArmies);
                ui.printMessage("El enemigo ha pertido la batalla pero conserva el territorio");
            }

        } else {
            int aliveArmies = ownerArmies - targetArmies;
            if (aliveArmies <= 0) {
                ui.printMessage("El enemigo gana la batalla, perdiste todos los ejercitos del territorio");
                regroupArmies(selectedAttackerDepartment, 1);
            } else {
                regroupArmies(selectedAttackerDepartment, aliveArmies);
                ui.printMessage("El enemigo gana la batalla");
            }

        }

    }

    private static int calculateArmies(Department department) {
        int totalArmies = 0;
        for (Unit unit : department.getUnits()) {
            totalArmies += unit.getArmies();
        }
        return totalArmies;
    }

    private static ArrayList<Unit> regroupArmies(Department department, int armies) {
        ArrayList<Unit> units = new ArrayList<>();

        int numberOfTanks = armies / 10;
        int numberOfHorses = numberOfTanks / 5;
        int numberOfSoldiers = armies - (numberOfTanks + numberOfHorses);

        for (int index = 0; index < numberOfTanks; index++) {
            units.add(new Unit(10, department.getOwner(), "", "tank"));
        }
        for (int index = 0; index < numberOfHorses; index++) {
            units.add(new Unit(5, department.getOwner(), "", "horse"));
        }
        for (int index = 0; index < numberOfSoldiers; index++) {
            units.add(new Unit(1, department.getOwner(), "", "soldier"));
        }
        department.setUnits(units);
        return units;
    }

    public static Player verifyWinner() {
        if (players.get(0).getOccupedCountries().size() <= 0) {
            ui.printWinner(players.get(1));
            return players.get(1);
        } else if (players.get(1).getOccupedCountries().size() <= 0) {
            ui.printWinner(players.get(0));
            return players.get(0);
        }
        return null;
    }

    private static void playMusic() throws Exception {
        MusicThread music = new MusicThread();
        Thread musicThread = new Thread(music);
        musicThread.start();
        
    }

}
