/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj;

import java.awt.Image;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marvin
 */
public class WorkingClearance { 
    
    int id;
    String controlNo;
    String currentDate;
    String firstName;
    String middleName;
    String lastName;
    String fullName;
    String birthDate;
    String address;
    String appPos;
    String comAdd;
    String remarks;
    String age;
    String citizenship;
    String civilStat;
    String comName;
    String currentAdmin;
    String barangayKap;
    String barangaySec;
    String gender;
    String barangay;
      String clearanceType;
    
    Image profileImage;

      private Map<String,Object> data = new HashMap<String,Object>();
      
      
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

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
              this.data.put("CURRENT_DATE", currentDate);
        this.currentDate = currentDate;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
              this.data.put("FULL_NAME", fullName);
        this.fullName = fullName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
              this.data.put("BIRTH_DATE", birthDate);
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
              this.data.put("ADDRESS", address);
        
        this.address = address;
    }

    public String getAppPos() {
        return appPos;
    }

    public void setAppPos(String appPos) {
              this.data.put("APPLICATION_POSITION", appPos);
        this.appPos = appPos;
    }

    public String getComAdd() {
        return comAdd;
    }

    public void setComAdd(String comAdd) {
              this.data.put("COMPANY_ADDRESS", comAdd);
        
        this.comAdd = comAdd;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.data.put("REMARKS", remarks);
        this.remarks = remarks;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.data.put("AGE", age);
        this.age = age;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.data.put("CITIZENSHIP", citizenship);
        this.citizenship = citizenship;
    }

    public String getCivilStat() {
        return civilStat;
    }

    public void setCivilStat(String civilStat) {
        this.data.put("CIVIL_STAT", civilStat);
        this.civilStat = civilStat;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.data.put("COMPANY_NAME", comName);
        this.comName = comName;
    }

    public String getCurrentAdmin() {
        return currentAdmin;
    }

    public void setCurrentAdmin(String currentAdmin) {
        this.data.put("CURRENT_ADMIN", currentAdmin);
        this.currentAdmin = currentAdmin;
    }

    public String getBarangayKap() {
        return barangayKap;
    }

    public void setBarangayKap(String barangayKap) {
        this.data.put("BARANGAY_KAP", barangayKap);
        this.barangayKap = barangayKap;
    }

    public String getBarangaySec() {
        return barangaySec;
    }

    public void setBarangaySec(String barangaySec) {
        this.data.put("BARANGAY_SEC", barangaySec);
        this.barangaySec = barangaySec;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.data.put("GENDER", gender);
        this.gender = gender;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.data.put("PROFILE_IMAGE", profileImage);
        this.profileImage = profileImage;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.barangay = barangay;
    }

    public String getClearanceType() {
        return clearanceType;
    }

    public void setClearanceType(String clearanceType) {
        this.clearanceType = clearanceType;
    }
    
    
    
    
    
    
    

    public Map<String, Object> getData() {
        return data;
    }
    
    
    
}
