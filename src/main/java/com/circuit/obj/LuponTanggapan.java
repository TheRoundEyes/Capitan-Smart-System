/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj.luponObj;

import java.sql.Date;

/**
 *
 * @author Marvin
 */
public class LuponTanggapan {
    
    int id;
    String complainantName;
    String complainantAdd;
    int contactNo;
    String purpose;
    String about;
    String respondentName;
    String respondentAdd;
    String complainStatement;
    Date dateIssued;
    Date dateAccept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComplainantName() {
        return complainantName;
    }

    public void setComplainantName(String complainantName) {
        this.complainantName = complainantName;
    }

    public String getComplainantAdd() {
        return complainantAdd;
    }

    public void setComplainantAdd(String complainantAdd) {
        this.complainantAdd = complainantAdd;
    }

    public int getContactNo() {
        return contactNo;
    }

    public void setContactNo(int contactNo) {
        this.contactNo = contactNo;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getRespondentName() {
        return respondentName;
    }

    public void setRespondentName(String respondentName) {
        this.respondentName = respondentName;
    }

    public String getRespondentAdd() {
        return respondentAdd;
    }

    public void setRespondentAdd(String respondentAdd) {
        this.respondentAdd = respondentAdd;
    }

    public String getComplainStatement() {
        return complainStatement;
    }

    public void setComplainStatement(String complainStatement) {
        this.complainStatement = complainStatement;
    }

    public Date getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(Date dateIssued) {
        this.dateIssued = dateIssued;
    }

    public Date getDateAccept() {
        return dateAccept;
    }

    public void setDateAccept(Date dateAccept) {
        this.dateAccept = dateAccept;
    }
    
    
    
    
}
