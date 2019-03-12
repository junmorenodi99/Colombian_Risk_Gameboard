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
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import ui.GUI;
import ui.GUI;
import ui.UI;

/**
 *
 * @author Nicolás Moreno
 */
public class GameEngine {
    
    private static ArrayList<Player> players = new ArrayList<>();
    
    private static HashMap<String,Region> map = new HashMap<>();
    private static HashMap<String,Department> allDepartments = new HashMap<>();
    
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
        players.add(new Player());
        players.add(new Player());
        players.get(0).setFaction("Red");
        players.get(1).setFaction("Blue");
        //set regions 
        setUpRegions();
        //set departments 
        setUpAllDepartments();
        setPlayersDeparments();
  
        
    }
    
    public static void setUpRegions(){
        map.put("Amazonia", RegionFactory.setUpAmazoniaRegion());
        map.put("Caribe", RegionFactory.setUpCaribeRegion());
        map.put("Orinoquia", RegionFactory.setUpOrinoquiaRegion());
        map.put("Andina", RegionFactory.setUpAndinaRegion());
        map.put("Pacifica", RegionFactory.setUpPacificoRegion());
        
    }
    
    public static void setUpAllDepartments(){
        allDepartments.putAll(map.get("Amazonia").getDepartments());
        allDepartments.putAll(map.get("Caribe").getDepartments());
        allDepartments.putAll(map.get("Orinoquia").getDepartments());
        allDepartments.putAll(map.get("Andina").getDepartments());
        allDepartments.putAll(map.get("Pacifica").getDepartments());
    }
   
    public static void setPlayersDeparments(){
        Random random = new Random();
        
        ArrayList<Department> departmentArray =  new ArrayList<>();
        allDepartments.values().forEach((department)->{departmentArray.add(department);});
        
        while(!departmentArray.isEmpty()){
            try{
                assignDepartemntToPlayer(players.get(0), departmentArray.remove(random.nextInt(allDepartments.size())));
                assignDepartemntToPlayer(players.get(1), departmentArray.remove(random.nextInt(allDepartments.size())));
            }catch(IndexOutOfBoundsException e){}
        }
    }
    
    public static void assignDepartemntToPlayer(Player player, Department department){
        Unit unitPlayer = new Unit(1,player,"image_soldier_"+player.getFaction(), "soldier");
        department.setOwner(player);
        department.getUnits().add(unitPlayer);
        player.getOccupedCountries().add(department);
    }


    private static void startGame() {
        ui.printMap(allDepartments);
        
        
        Player player = players.get(0);
        //ciclo de turnos
        ui.printPlayerDepartments(player.getOccupedCountries());
        player.setAvaliableArmies(calculateNumberArmiesToSetUp(player));
        ui.printPlayerStatus(player);
        
        //wait for action
        Boolean endTurn = false;
        do{
            String action = ui.askForAction();
            switch(action){
                case "attack":
                    System.out.println("Attack");
                    break;
                case "putUnits":
                    System.out.println("Create Units");
                    putUnit(player, ui.selectUnit());
                    break;
                case "endTurn":
                    System.out.println("End Turn");
                    endTurn = true;
                    break;
            }
            ui.printPlayerStatus(player);
        }while(!endTurn);
        
    }
    
    private static Boolean putUnit(Player player,String unitToPut){
        
        int unitValue = 0;
        
        if("soldier".equals(unitToPut)){
            unitValue = 1;
        }
        if("horse".equals(unitToPut)){
            unitValue = 5;
        }
        if("tank".equals(unitToPut)){
           unitValue = 10;
        }
        
        if(unitValue > player.getAvaliableArmies()){
            ui.showUnitError();
            return false;
        }
        
        
        player.setAvaliableArmies(player.getAvaliableArmies()-unitValue);
        Department departmentToPut = ui.selectDepartment();
        
        if(!player.equals(departmentToPut.getOwner())){
            ui.showUnitDepartmentError();
            return false;
        }
        
        departmentToPut.getUnits().add(new Unit(unitValue, player, "",unitToPut));
        ui.showSuccessUnit();
        return true;
    }
    
    private static int calculateNumberArmiesToSetUp(Player player){
        return player.getOccupedCountries().size();
    }
    
}
