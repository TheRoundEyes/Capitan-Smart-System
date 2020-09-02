/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.PedicabClearance;
import java.util.List;

/**
 *
 * @author Marvin
 */
public interface PedClearance {
    
    
         public PedicabClearance saveClearance(PedicabClearance pedicabClearance) throws ServiceException;
       
    public boolean removeClearance(PedicabClearance pedicabClearance) throws ServiceException;
    
    public BarangayReport generateBarangayReport(PedicabClearance pedicabClearance) throws ServiceException;
    
       public BarangayReport generateAndSaveBarangayClearanceReport(PedicabClearance pedicabClearance) throws ServiceException;
       
       public BarangayReport generateAndSaveBarangayClearanceReportReciept(PedicabClearance pedicabClearance) throws ServiceException;
    
        public List<PedicabClearance> getAllBarangaClearance() throws ServiceException;
        
          public PedicabClearance getBarangayClearanceData(int id) throws ServiceException;
    
}
