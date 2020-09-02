/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service.impl;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.PedicabClearance;
import com.circuit.service.PedClearance;
import com.circuit.utils.ReportUtility;
import java.util.List;

/**
 *
 * @author Marvin
 */
public class PedClearanceImpl implements  PedClearance {

    @Override
    public PedicabClearance saveClearance(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeClearance(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateBarangayReport(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReport(PedicabClearance pedicabClearance) throws ServiceException {
        BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setPedicabClearance(pedicabClearance);
        barangayClearanceReport.setBusinessClearancePrint(ReportUtility.generatePedClearanceReport(pedicabClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PedicabClearance> getAllBarangaClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PedicabClearance getBarangayClearanceData(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
