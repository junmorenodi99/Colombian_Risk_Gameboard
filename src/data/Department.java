/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Nicolás Moreno
 */
public class Department {
    
    private Player owner;
    private String name;
    private HashMap<String,Department> neighbours;
    private List<Unit> units;
    private JButton uiButton;

    public Department(String name) {
        this.name = name;
        this.neighbours = new HashMap<>();
        this.units = new ArrayList<>();
    }
    
    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Unit> getUnits() {
        return units;
    }

    public void setUnits(List<Unit> units) {
        this.units = units;
    }

    public JButton getUiButton() {
        return uiButton;
    }

    public void setUiButton(JButton uiButton) {
        this.uiButton = uiButton;
    }

    

    public HashMap<String, Department> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(HashMap<String, Department> neighbours) {
        this.neighbours = neighbours;
    }
    
    
    
    
    
    
    
}
