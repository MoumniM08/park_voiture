/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkService;
import bean.OperationVehicule;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ServiceOperation {
     public int operationVehic(String matricule,double mont,String typOper,ArrayList<OperationVehicule>vehicule){
         OperationVehicule v=new OperationVehicule();
         for (int i = 0; i < vehicule.size(); i++) {
             OperationVehicule c = vehicule.get(i);
             if(c.getMatriculeVehicule().equals(matricule)){
             return -1;
             }
         }
         v.setMontantPayee(mont);
         v.setTypeOperation(typOper);
         vehicule.add(v);
         return 1;
    }
     
    
    
    
    
}
