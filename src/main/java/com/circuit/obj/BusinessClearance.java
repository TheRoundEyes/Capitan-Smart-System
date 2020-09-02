/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marvin
 */
public class BusinessClearance {
    
    int id;
    String surname;
    String firstName;
    String middleName;
    String businessName;
    String businessAddres;
    String businessType;
    String buildingType;
    String ownershipType;
    String clearanceFee;
    String applicationType;
    String fullName;
    String ctrlNo;
    String plateNo;
    String ORNo;
    String ORDate;
    String brgyCapt;
    String barangay;
    String currentDate;
    String clearanceType;
    
    
    
    
    private Map<String,Object> data = new HashMap<String,Object>();
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        
        return surname;
    }

    public void setSurname(String surname) {
        this.data.put("SURNAME", surname);
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.data.put("FIRSTNAME", firstName);
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.data.put("MIDDLENAME", middleName);
        this.middleName = middleName;
    }


    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.data.put("BUSINESS_NAME", businessName);
        this.businessName = businessName;
    }

    public String getBusinessAddres() {
        return businessAddres;
    }

    public void setBusinessAddres(String businessAddres) {
        this.data.put("BUSINESS_ADDRES", businessAddres);
        this.businessAddres = businessAddres;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.data.put("BUSINESS_TYPE", businessType);
        this.businessType = businessType;
    }

   
    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.data.put("BUILDING_TYPE", buildingType);
        this.buildingType = buildingType;
    }

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.data.put("OWNERSHIP_TYPE", ownershipType);
        this.ownershipType = ownershipType;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
         this.data.put("FULLNAME", fullName);
        this.fullName = fullName;
    }

    public String getClearanceFee() {
        return clearanceFee;
    }

    public void setClearanceFee(String clearanceFee) {
        this.data.put("CLEARANCE_FEE", clearanceFee);
        this.clearanceFee = clearanceFee;
    }

    public String getApplicationType() {
        return applicationType;
    }

    public void setApplicationType(String applicationType) {
        this.data.put("APPLICATION_TYPE", applicationType);
        this.applicationType = applicationType;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
         this.data.put("PLATE_NO", plateNo);
        this.plateNo = plateNo;
    }

    public String getORNo() {
        return ORNo;
    }

    public void setORNo(String ORNo) {
         this.data.put("OR_NO", ORNo);
        this.ORNo = ORNo;
    }

    public String getORDate() {
        return ORDate;
    }

    public void setORDate(String ORDate) {
         this.data.put("OR_DATE", ORDate);
        this.ORDate = ORDate;
    }

    public String getBrgyCapt() {
        return brgyCapt;
    }

    public void setBrgyCapt(String brgyCapt) {
        this.data.put("BRGY_CAPT", brgyCapt);
        this.brgyCapt = brgyCapt;
    }

    public String getCtrlNo() {
        return ctrlNo;
    }

    public void setCtrlNo(String ctrlNo) {
        this.data.put("CTRL_NO", ctrlNo);
        this.ctrlNo = ctrlNo;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
         this.data.put("CURRENT_DATE", currentDate);
        this.currentDate = currentDate;
    }

    public String getClearanceType() {
        return clearanceType;
    }

    public void setClearanceType(String clearanceType) {
        this.clearanceType = clearanceType;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
     public Map<String,Object> getData()
    {
        
        return data;
    }
    
}
