/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolás Moreno
 */
public class Player {
    private ArrayList<Department> occupedCountries;
    private ArrayList<Unit> ownedUnits;
    private String faction;
    private Integer avaliableArmies;
    
    public Player(){
        this.occupedCountries = new ArrayList<>();
        this.ownedUnits = new ArrayList<>();
    }

    public ArrayList<Department> getOccupedCountries() {
        return occupedCountries;
    }

    public void setOccupedCountries(ArrayList<Department> occupedCountries) {
        this.occupedCountries = occupedCountries;
    }

    public List<Unit> getOwnedUnits() {
        return ownedUnits;
    }

    public void setOwnedUnits(ArrayList<Unit> ownedUnits) {
        this.ownedUnits = ownedUnits;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }

    public Integer getAvaliableArmies() {
        return avaliableArmies;
    }

    public void setAvaliableArmies(Integer avaliableArmies) {
        this.avaliableArmies = avaliableArmies;
    }
    
     
    
    
}
