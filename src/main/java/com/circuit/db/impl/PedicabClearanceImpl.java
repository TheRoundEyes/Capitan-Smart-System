/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.intrfc.PedicabClearanceDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.PedicabClearance;
import com.circuit.utils.ReportUtility;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Marvin
 */
public class PedicabClearanceImpl extends DatabaseSource implements PedicabClearanceDatabase {

    @Override
    public PedicabClearance getBarangayClearance(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PedicabClearance> getAllBarangayClearanceInRange(int from, int to) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PedicabClearance> getAllBarangayClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PedicabClearance saveClearance(PedicabClearance pedicabClearance) throws ServiceException {
        PreparedStatement ps;
        
       try
        {
            if(pedicabClearance.getId() == 0)
            {
                String insertSql = ""
                        + "INSERT INTO "
                        + "ped_clearance "
                        + " ("
                        + "ownername, "
                        + "plateNo, "
                        + "controlNo,"
                        + "address,"
                        + "gender, "
                        + "birthdate, "
                        + "civilStat, "
                        + "ctrNo, "
                        + "dateIssued, "
                        + "expiryDate, "
                        + "pedBodNo, "
                        + "sideColor, "
                        + "bikeColor, "
                        + "trapColor, "
                        + "rSide, "
                        + "lSide, "
                        + "frontMark, "
                        + "backMark, "
                        + "barangayKap, "
                        + "remarks, "
                        + "currentAdmin, "
                        + "barangay, "
                        + "clearanceType"
                        + ")"
                        + "VALUES "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, pedicabClearance.getOwnerName());
                ps.setString(2, pedicabClearance.getPlateNo());
                ps.setString(3, pedicabClearance.getControlNo());
                ps.setString(4, pedicabClearance.getAddress());
                ps.setString(5, pedicabClearance.getGender());
                ps.setString(6, pedicabClearance.getBirthDate());
                ps.setString(7, pedicabClearance.getCivilStat());
                ps.setString(8, pedicabClearance.getCtrNo());
                ps.setString(9, pedicabClearance.getDateIssued());
                ps.setString(10, pedicabClearance.getExpiryDate());
                ps.setString(11, pedicabClearance.getPedBodNo());
                ps.setString(12, pedicabClearance.getSideColor());
                ps.setString(13, pedicabClearance.getBikeColor());
                ps.setString(14, pedicabClearance.getTrapColor());
                ps.setString(15, pedicabClearance.getrSide());
                ps.setString(16, pedicabClearance.getlSide());
                ps.setString(17, pedicabClearance.getFrontMark());
                ps.setString(18, pedicabClearance.getBackMark());
                ps.setString(19, pedicabClearance.getBarangayKap());
                ps.setString(20, pedicabClearance.getRemarks());
                ps.setString(21, pedicabClearance.getCurrentAdmin());
                ps.setString(22, pedicabClearance.getBarangay());
                ps.setString(23, pedicabClearance.getClearanceType());
               
              
            }
            else
            {
                 String updateSQL = ""
                        + "UPDATE "
                        + "bgy_clearance "
                        + "SET "
                        + "ownername = ?, "
                        + "plateNo = ?, "
                        + "controlNo = ?,"
                         + "address = ?, "
                        + "birthdate = ?, "
                        + "civilStat = ?, "
                        + "ctrNo = ?, "
                        + "dateIssued = ?, "
                        + "expiryDate = ?, "
                        + "pedBodNo = ?, "
                        + "sideColor = ?, "
                        + "bikeColor = ?, "
                        + "trapColor = ?, "
                        + "rSide = ?, "
                        + "lSide = ?, "
                        + "frontMark = ?,"
                         + "backMark = ?,"
                         + "barangayKap = ?,"
                         + "civilStatus = ?,"
                         + "remarks = ?,"
                         + "currentAdmin = ?,"
                         + "barangay = ?,"
                         + "WHERE "
                         + "id = ?";
 
                
                ps = this.getConnection().prepareStatement(updateSQL);
                 ps.setString(1, pedicabClearance.getOwnerName());
                ps.setString(2, pedicabClearance.getPlateNo());
                ps.setString(3, pedicabClearance.getControlNo());
                ps.setString(4, pedicabClearance.getAddress());
                ps.setString(5, pedicabClearance.getBirthDate());
                ps.setString(6, pedicabClearance.getCivilStat());
                ps.setString(7, pedicabClearance.getCtrNo());
                ps.setString(8, pedicabClearance.getDateIssued());
                ps.setString(9, pedicabClearance.getExpiryDate());
                ps.setString(10, pedicabClearance.getCtrNo());
                ps.setString(11, pedicabClearance.getPedBodNo());
                ps.setString(12, pedicabClearance.getSideColor());
                ps.setString(13, pedicabClearance.getBikeColor());
                ps.setString(14, pedicabClearance.getrSide());
                ps.setString(15, pedicabClearance.getlSide());
                ps.setString(16, pedicabClearance.getFrontMark());
                ps.setString(17, pedicabClearance.getBackMark());
                ps.setString(18, pedicabClearance.getBarangayKap());
                ps.setString(19, pedicabClearance.getRemarks());
                ps.setString(20, pedicabClearance.getCurrentAdmin());
                ps.setString(21, pedicabClearance.getBarangay());
                ps.setString(22, pedicabClearance.getClearanceType());
             
            }
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(PedicabClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  pedicabClearance;
    }

    @Override
    public boolean removeClearance(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PedicabClearance generateBarangayReport(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayReport(PedicabClearance pedicabClearance) throws ServiceException {
         BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setPedicabClearance(pedicabClearance);
        barangayClearanceReport.setPedicabClearancePrint(ReportUtility.generatePedClearanceReport(pedicabClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(PedicabClearance pedicabClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperReport showReport(PedicabClearance pedicabClearance) throws ServiceException {
       JasperViewer jv;
        jv = new JasperViewer(generateAndSaveBarangayReport(pedicabClearance).getPedicabClearancePrint(),false);
                  jv.setExtendedState(JasperViewer.NORMAL);
                  jv.setDefaultCloseOperation(HIDE_ON_CLOSE);
                  jv.setVisible(true);
                  
  
        return null;
    }

    @Override
    public void VideoFeedTaker() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void startStream() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validateRecord(String controlNo) throws ServiceException {
      PreparedStatement preparedStatement;
         ResultSet resultSet;
         
        
        String validateQuery = "SELECT * FROM ped_clearance WHERE controlNo = '" + controlNo + "'";
        try
        {
            
            //Statement st = this.getConnection().createStatement();
            preparedStatement = this.getConnection().prepareStatement(validateQuery);
            resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next())
            {
                    return true; 
           }
            else
            {
                return false;
            }
    
    }   catch (SQLException ex) {
            Logger.getLogger(WorkingClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
