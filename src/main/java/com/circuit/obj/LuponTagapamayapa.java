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
public class LuponTagapamayapa {
    
    int id;
    String complainantName;
    String complainantAdd;
    String respondentName;
    String respondentAdd;
    int brgyCaseNo;
    String purpose;
    Date currentDate;
    Date currentTime;
    String statement;
    Date hearingSched;
    String hearingLoc;

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

    public int getBrgyCaseNo() {
        return brgyCaseNo;
    }

    public void setBrgyCaseNo(int brgyCaseNo) {
        this.brgyCaseNo = brgyCaseNo;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public Date getHearingSched() {
        return hearingSched;
    }

    public void setHearingSched(Date hearingSched) {
        this.hearingSched = hearingSched;
    }

    public String getHearingLoc() {
        return hearingLoc;
    }

    public void setHearingLoc(String hearingLoc) {
        this.hearingLoc = hearingLoc;
    }
    
    
    
    
}
