/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj.clearanceobj;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marvin
 */
public class BarangayOfficials {
    
   
    
    int id;
    
    private Map<String,Object> data = new HashMap<String,Object>();
     
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


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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


 
    
    

   

    
       public Map<String, Object> getData() {
        return data;
    }
}
