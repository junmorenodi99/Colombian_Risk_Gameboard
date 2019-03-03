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
        Department amazonas = new Department("Amazonas");
        Department caqueta = new Department("Caquetá");
        Department guainia = new Department("Guanía");
        Department guaviare = new Department("Guaviare");
        Department putumayo = new Department("Putumayo");
        Department vaupes = new Department("Vaupés");
        
        //Neighbours
        
        amazonas.getNeighbours().put(putumayo.getName(),putumayo);
        amazonas.getNeighbours().put(caqueta.getName(),caqueta);
        amazonas.getNeighbours().put(vaupes.getName(),vaupes);
        
        putumayo.getNeighbours().put(amazonas.getName(),amazonas);
        putumayo.getNeighbours().put(caqueta.getName(),caqueta);
        
        caqueta.getNeighbours().put(guaviare.getName(),guaviare);
        caqueta.getNeighbours().put(putumayo.getName(),putumayo);
        caqueta.getNeighbours().put(vaupes.getName(),vaupes);
        caqueta.getNeighbours().put(amazonas.getName(),amazonas);
        
        guainia.getNeighbours().put(vaupes.getName(), vaupes);
        guainia.getNeighbours().put(guaviare.getName(), guaviare);
        
        guaviare.getNeighbours().put(caqueta.getName(), caqueta);
        guaviare.getNeighbours().put(vaupes.getName(), vaupes);
        guaviare.getNeighbours().put(guainia.getName(), guainia);
         
        vaupes.getNeighbours().put(amazonas.getName(), amazonas);
        vaupes.getNeighbours().put(caqueta.getName(), caqueta);
        vaupes.getNeighbours().put(guaviare.getName(), guaviare);
        vaupes.getNeighbours().put(guainia.getName(), guainia);
       
        
        region.getDepartments().put(amazonas.getName(),amazonas);
        region.getDepartments().put(vaupes.getName(),vaupes);
        region.getDepartments().put(guainia.getName(),guainia);
        region.getDepartments().put(guaviare.getName(),guaviare);
        region.getDepartments().put(caqueta.getName(),caqueta);
        region.getDepartments().put(putumayo.getName(),putumayo);
        
        return region;
    }

    public static Region setUpAndinaRegion() {
         Region region = new Region();
        Department antioquia = new Department("Antioquia");
        Department boyaca = new Department("Boyaca");
        Department caldas = new Department("Caldas");
        Department cundinamarca = new Department("Cundinamarca");
        Department huila = new Department("Huila");
        Department norteDeSantander = new Department("Norte de Santander");
        Department quindio = new Department("Quindio");
        Department risaralda = new Department("Risaralda");
        Department santander = new Department("Santander");
        Department tolima = new Department("Tolima");
        
        
           
        region.getDepartments().put(antioquia.getName(),antioquia);
        region.getDepartments().put(boyaca.getName(),boyaca);
        region.getDepartments().put(caldas.getName(),caldas);
        region.getDepartments().put(cundinamarca.getName(),cundinamarca);
        region.getDepartments().put(huila.getName(),huila);
        region.getDepartments().put(norteDeSantander.getName(),norteDeSantander);
        region.getDepartments().put(quindio.getName(),quindio);
        region.getDepartments().put(risaralda.getName(),risaralda);
        region.getDepartments().put(santander.getName(),santander);
        region.getDepartments().put(tolima.getName(),tolima);
        
        
        //Neighbours
        
        antioquia.getNeighbours().put(santander.getName(),santander);
        antioquia.getNeighbours().put(boyaca.getName(),boyaca);
        antioquia.getNeighbours().put(risaralda.getName(),risaralda);
        antioquia.getNeighbours().put(caldas.getName(),caldas);
        
        boyaca.getNeighbours().put(santander.getName(),santander);
        boyaca.getNeighbours().put(norteDeSantander.getName(),norteDeSantander);
        boyaca.getNeighbours().put(cundinamarca.getName(),cundinamarca);
        boyaca.getNeighbours().put(antioquia.getName(),antioquia);
        boyaca.getNeighbours().put(caldas.getName(),caldas);


 caldas.getNeighbours().put(risaralda.getName(),risaralda);        
 caldas.getNeighbours().put(antioquia.getName(),antioquia);        
 caldas.getNeighbours().put(cundinamarca.getName(),cundinamarca);        
 caldas.getNeighbours().put(tolima.getName(),tolima);   
 
 
 cundinamarca.getNeighbours().put(tolima.getName(),tolima);   
 cundinamarca.getNeighbours().put(huila.getName(),huila);   
 cundinamarca.getNeighbours().put(boyaca.getName(),boyaca);   
 cundinamarca.getNeighbours().put(caldas.getName(),caldas); 
 
 
 huila.getNeighbours().put(tolima.getName(),tolima);


 norteDeSantander.getNeighbours().put(santander.getName(),santander);
 norteDeSantander.getNeighbours().put(boyaca.getName(),boyaca);
 
 
  quindio.getNeighbours().put(risaralda.getName(),risaralda);
  quindio.getNeighbours().put(tolima.getName(),tolima);
  
  
  risaralda.getNeighbours().put(tolima.getName(),tolima);
  risaralda.getNeighbours().put(antioquia.getName(),antioquia);
  risaralda.getNeighbours().put(caldas.getName(),caldas);
  risaralda.getNeighbours().put(quindio.getName(),quindio);
  
  
  santander.getNeighbours().put(norteDeSantander.getName(),quindio);
  santander.getNeighbours().put(boyaca.getName(),boyaca);
  santander.getNeighbours().put(antioquia.getName(),antioquia);
  
  tolima.getNeighbours().put(quindio.getName(),quindio);
  tolima.getNeighbours().put(risaralda.getName(),risaralda);
  tolima.getNeighbours().put(caldas.getName(),caldas);
  tolima.getNeighbours().put(cundinamarca.getName(),cundinamarca);
  tolima.getNeighbours().put(huila.getName(),huila);

        return region;
    }

    public static Region setUpCaribeRegion() {
        Region region = new Region();
        Department atlantico = new Department("Atlantico");
        Department bolivar = new Department("Bolivar");
        Department cesar = new Department("Cesar");
        Department cordoba = new Department("Córdoba");
        Department guajira = new Department("Guajira");
        Department magdalena = new Department("Magdalena");
        Department sucre = new Department("Sucre");
        
        
        
          region.getDepartments().put(atlantico.getName(),atlantico);
        region.getDepartments().put(bolivar.getName(),bolivar);
        region.getDepartments().put(cesar.getName(),cesar);
        region.getDepartments().put(cordoba.getName(),cordoba);
        region.getDepartments().put(guajira.getName(),guajira);
        region.getDepartments().put(magdalena.getName(),magdalena);
        region.getDepartments().put(sucre.getName(),sucre);

        
        
        
  atlantico.getNeighbours().put(magdalena.getName(),magdalena);
  atlantico.getNeighbours().put(bolivar.getName(),bolivar);
  
  
  
  bolivar.getNeighbours().put(sucre.getName(),sucre);
   bolivar.getNeighbours().put(cordoba.getName(),cordoba);
    bolivar.getNeighbours().put(magdalena.getName(),magdalena);
     bolivar.getNeighbours().put(cesar.getName(),cesar);
      
     
     
     cesar.getNeighbours().put(bolivar.getName(),bolivar);
     cesar.getNeighbours().put(magdalena.getName(),magdalena);
     cesar.getNeighbours().put(guajira.getName(),guajira);
     
     
     
      cordoba.getNeighbours().put(sucre.getName(),sucre);
      cordoba.getNeighbours().put(bolivar.getName(),bolivar);
      
      
      guajira.getNeighbours().put(magdalena.getName(),magdalena);
      guajira.getNeighbours().put(cesar.getName(),cesar);
      
      
      magdalena.getNeighbours().put(atlantico.getName(),atlantico);
       magdalena.getNeighbours().put(cesar.getName(),cesar);
        magdalena.getNeighbours().put(guajira.getName(),guajira);
        magdalena.getNeighbours().put(bolivar.getName(),bolivar);

      sucre.getNeighbours().put(bolivar.getName(),bolivar);
       sucre.getNeighbours().put(cordoba.getName(),cordoba);
     
        
        return region;
    }

   
    public static Region setUpOrinoquiaRegion() {
        Region region = new Region();
        Department arauca= new Department("Arauca");
        Department casanare= new Department("Arauca");
        Department meta= new Department("Arauca");
        Department vichada= new Department("Arauca");
        
        
                 region.getDepartments().put(arauca.getName(),arauca);
        region.getDepartments().put(casanare.getName(),casanare);
         region.getDepartments().put(meta.getName(),meta);
        region.getDepartments().put(vichada.getName(),vichada); 
        
       arauca.getNeighbours().put(casanare.getName(),casanare);
       arauca.getNeighbours().put(vichada.getName(),vichada);
       
       
       casanare.getNeighbours().put(arauca.getName(),arauca);
       casanare.getNeighbours().put(meta.getName(),meta);
       casanare.getNeighbours().put(vichada.getName(),vichada);
       
       meta.getNeighbours().put(casanare.getName(),casanare);
       meta.getNeighbours().put(vichada.getName(),vichada);
       
       vichada.getNeighbours().put(meta.getName(),meta);
       vichada.getNeighbours().put(casanare.getName(),casanare);
       vichada.getNeighbours().put(arauca.getName(),arauca);
       
        return region;
    }

    public static Region setUpPacificoRegion() {
        Region region = new Region();
        Department choco= new Department("Choco");
        Department valle= new Department("Valle"); 
        Department cauca= new Department("Cauca");
        Department narino= new Department("Nariño"); 
        
        
            region.getDepartments().put(choco.getName(),choco);
        region.getDepartments().put(valle.getName(),valle);
         region.getDepartments().put(cauca.getName(),cauca);
        region.getDepartments().put(narino.getName(),narino); 
        
        
        
        
       choco.getNeighbours().put(valle.getName(),valle);
       
       
       valle.getNeighbours().put(choco.getName(),choco);
       valle.getNeighbours().put(cauca.getName(),cauca);
       
       
       cauca.getNeighbours().put(valle.getName(),valle);
       cauca.getNeighbours().put(narino.getName(),narino);
       
       narino.getNeighbours().put(cauca.getName(),cauca);
        return region;
    }

}
