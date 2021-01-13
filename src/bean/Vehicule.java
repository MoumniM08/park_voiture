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
public class Vehicule {
    private String matricule;
    private String model;
    private String type;
    private String carburant;
    private double kilometrage;

    public String getMatricule() {  
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarburant() {
        return carburant;
    }

    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public Vehicule(String matricule, String model, String type, String carburant, double kilometrage) {
        this.matricule = matricule;
        this.model = model;
        this.type = type;
        this.carburant = carburant;
        this.kilometrage = kilometrage;
    }

    public Vehicule() {
    }

    @Override
    public String toString() {
        return "Vehicule{" + "matricule=" + matricule + ", model=" + model + ", type=" + type + ", carburant=" + carburant + ", kilometrage=" + kilometrage + '}';
    }
    
    
    
}
