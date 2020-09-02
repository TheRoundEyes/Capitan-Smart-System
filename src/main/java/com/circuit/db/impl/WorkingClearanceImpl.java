/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.intrfc.WorkingClearanceDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.WorkingClearance;
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
public class WorkingClearanceImpl extends DatabaseSource implements WorkingClearanceDatabase {

    @Override
    public WorkingClearance getBarangayClearance(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WorkingClearance> getAllBarangayClearanceInRange(int from, int to) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<WorkingClearance> getAllBarangayClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WorkingClearance saveClearance(WorkingClearance workingClearance) throws ServiceException {
        PreparedStatement ps;

        try
        {
            if(workingClearance.getId() == 0)
            {
                String insertSql = ""
                        + "INSERT INTO "
                        + "work_clearance "
                        + " ("
                        + "fullname, "
                        + "lastName, "
                        + "firstName, "
                        + "middleName, "
                        + "ctrlNo, "
                        + "birthdate, "
                        + "address, "
                        + "appPos, "
                        + "comAdd, "
                        + "remarks, "
                        + "age, "
                        + "citizenship, "
                        + "civilstat, "
                        + "currentAdmin, "
                        + "currentDate, "
                        + "comName, "
                        + "gender, "
                        + "barangay, "
                        + "barangayKap, "
                        + "barangaySec,"
                        + "clearanceType "
                        + ")"
                        + "VALUES "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, workingClearance.getFullName());
                ps.setString(2, workingClearance.getLastName());
                ps.setString(3, workingClearance.getFirstName());
                ps.setString(4, workingClearance.getMiddleName());
                ps.setString(5, workingClearance.getControlNo());
                ps.setString(6, workingClearance.getBirthDate());
                ps.setString(7, workingClearance.getAddress());
                ps.setString(8, workingClearance.getAppPos());
                ps.setString(9, workingClearance.getComAdd());
                ps.setString(10, workingClearance.getRemarks());
                ps.setString(11, workingClearance.getAge());
                ps.setString(12, workingClearance.getCitizenship());
                ps.setString(13, workingClearance.getCivilStat());
                ps.setString(14, workingClearance.getCurrentAdmin());
                ps.setString(15, workingClearance.getCurrentDate());
                ps.setString(16, workingClearance.getComName());  
                ps.setString(17, workingClearance.getGender());
                ps.setString(18, workingClearance.getBarangay());
                ps.setString(19, workingClearance.getBarangayKap());
                ps.setString(20, workingClearance.getBarangaySec());
                ps.setString(21, workingClearance.getClearanceType());
                ps.execute();
                ps.close();
            }
            else
            {
                String updateSql = ""
                        + "UPDATE "
                        + "work_clearance "
                        + "SET "
                         + "fullname = ?, "
                        + "lastName = ?, "
                        + "firstName = ?, "
                        + "middleName = ?, "
                        + "ctrlNo = ?, "
                        + "birthdate = ?, "
                        + "address = ?, "
                        + "appPos = ?, "
                        + "comAdd = ?, "
                        + "remarks = ?, "
                        + "age = ?, "
                        + "citizenship = ?, "
                        + "civilstat = ?, "
                        + "currentAdmin = ?, "
                        + "currentDate = ?, "
                        + "comName = ?"
                        + "WHERE "
                        + "id = ?";
                ps = this.getConnection().prepareStatement(updateSql);
                ps.setString(1, workingClearance.getFullName());
                ps.setString(2, workingClearance.getLastName());
                ps.setString(3, workingClearance.getFirstName());
                ps.setString(4, workingClearance.getMiddleName());
                ps.setString(5, workingClearance.getControlNo());
                ps.setString(6, workingClearance.getBirthDate());
                ps.setString(7, workingClearance.getAddress());
                ps.setString(8, workingClearance.getAppPos());
                ps.setString(9, workingClearance.getComAdd());
                ps.setString(10, workingClearance.getRemarks());
                ps.setString(11, workingClearance.getAge());
                ps.setString(12, workingClearance.getCitizenship());
                ps.setString(13, workingClearance.getCivilStat());
                ps.setString(14, workingClearance.getCurrentAdmin());
                ps.setString(15, workingClearance.getCurrentDate());
                ps.setString(16, workingClearance.getComName());
                ps.setInt(17, workingClearance.getId());
                ps.executeUpdate();
                ps.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(WorkingClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return workingClearance;
    }

    @Override
    public boolean removeClearance(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public WorkingClearance generateBarangayReport(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayReport(WorkingClearance workingClearance) throws ServiceException {
         BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setWorkingClearance(workingClearance);
        barangayClearanceReport.setWorkingClearancePrint(ReportUtility.generateWorkClearanceReport(workingClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(WorkingClearance workingClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public JasperReport showReport(WorkingClearance workingClearance) throws ServiceException {
         JasperViewer jv;
        jv = new JasperViewer(generateAndSaveBarangayReport(workingClearance).getWorkingClearancePrint(),false);
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
         
        
        String validateQuery = "SELECT * FROM work_clearance WHERE ctrlNo = '" + controlNo + "'";
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
