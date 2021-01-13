/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkService;
import bean.Vehicule;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ServiceVehicule {
    public Vehicule save(String matricule,String type,ArrayList<Vehicule> vehicule){
        Vehicule v=new Vehicule();
        for (int i = 0; i < vehicule.size(); i++) {
            Vehicule c = vehicule.get(i);
            if(c.getMatricule().equals(matricule)){
            return null;
            }
        }        
        v.setMatricule(matricule);
        v.setModel(type);
        vehicule.add(v);
        return v;
                }
    
    public void vehiculeCaract(String carburant,double kilom,String model,Vehicule v){//vehicule caracterstique//
    v.setCarburant(carburant);
    v.setKilometrage(kilom);
    v.setModel(model);
    }
    public Vehicule findByMatricule(String matr,ArrayList<Vehicule> vehicule){
        for (int i = 0; i < vehicule.size(); i++) {
            Vehicule c = vehicule.get(i);
            if(c.getMatricule().equals(matr)){
            return c;
            }  }
        return null;
    }
   public Vehicule findByType(String type,ArrayList<Vehicule>vehicule){
       for (int i = 0; i < vehicule.size(); i++) {
           Vehicule v = vehicule.get(i);
           if(v.getType().equals(type)){
           return v;}
       }
   return null;
   }
 
    
    
    
    
}

    
    

