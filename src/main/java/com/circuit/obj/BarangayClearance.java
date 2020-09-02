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
public class BarangayClearance {
    
    int id;
    String fullname;
    String surname;
    String firstName;
    String middleName;
    String gender;
    String birthDate;
    String control_no;
    String current_date;
    String age;
    String citizenship;
    String address;
    String barangay;
    String city;
    String remarks;
    String civilStatus;
    String amountPaid;
    int amountChange;
    int regCost;
    int regVat;
    Image profileImage;
    String clearancePurpose;
    String currentAdmin;
    String ORNo;
    String clearanceType;
      
    String barangayName;
    String barangayCapt;
    String barangaySec;
    String barangayTres;
    String barangayKag1;
    String barangayKag2;
    String barangayKag3;
    String barangayKag4;
    String barangayKag5;
    String barangayKag6;
    String barangayKag7;
    
    
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
        this.surname = surname ;
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
        this.data.put("BIRTHDATE", birthDate);
        this.birthDate = birthDate;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.data.put("ADDRESS", address);
        this.address = address;
    }

    public String getBarangay() {
        return barangay;
    }

    public void setBarangay(String barangay) {
        this.data.put("BARANGAY", barangay);
        this.barangay = barangay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.data.put("CITY", city);
        this.city = city;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.data.put("REMARKS", remarks);
        this.remarks = remarks;
    }

    public String getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(String amountPaid) {
        this.data.put("AMOUNT_PAID", amountPaid);
        this.amountPaid = amountPaid;
    }

    public int getAmountChange() {
        return amountChange;
    }

    public void setAmountChange(int amountChange) {
        this.data.put("AMOUNT_CHANGE", amountChange);
        this.amountChange = amountChange;
    }

    public int getRegCost() {
        return regCost;
    }

    public void setRegCost(int regCost) {
        this.data.put("REG_COST",   regCost);
        this.regCost = regCost;
    }

    public int getRegVat() {
        return regVat;
    }

    public void setRegVat(int regVat) {
        this.data.put("REG_VAT", regVat);
        this.regVat = regVat;
    }

    public String getControl_no() {
        return control_no;
    }

    public void setControl_no(String control_no) {
          this.data.put("CONTROL_NO", control_no);
        this.control_no = control_no;
    }

    public String getCurrent_date() {
        return current_date;
    }

    public void setCurrent_date(String current_date) {
          this.data.put("CURRENT_DATE", current_date);
       this.current_date = current_date;
    }

    public Image getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(Image profileImage) {
        this.data.put("PROFILE_IMAGE", profileImage);
        this.profileImage = profileImage;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.data.put("FULL_NAME", fullname);
        this.fullname = fullname;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public void setCivilStatus(String civilStatus) {
        this.data.put("CIVIL_STATUS", civilStatus);
        this.civilStatus = civilStatus;
    }
    

    public String getBarangayName() {
        return barangayName;
    }

    public void setBarangayName(String barangayName) {
        this.data.put("BARANGAY_NAME", barangayName);
        this.barangayName = barangayName;
    }

    public String getBarangayCapt() {
        return barangayCapt;
    }

    public void setBarangayCapt(String barangayCapt) {
        this.data.put("BARANGAY_CAPT", barangayCapt);
        this.barangayCapt = barangayCapt;
    }

    public String getBarangaySec() {
        return barangaySec;
    }

    public void setBarangaySec(String barangaySec) {
        this.data.put("BARANGAY_SEC", barangaySec);
        this.barangaySec = barangaySec;
    }

    public String getBarangayTres() {
        return barangayTres;
    }

    public void setBarangayTres(String barangayTres) {
        this.data.put("BARANGAY_TRES", barangayTres);
        this.barangayTres = barangayTres;
    }

    public String getBarangayKag1() {
        return barangayKag1;
    }

    public void setBarangayKag1(String barangayKag1) {
        this.data.put("BARANGAY_KAGAWAD1", barangayKag1);
        this.barangayKag1 = barangayKag1;
    }

    public String getBarangayKag2() {
        return barangayKag2;
    }

    public void setBarangayKag2(String barangayKag2) {
         this.data.put("BARANGAY_KAGAWAD2", barangayKag2);
        this.barangayKag2 = barangayKag2;
    }

    public String getBarangayKag3() {
        return barangayKag3;
    }

    public void setBarangayKag3(String barangayKag3) {
         this.data.put("BARANGAY_KAGAWAD3", barangayKag3);
        this.barangayKag3 = barangayKag3;
    }

    public String getBarangayKag4() {
        return barangayKag4;
    }

    public void setBarangayKag4(String barangayKag4) {
         this.data.put("BARANGAY_KAGAWAD4", barangayKag4);
        this.barangayKag4 = barangayKag4;
    }

    public String getBarangayKag5() {
        return barangayKag5;
    }

    public void setBarangayKag5(String barangayKag5) {
         this.data.put("BARANGAY_KAGAWAD5", barangayKag5);
        this.barangayKag5 = barangayKag5;
    }

    public String getBarangayKag6() {
        return barangayKag6;
    }

    public void setBarangayKag6(String barangayKag6) {
         this.data.put("BARANGAY_KAGAWAD6", barangayKag6);
        this.barangayKag6 = barangayKag6;
    }

    public String getBarangayKag7() {
        return barangayKag7;
    }

    public void setBarangayKag7(String barangayKag7) {
         this.data.put("BARANGAY_KAGAWAD7", barangayKag7);
        this.barangayKag7 = barangayKag7;
    }

    public String getClearancePurpose() {
        return clearancePurpose;
    }

    public void setClearancePurpose(String clearancePurpose) {
        this.data.put("PURPOSE", clearancePurpose);
        this.clearancePurpose = clearancePurpose;
    }

    public String getCurrentAdmin() {
        return currentAdmin;
    }

    public void setCurrentAdmin(String currentAdmin) {
        this.data.put("CURRENT_ADMIN", currentAdmin);
        this.currentAdmin = currentAdmin;
    }

    public String getORNo() {
        return ORNo;
    }

    public void setORNo(String ORNo) {
        this.data.put("OR_NO", ORNo);
        this.ORNo = ORNo;
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
