/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.properties;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Marvin
 */
public class AdminProperties {
    
    
    IntegerProperty idNo;
    StringProperty fullname;
    StringProperty position;
    StringProperty currentBarangay;
    BooleanProperty isLoggedIn;

    public AdminProperties(int idNo, String fullname, String position, String currentBarangay, boolean isLoggedIn) {
        this.idNo = new SimpleIntegerProperty(idNo);
        this.fullname = new SimpleStringProperty(fullname);
        this.position = new SimpleStringProperty(position);
        this.currentBarangay = new SimpleStringProperty(currentBarangay);
        this.isLoggedIn = new SimpleBooleanProperty(isLoggedIn);
    }

    public int getIdNo() {
        return idNo.get();
    }

    public void setIdNo(int idNo) {
        this.idNo.set(idNo);
    }

    public String getFullname() {
        return fullname.get();
    }

    public void setFullname(String fullname) {
        this.fullname.set(fullname);
    }

    public String getPosition() {
        return position.get();
    }

    public void setPosition(String position) {
        this.position.set(position);
    }

    public String getCurrentBarangay() {
        return currentBarangay.get();
    }

    public void setCurrentBarangay(String currentBarangay) {
        this.currentBarangay.set(currentBarangay);
    }

    public boolean getIsLoggedIn() {
        return isLoggedIn.get();
    }

    public void setIsLoggedIn(boolean isLoggedIn) {
        this.isLoggedIn.set(isLoggedIn);
    }
    
    
    
    
    
    
    
    
    
    
}
