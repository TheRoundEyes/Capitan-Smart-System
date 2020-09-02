/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service.impl;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.BarangayReport;
import com.circuit.service.ClearanceService;
import com.circuit.utils.ReportUtility;
import java.util.List;

/**
 *
 * @author Marvin
 */
public class ClearanceServiceImpl implements ClearanceService{

    @Override
    public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeClearance(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateBarangayReport(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReport(BarangayClearance barangayClearance) throws ServiceException {
       BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setBarangayClearance(barangayClearance);
        barangayClearanceReport.setBarangayClearancePrint(ReportUtility.generateJasperPrintReport(barangayClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BarangayClearance> getAllBarangaClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayClearance getBarangayClearanceData(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
