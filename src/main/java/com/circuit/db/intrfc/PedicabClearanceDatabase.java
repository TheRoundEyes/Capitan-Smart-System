/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.intrfc;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.PedicabClearance;
import java.util.List;
import net.sf.jasperreports.engine.JasperReport;

/**
 *
 * @author Marvin
 */
public interface PedicabClearanceDatabase {
    
      public PedicabClearance getBarangayClearance(int id) throws ServiceException;
    
    public List<PedicabClearance> getAllBarangayClearanceInRange(int from, int to) throws ServiceException;
    
    public List<PedicabClearance> getAllBarangayClearance() throws ServiceException;
    
    public PedicabClearance saveClearance(PedicabClearance pedicabClearance) throws ServiceException;
    
    public boolean removeClearance(PedicabClearance pedicabClearance) throws ServiceException;
    
    public PedicabClearance generateBarangayReport(PedicabClearance pedicabClearance) throws ServiceException;
    
    
    public BarangayReport generateAndSaveBarangayReport(PedicabClearance  pedicabClearance) throws ServiceException;
    
     public BarangayReport generateAndSaveBarangayClearanceReportReciept(PedicabClearance pedicabClearance) throws ServiceException;
     
     public JasperReport showReport(PedicabClearance pedicabClearance) throws ServiceException;
     
    public void VideoFeedTaker() throws ServiceException;
    
    public void startStream() throws ServiceException;
    
    public boolean validateRecord(String controlNo) throws ServiceException;
    
}
