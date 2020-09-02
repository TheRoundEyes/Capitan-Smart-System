/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.BusinessClearance;
import java.util.List;

/**
 *
 * @author Marvin
 */
public interface BusClearanceService {
    
    
      public BusinessClearance saveClearance(BusinessClearance businessClearance) throws ServiceException;
       
    public boolean removeClearance(BusinessClearance businessClearance) throws ServiceException;
    
    public BarangayReport generateBarangayReport(BusinessClearance businessClearance) throws ServiceException;
    
       public BarangayReport generateAndSaveBarangayClearanceReport(BusinessClearance businessClearance) throws ServiceException;
       
       public BarangayReport generateAndSaveBarangayClearanceReportReciept(BusinessClearance businessClearance) throws ServiceException;
    
        public List<BusinessClearance> getAllBarangaClearance() throws ServiceException;
        
          public BusinessClearance getBarangayClearanceData(int id) throws ServiceException;
    
}
