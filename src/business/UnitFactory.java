/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Player;
import data.Unit;

/**
 *
 * @author Nicolás Moreno
 */
public class UnitFactory {
    
    public static Unit createUnit(Player player, int armies){
        String image = "";
        switch(armies){
            case 1:
                image = "image_soldier_"+ player.getFaction();
                break;
            case 2:
                image = "image_cavalry_"+player.getFaction();
                break;
            case 3:
                image = "image_canon_"+player.getFaction();
                break;
        }
        return new Unit(armies,player,image);
    }
}
