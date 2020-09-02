/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.intrfc;

import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.capitanObj.Admin;
import com.circuit.obj.clearanceobj.BarangayOfficials;
import com.circuit.obj.clearanceobj.ClearancePurpose;
import com.circuit.obj.clearanceobj.ClearanceRemarks;
import com.circuit.properties.ClearancePurposeProperties;
import com.circuit.properties.ClearanceRemarksProperties;
import java.sql.ResultSet;
import javafx.collections.ObservableList;

/**
 *
 * @author Marvin
 */
public interface ConfigurationDatabase {
    
    
    
    public ObservableList<ClearancePurposeProperties> loadPurposeTable() throws ServiceException;
    
     public ObservableList<ClearanceRemarksProperties> loadRemarksTable() throws ServiceException;
    
     public BarangayClearance editOfficials(BarangayClearance barangayClearance) throws ServiceException;
  
     
     public ResultSet loadOfficials(String barangayName) throws ServiceException;
     
     public BarangayOfficials removeOfficials(BarangayOfficials barangayOfficials) throws ServiceException;
     
     public ResultSet loadAdmin(int id) throws ServiceException;
    
     public Admin editAdmin(Admin admin) throws ServiceException;
     

     
     public Admin removeAdmin(Admin admin) throws ServiceException;
     
     public ClearanceRemarks saveRemarks(ClearanceRemarks clearanceRemarks) throws ServiceException;
     
     public ClearanceRemarks deleteRemarks(ClearanceRemarks clearanceRemarks) throws ServiceException;
     
     public ClearancePurpose savePurpose(ClearancePurpose clearancePurpose)  throws ServiceException;
     
     public ClearancePurpose deletePurpose(ClearancePurpose clearancePurpose) throws ServiceException;
     
     
     
}
