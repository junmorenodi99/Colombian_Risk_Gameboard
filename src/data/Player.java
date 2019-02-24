/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.List;

/**
 *
 * @author Nicolás Moreno
 */
public class Player {
    private List<Department> occupedCountries;
    private List<Unit> ownedUnits;
    private String faction;

    public List<Department> getOccupedCountries() {
        return occupedCountries;
    }

    public void setOccupedCountries(List<Department> occupedCountries) {
        this.occupedCountries = occupedCountries;
    }

    public List<Unit> getOwnedUnits() {
        return ownedUnits;
    }

    public void setOwnedUnits(List<Unit> ownedUnits) {
        this.ownedUnits = ownedUnits;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
    
    
    
    
}
