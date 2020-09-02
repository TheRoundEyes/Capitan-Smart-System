/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service.impl;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.WorkingClearance;
import com.circuit.service.WorkClearanceService;
import com.circuit.utils.ReportUtility;
import java.util.List;

/**
 *
 * @author Marvin
 */
public class WorkClearanceImpl  implements  WorkClearanceService{

    @Override
    public WorkingClearance saveClearance(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeClearance(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateBarangayReport(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReport(WorkingClearance workingClearance) throws ServiceException {
        BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setWorkingClearance(workingClearance);
        barangayClearanceReport.setBusinessClearancePrint(ReportUtility.generateWorkClearanceReport(workingClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WorkingClearance> getAllBarangaClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WorkingClearance getBarangayClearanceData(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
