/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service.impl;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.BusinessClearance;
import com.circuit.service.BusClearanceService;
import com.circuit.utils.ReportUtility;
import java.util.List;

/**
 *
 * @author Marvin
 */
public class BusClearanceServiceImpl implements BusClearanceService {

    @Override
    public BusinessClearance saveClearance(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeClearance(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateBarangayReport(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReport(BusinessClearance businessClearance) throws ServiceException {
        BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setBusinessClearance(businessClearance);
        barangayClearanceReport.setBusinessClearancePrint(ReportUtility.generateBusClearanceReport(businessClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BusinessClearance> getAllBarangaClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusinessClearance getBarangayClearanceData(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
