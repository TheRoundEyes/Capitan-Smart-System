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
public class PedicabClearance {
    
    int id;
    String controlNo;
    String ctrNo;
    String plateNo;
    String dateIssued;
    String expiryDate;
    String ownerName;
    String address;
    String gender;
    String birthDate;
    String civilStat;
    String remarks;
    String pedBodNo;
    String sideColor;
    String bikeColor;
    String trapColor;
    String rSide;
    String lSide;
    String frontMark;
    String backMark;
    String barangayKap;
    String currentAdmin;
    String barangay;
    String ORNo;
    String ORDate;
      String clearanceType;
    
     private Map<String,Object> data = new HashMap<String,Object>();

    public Map<String, Object> getData() {
        return data;
    }
     

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getControlNo() {
        return controlNo;
    }

    public void setControlNo(String controlNo) {
          this.data.put("CONTROL_NO", controlNo);
        this.controlNo = controlNo;
    }

    public String getCtrNo() {
        return ctrNo;
    }

    public void setCtrNo(String ctrNo) {
          this.data.put("CTR_NO", ctrNo);
        this.ctrNo = ctrNo;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
          this.data.put("PLATE_NO", plateNo);
        this.plateNo = plateNo;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
          this.data.put("DATE_ISSUED", dateIssued);
        this.dateIssued = dateIssued;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
          this.data.put("EXPIRY_DATE", expiryDate);
        this.expiryDate = expiryDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
          this.data.put("OWNER_NAME", ownerName);
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
          this.data.put("ADDRESS", address);
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
          this.data.put("GENDER", gender);
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
          this.data.put("BIRTH_DATE", birthDate);
        this.birthDate = birthDate;
    }

    public String getCivilStat() {
        return civilStat;
    }

    public void setCivilStat(String civilStat) {
          this.data.put("CIVIL_STAT", civilStat);
        this.civilStat = civilStat;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
          this.data.put("REMARKS", remarks);
        
        this.remarks = remarks;
    }

    public String getPedBodNo() {
        return pedBodNo;
    }

    public void setPedBodNo(String pedBodNo) {
          this.data.put("PED_BOD_NO", pedBodNo);
        
        this.pedBodNo = pedBodNo;
    }

    public String getSideColor() {
        return sideColor;
    }

    public void setSideColor(String sideColor) {
          this.data.put("SIDE_COLOR", sideColor);
        this.sideColor = sideColor;
    }

    public String getBikeColor() {
        return bikeColor;
    }

    public void setBikeColor(String bikeColor) {
          this.data.put("BIKE_COLOR", bikeColor);
        
        this.bikeColor = bikeColor;
    }

    public String getTrapColor() {
        return trapColor;
    }

    public void setTrapColor(String trapColor) {
          this.data.put("TRAP_COLOR", trapColor);
        this.trapColor = trapColor;
    }

    public String getrSide() {
        return rSide;
    }

    public void setrSide(String rSide) {
          this.data.put("R_SIDE", rSide);
        this.rSide = rSide;
    }

    public String getlSide() {
        return lSide;
    }

    public void setlSide(String lSide) {
          this.data.put("L_SIDE", lSide);
        this.lSide = lSide;
    }

    public String getFrontMark() {
        return frontMark;
    }

    public void setFrontMark(String frontMark) {
          this.data.put("FRONT_MARK", frontMark);
        this.frontMark = frontMark;
    }

    public String getBackMark() {
        return backMark;
    }

    public void setBackMark(String backMark) {
          this.data.put("BACK_MARK", backMark);
        this.backMark = backMark;
    }

    public String getBarangayKap() {
        return barangayKap;
    }

    public void setBarangayKap(String barangayKap) {
          this.data.put("BARANGAY_KAP", barangayKap);
        this.barangayKap = barangayKap;
    }

    public String getCurrentAdmin() {
        return currentAdmin;
    }

    public void setCurrentAdmin(String currentAdmin) {
        this.data.put("CURRENT_ADMIN", currentAdmin);
        this.currentAdmin = currentAdmin;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
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

    public String getClearanceType() {
        return clearanceType;
    }

    public void setClearanceType(String clearanceType) {
        this.clearanceType = clearanceType;
    }
    
    
    
    
    
     
     
    
}
