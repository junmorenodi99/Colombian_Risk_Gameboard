/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import data.Department;
import data.Region;

/**
 *
 * @author Nicolás Moreno
 */
public class RegionFactory {

    public static Region setUpAmazoniaRegion() {
        Region region = new Region();
        Department amazonas = new Department("Amazonas", "");
        Department caqueta = new Department("Caqueta", "");
        Department guainia = new Department("Guania", "");
        Department guaviare = new Department("Guaviare", "");
        Department meta = new Department("Meta", "");
        Department putumayo = new Department("Putumayo", "");
        Department vaupes = new Department("Amazanonia", "");
        Department vichada = new Department("Amazanonia", "");
        
        amazonas.getNeighbours().put(putumayo.getName(),putumayo);
        amazonas.getNeighbours().put(caqueta.getName(),caqueta);
        amazonas.getNeighbours().put(vaupes.getName(),vaupes);
        
        putumayo.getNeighbours().put(amazonas.getName(),amazonas);
        putumayo.getNeighbours().put(caqueta.getName(),caqueta);
        
        caqueta.getNeighbours().put(guaviare.getName(),guaviare);
        caqueta.getNeighbours().put(putumayo.getName(),putumayo);
        caqueta.getNeighbours().put(meta.getName(),meta);
        caqueta.getNeighbours().put(vaupes.getName(),vaupes);
        caqueta.getNeighbours().put(amazonas.getName(),amazonas);
        
        guainia.getNeighbours().put(vaupes.getName(), vaupes);
        guainia.getNeighbours().put(vichada.getName(), vichada);
        guainia.getNeighbours().put(meta.getName(), meta);
        guainia.getNeighbours().put(guaviare.getName(), guaviare);
        
        guaviare.getNeighbours().put(meta.getName(), meta);
        guaviare.getNeighbours().put(caqueta.getName(), caqueta);
        guaviare.getNeighbours().put(vaupes.getName(), vaupes);
        guaviare.getNeighbours().put(guainia.getName(), guainia);
         
        meta.getNeighbours().put(vichada.getName(), vichada);
        meta.getNeighbours().put(caqueta.getName(), caqueta);
        meta.getNeighbours().put(guaviare.getName(), guaviare);
        
        vaupes.getNeighbours().put(amazonas.getName(), amazonas);
        vaupes.getNeighbours().put(caqueta.getName(), caqueta);
        vaupes.getNeighbours().put(guaviare.getName(), guaviare);
        vaupes.getNeighbours().put(guainia.getName(), guainia);
       
        vichada.getNeighbours().put(meta.getName(),meta);
        vichada.getNeighbours().put(guaviare.getName(),guaviare);
        vichada.getNeighbours().put(guainia.getName(),guainia);
        
        region.getDepartments().put(amazonas.getName(),amazonas);
        region.getDepartments().put(vaupes.getName(),vaupes);
        region.getDepartments().put(guainia.getName(),guainia);
        region.getDepartments().put(vichada.getName(),vichada);
        region.getDepartments().put(meta.getName(),meta);
        region.getDepartments().put(guaviare.getName(),guaviare);
        region.getDepartments().put(caqueta.getName(),caqueta);
        region.getDepartments().put(putumayo.getName(),putumayo);
        
        return region;
    }

    public static Region setUpAndinaRegion() {
        Region region = new Region();
        return region;
    }

    public static Region setUpCaribeRegion() {
        Region region = new Region();
        return region;
    }

    public static Region setUpInsularRegion() {
        Region region = new Region();
        return region;
    }

    public static Region setUpOrinoquiaRegion() {
        Region region = new Region();
        return region;
    }

    public static Region setUpPacificoRegion() {
        Region region = new Region();
        return region;
    }

}
