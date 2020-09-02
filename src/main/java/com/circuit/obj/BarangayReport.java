/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.obj;

import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Marvin
 */
public class BarangayReport {
       
    
    private int id;
    
    private BarangayClearance barangayClearance = new BarangayClearance();
   
    private BusinessClearance businessClearance = new BusinessClearance();
    
    private WorkingClearance workingClearance = new WorkingClearance();
    
     private PedicabClearance pedicabClearance = new PedicabClearance();
    
    private JasperPrint businessClearancePrint = new JasperPrint();
    
    private JasperPrint barangayClearancePrint = new JasperPrint();
    
    private JasperPrint workingClearancePrint = new JasperPrint();
    
    private JasperPrint pedicabClearancePrint = new JasperPrint();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BarangayClearance getBarangayClearance() {
        return barangayClearance;
    }

    public void setBarangayClearance(BarangayClearance barangayClearance) {
        this.barangayClearance = barangayClearance;
    }

    public JasperPrint getBarangayClearancePrint() {
        return barangayClearancePrint;
    }

    public void setBarangayClearancePrint(JasperPrint barangayClearancePrint) {
        this.barangayClearancePrint = barangayClearancePrint;
    }

    public BusinessClearance getBusinessClearance() {
        return businessClearance;
    }

    public void setBusinessClearance(BusinessClearance businessClearance) {
        this.businessClearance = businessClearance;
    }

    public JasperPrint getBusinessClearancePrint() {
        return businessClearancePrint;
    }

    public void setBusinessClearancePrint(JasperPrint businessClearancePrint) {
        this.businessClearancePrint = businessClearancePrint;
    }

    public WorkingClearance getWorkingClearance() {
        return workingClearance;
    }

    public void setWorkingClearance(WorkingClearance workingClearance) {
        this.workingClearance = workingClearance;
    }

    public JasperPrint getWorkingClearancePrint() {
        return workingClearancePrint;
    }

    public void setWorkingClearancePrint(JasperPrint workingClearancePrint) {
        this.workingClearancePrint = workingClearancePrint;
    }

    public PedicabClearance getPedicabClearance() {
        return pedicabClearance;
    }

    public void setPedicabClearance(PedicabClearance pedicabClearance) {
        this.pedicabClearance = pedicabClearance;
    }

    public JasperPrint getPedicabClearancePrint() {
        return pedicabClearancePrint;
    }

    public void setPedicabClearancePrint(JasperPrint pedicabClearancePrint) {
        this.pedicabClearancePrint = pedicabClearancePrint;
    }
    
    
    
    
    
    
    
    
    
}
