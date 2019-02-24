/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Nicolás Moreno
 */
public class Region {
    private HashMap<String,Department> departments;
    private int bonusArmies;

    public Region() {
        departments = new HashMap<>();
    }

    public HashMap<String, Department> getDepartments() {
        return departments;
    }

    public void setDepartments(HashMap<String, Department> departments) {
        this.departments = departments;
    }
    
    
    
    

    public int getBonusArmies() {
        return bonusArmies;
    }

    public void setBonusArmies(int bonusArmies) {
        this.bonusArmies = bonusArmies;
    }
    
    
}
