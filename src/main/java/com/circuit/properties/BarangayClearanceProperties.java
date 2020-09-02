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
public class BarangayClearanceProperties {
    
    IntegerProperty id;
    StringProperty controlNo;
    StringProperty fullname;
    StringProperty current_date;
    StringProperty barangay;


    public BarangayClearanceProperties(int id, String controlNo, String fullname, String current_date, String barangay){
        this.id = new SimpleIntegerProperty(id);
        this.controlNo = new SimpleStringProperty(controlNo);
        this.fullname = new SimpleStringProperty(fullname);
        this.current_date = new SimpleStringProperty(current_date);  
        this.barangay = new SimpleStringProperty(barangay);  
        
    }

    
    
    public int getId() {
        return id.get();
    }

//    public String getMiddleName() {
//        return middleName.get();
//    }
//
//    public void setMiddleName(String middleName) {
//        this.middleName.set(middleName);
//    }
    public void setId(int id) {
        this.id.set(id);
    }

    public String getControlNo() {
        return controlNo.get();
    }

    public void setId(String controlNo) {
        this.controlNo.set(controlNo);
    }

    public String getFullname() {
        return fullname.get();
    }

    public void setFullname(String fullname) {
        this.fullname.set(fullname);
    }

    public String getCurrent_date() {
        return current_date.get();
    }

    public void setCurrent_date(String current_date) {
        this.current_date.set(current_date);
    }

    public String getBarangay() {
        return barangay.get();
    }

    public void setBarangay(String barangay) {
        this.barangay.set(barangay);
    }
    
    
    
    
    
   
    
    

    /**
     * @param args the command line arguments
     */
   
    
}
