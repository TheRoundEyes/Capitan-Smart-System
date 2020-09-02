/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.intrfc;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.WorkingClearance;
import java.util.List;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Marvin
 */
public interface WorkingClearanceDatabase {
    
      public WorkingClearance getBarangayClearance(int id) throws ServiceException;
    
    public List<WorkingClearance> getAllBarangayClearanceInRange(int from, int to) throws ServiceException;
    
    public List<WorkingClearance> getAllBarangayClearance() throws ServiceException;
    
    public WorkingClearance saveClearance(WorkingClearance workingClearance) throws ServiceException;
    
    public boolean removeClearance(WorkingClearance workingClearance) throws ServiceException;
    
    public WorkingClearance generateBarangayReport(WorkingClearance workingClearance) throws ServiceException;
    
    
    public BarangayReport generateAndSaveBarangayReport(WorkingClearance  workingClearance) throws ServiceException;
    
     public BarangayReport generateAndSaveBarangayClearanceReportReciept(WorkingClearance workingClearance) throws ServiceException;
     
     public JasperReport showReport(WorkingClearance workingClearance) throws ServiceException;
     
    public void VideoFeedTaker() throws ServiceException;
    
    public void startStream() throws ServiceException;
    
    public boolean validateRecord(String controlNo) throws ServiceException;
}
