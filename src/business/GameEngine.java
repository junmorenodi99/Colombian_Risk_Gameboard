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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import ui.GUI;
import ui.UI;

/**
 *
 * @author Nicolás Moreno
 */
public class GameEngine {
    private static Player player1 = new Player();
    private static Player player2 = new Player();
    
    private static HashMap<String,Region> map = new HashMap<>();
    private static List<Department> allDepartments = new ArrayList<>();
    
    private static int initialArmies = 40;
    private static int initialDepartmentsByPlayer = 16;
    
    
    private static UI ui;
    
    
    public static void main(String args[]){
        setUp();
        startGame();
    }
    
    
    public static void setUp(){
        //set UI
        ui = new GUI();
        //set players
        player1.setFaction("Red");
        player2.setFaction("Blue");
        //set regions 
        setUpRegions();
        //set departments 
        setUpAllDepartments();
        //set players units in map
        //ui.printMap(map);
        setUpUnits(player1);
        setUpUnits(player2);
    }
    
    public static void setUpRegions(){
        map.put("Amazonia", RegionFactory.setUpAmazoniaRegion());
        map.put("Caribe", RegionFactory.setUpCaribeRegion());
        map.put("Orinoquia", RegionFactory.setUpOrinoquiaRegion());
        map.put("Andina", RegionFactory.setUpAndinaRegion());
        map.put("Pacifica", RegionFactory.setUpPacificoRegion());
        
    }
    
    public static void setUpAllDepartments(){
        allDepartments.addAll(map.get("Amazonia").getDepartments().values());
        allDepartments.addAll(map.get("Caribe").getDepartments().values());
        allDepartments.addAll(map.get("Orinoquia").getDepartments().values());
        allDepartments.addAll(map.get("Andina").getDepartments().values());
        allDepartments.addAll(map.get("Pacifica").getDepartments().values());
    }
   
    public static void setPlayersDeparments(){
        Random random = new Random();
        
        while(!allDepartments.isEmpty()){
            assignDepartemntToPlayer(player1, allDepartments.remove(random.nextInt(allDepartments.size())));
            assignDepartemntToPlayer(player2, allDepartments.remove(random.nextInt(allDepartments.size())));
        }
    }
    
    public static void assignDepartemntToPlayer(Player player, Department department){
        Unit unitPlayer = new Unit(1,player,"image_soldier_"+player.getFaction());
        department.setOwner(player);
        department.getUnits().add(unitPlayer);
        player.getOccupedCountries().add(department);
    }
 
    private static void setUpUnits(Player player) {
        for(int index = 0; index < initialArmies - initialDepartmentsByPlayer; index++){
            Unit unit = UnitFactory.createUnit(player,ui.selectUnit());
            Department department = ui.selectDepartment();
            department.getUnits().add(unit);
            ui.paintUnitInDepartment(unit, department);
        }
    }

    private static void startGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
