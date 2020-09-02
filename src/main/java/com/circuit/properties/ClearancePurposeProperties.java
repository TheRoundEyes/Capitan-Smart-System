/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.properties;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Marvin
 */
public class ClearancePurposeProperties {
    
    IntegerProperty id;
    StringProperty purpose;
    StringProperty cost;
    

    public ClearancePurposeProperties(int id, String purpose, String cost) {
        this.id = new SimpleIntegerProperty(id);
        this.purpose = new SimpleStringProperty(purpose);
        this.cost = new SimpleStringProperty(cost);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }
    
    

    
    

    public String getPurpose() {
        return purpose.get();
    }

    public void setPurpose(String purpose) {
        this.purpose.set(purpose);
    }

    public String getCost() {
        return cost.get();
    }

    public void setCost(String cost) {
        this.cost.set(cost);
    }
    
    
    
    
    
}
