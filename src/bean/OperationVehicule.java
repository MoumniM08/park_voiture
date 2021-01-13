/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author LENOVO
 */
public class OperationVehicule {
    private String matriculeVehicule;
    private String typeOperation;
    private double montantPayee;
    private String dateOperation;

    public String getMatriculeVehicule() {
        return matriculeVehicule;
    }

    public void setMatriculeVehicule(String matriculeVehicule) {
        this.matriculeVehicule = matriculeVehicule;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public double getMontantPayee() {
        return montantPayee;
    }

    public void setMontantPayee(double montantPayee) {
        this.montantPayee = montantPayee;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public OperationVehicule(String matriculeVehicule, String typeOperation, double montantPayee, String dateOperation) {
        this.matriculeVehicule = matriculeVehicule;
        this.typeOperation = typeOperation;
        this.montantPayee = montantPayee;
        this.dateOperation = dateOperation;
    }

    public OperationVehicule() {
    }

    public OperationVehicule(String matriculeVehicule, String typeOperation, double montantPayee) {
        this.matriculeVehicule = matriculeVehicule;
        this.typeOperation = typeOperation;
        this.montantPayee = montantPayee;
    }

    @Override
    public String toString() {
        return "OperationVehicule{" + "matriculeVehicule=" + matriculeVehicule + ", typeOperation=" + typeOperation + ", montantPayee=" + montantPayee + ", dateOperation=" + dateOperation + '}';
    }

    
}
