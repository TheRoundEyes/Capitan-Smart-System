/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj.barangayRecordsObj;

import java.sql.Date;

/**
 *
 * @author Marvin
 */
public class BarangayRecords {
    
    int id;
    int ccfNo;
    String name;
    Date birthDate;
    Date transacDate;
    Date reportDate;
    String purpose;
    String metha;
    String tetra;
    String remarks;
    String testAdmin;
    int image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCcfNo() {
        return ccfNo;
    }

    public void setCcfNo(int ccfNo) {
        this.ccfNo = ccfNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getTransacDate() {
        return transacDate;
    }

    public void setTransacDate(Date transacDate) {
        this.transacDate = transacDate;
    }

    public Date getReportDate() {
        return reportDate;
    }

    public void setReportDate(Date reportDate) {
        this.reportDate = reportDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getMetha() {
        return metha;
    }

    public void setMetha(String metha) {
        this.metha = metha;
    }

    public String getTetra() {
        return tetra;
    }

    public void setTetra(String tetra) {
        this.tetra = tetra;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTestAdmin() {
        return testAdmin;
    }

    public void setTestAdmin(String testAdmin) {
        this.testAdmin = testAdmin;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    
    
    
    
}
