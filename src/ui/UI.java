/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import data.Department;
import data.Player;
import data.Region;
import data.Unit;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Nicolás Moreno
 */
public interface UI {
    public String selectUnit();
    public Department selectDepartment();
    public void printMap(HashMap<String,Department> departments);
    public void printPlayerDepartments(ArrayList<Department> departments);
    public void printPlayerStatus(Player player);
    public String askForAction();
    public void showUnitError();
    public void showSuccessUnit();
    public void showUnitDepartmentError();
    
}
