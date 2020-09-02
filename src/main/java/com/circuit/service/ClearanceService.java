/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.BarangayReport;
import java.util.List;

/**
 *
 * @author Marvin
 */
public interface ClearanceService {
    
      public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws ServiceException;
       
    public boolean removeClearance(BarangayClearance barangayClearance) throws ServiceException;
    
    public BarangayReport generateBarangayReport(BarangayClearance barangayClearance) throws ServiceException;
    
       public BarangayReport generateAndSaveBarangayClearanceReport(BarangayClearance barangayClearance) throws ServiceException;
       
       public BarangayReport generateAndSaveBarangayClearanceReportReciept(BarangayClearance barangayClearance) throws ServiceException;
    
        public List<BarangayClearance> getAllBarangaClearance() throws ServiceException;
        
          public BarangayClearance getBarangayClearanceData(int id) throws ServiceException;
    
}
