/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.WorkingClearance;
import java.util.List;

/**
 *
 * @author Marvin
 */
public interface WorkClearanceService {
    
       public WorkingClearance saveClearance(WorkingClearance workingClearance) throws ServiceException;
       
    public boolean removeClearance(WorkingClearance workingClearance) throws ServiceException;
    
    public BarangayReport generateBarangayReport(WorkingClearance workingClearance) throws ServiceException;
    
       public BarangayReport generateAndSaveBarangayClearanceReport(WorkingClearance workingClearance) throws ServiceException;
       
       public BarangayReport generateAndSaveBarangayClearanceReportReciept(WorkingClearance workingClearance) throws ServiceException;
    
        public List<WorkingClearance> getAllBarangaClearance() throws ServiceException;
        
          public WorkingClearance getBarangayClearanceData(int id) throws ServiceException;
}
