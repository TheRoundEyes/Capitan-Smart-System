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
public class BusinessClearanceProperties {
    
    IntegerProperty id;
    StringProperty controlNo;
    StringProperty fullName;
    StringProperty businessName;
    StringProperty barangay;

    public BusinessClearanceProperties( String controlNo, String fullName, String businessName) {
       
        this.controlNo = new SimpleStringProperty(controlNo);
        this.fullName = new SimpleStringProperty(fullName);
        this.businessName = new SimpleStringProperty(businessName);  
    }
    
    

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getControlNo() {
        return controlNo.get();
    }

    public void setControlNo(String controlNo) {
        this.controlNo.set(controlNo);
    }

    public String getFullName() {
        return fullName.get();
    }

    public void setFullName(String fullName) {
        this.fullName.set(fullName);
    }

    public String getBusinessName() {
        return businessName.get();
    }

    public void setBusinessName(String businessName) {
        this.businessName.set(businessName);
    }

    public String getBarangay() {
        return barangay.get();
    }

    public void setBarangay(String barangay) {
        this.barangay.set(barangay);
    }
    
    
    
    
}
