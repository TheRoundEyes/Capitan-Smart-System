/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj.treasuryObj;

/**
 *
 * @author Marvin
 */
public class PayrollDetails {
    
    int id;
    String firstName;
    String lastName;
    String middleName;
    String fullName;
    String position;
    String honoraria;
    int tax;
    int absenses;
    int total;
    int netAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHonoraria() {
        return honoraria;
    }

    public void setHonoraria(String honoraria) {
        this.honoraria = honoraria;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getAbsenses() {
        return absenses;
    }

    public void setAbsenses(int absenses) {
        this.absenses = absenses;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(int netAmount) {
        this.netAmount = netAmount;
    }
    
    
    
    
}
