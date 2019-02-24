/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Department;
import data.Region;
import data.Unit;
import java.util.HashMap;

/**
 *
 * @author Nicolás Moreno
 */
public interface UI {
    public int selectUnit();
    public Department selectDepartment();
    public void paintUnitInDepartment(Unit unit, Department department);

    public void printMap(HashMap<String, Region> map);
    
}
