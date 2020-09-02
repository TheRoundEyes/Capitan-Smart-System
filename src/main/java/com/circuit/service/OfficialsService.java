/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.service;

import com.circuit.exception.ServiceException;
import com.circuit.obj.clearanceobj.BarangayOfficials;

/**
 *
 * @author Marvin
 */
public interface OfficialsService {
    
     public BarangayOfficials addNewOfficial(BarangayOfficials barangayOfficials) throws ServiceException;
    
    public BarangayOfficials removeOfficials(BarangayOfficials barangayOfficials) throws ServiceException;
    
    public BarangayOfficials editOfficials(BarangayOfficials barangayOfficials) throws ServiceException;
    
    public boolean loadOfficials(String barangayName) throws ServiceException;
    
    
}
