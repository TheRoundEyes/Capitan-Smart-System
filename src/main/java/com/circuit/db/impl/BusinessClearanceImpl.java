/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.SqlConnect;
import com.circuit.db.intrfc.BusinessClearanceDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.main.MainController;
import com.circuit.obj.BarangayReport;
import com.circuit.obj.BusinessClearance;
import com.circuit.obj.clearanceobj.BarangayOfficials;
import com.circuit.obj.capitanObj.UserContext;
import com.circuit.properties.BusinessClearanceProperties;
import com.circuit.utils.ReportUtility;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Marvin
 */
public class BusinessClearanceImpl extends DatabaseSource implements BusinessClearanceDatabase{

    @Override
    public BusinessClearance getBusinessClearance(int id) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BusinessClearance> getAllBusinessClearanceInRange(int from, int to) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BusinessClearance> getAllBusinessClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusinessClearance saveClearance(BusinessClearance businessClearance) throws ServiceException {
      PreparedStatement ps;
      
        
        try
        {
            if(businessClearance.getId() == 0)
            {
                String insertSql = ""
                        + "INSERT INTO "
                        + "bus_clearance "
                        + " ("
                        + "controlNo,"
                        + "surname, "
                        + "firstname, "
                        + "middlename,"
                        + "fullname, "
                        + "businessName, "
                        + "businessAdd, "
                        + "businessType, "
                        + "isNew, "
                        + "buildingType, "
                        + "ownershipType, "
                        + "clearanceFee, "
                        + "plateNo, "
                        + "ORNo, "
                        + "ORDate, "
                        + "brgyCapt,"
                        + "barangay,"
                        + "currentDate,"
                        + "clearanceType"
                        + ")"
                        + "VALUES "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, businessClearance.getCtrlNo());
                ps.setString(2, businessClearance.getSurname());
                ps.setString(3, businessClearance.getFirstName());
                ps.setString(4, businessClearance.getMiddleName());
                ps.setString(5, businessClearance.getFullName());
                ps.setString(6, businessClearance.getBusinessName());
                ps.setString(7, businessClearance.getBusinessAddres());
                ps.setString(8, businessClearance.getBusinessType());
                ps.setString(9, businessClearance.getApplicationType());
                ps.setString(10, businessClearance.getBuildingType());
                ps.setString(11, businessClearance.getOwnershipType());
                ps.setString(12, businessClearance.getClearanceFee());
                ps.setString(13, businessClearance.getPlateNo());
                ps.setString(14, businessClearance.getORNo());
                ps.setString(15, businessClearance.getORDate());
                ps.setString(16, businessClearance.getBrgyCapt());
                ps.setString(17, businessClearance.getBarangay());
                ps.setString(18, businessClearance.getCurrentDate());
                ps.setString(19, businessClearance.getClearanceType());
               
                           }
            else
            {
                 String updateSQL = ""
                        + "UPDATE "
                        + "bus_clearance "
                        + "SET "
                        + "controlNo = ?,"
                        + "surname = ?, "
                        + "firstname =?,"
                        + "middlename = ?,"
                        + "fullname = ?,"
                        + "businessName = ?,"
                        + "businessAdd = ?,"
                        + "businessType = ?,"
                        + "isNew = ?,"
                        + "buildingType = ?,"
                        + "ownershipType = ?,"
                        + "clearanceFee = ?,"
                        + "plateNo = ?,"
                        + "ORNo = ?,"
                        + "ORDate = ?,"
                        + "brgyCapt = ?,"
                        + "barangay = ?,"
                        + "currentDate = ?,"
                        + "clearanceType = ?"
                         + "WHERE "
                         + "id = ?";
 
                
                ps = this.getConnection().prepareStatement(updateSQL);
                 ps.setString(1, businessClearance.getCtrlNo());
                ps.setString(2, businessClearance.getSurname());
                ps.setString(3, businessClearance.getFirstName());
                ps.setString(4, businessClearance.getMiddleName());
                ps.setString(5, businessClearance.getFullName());
                ps.setString(6, businessClearance.getBusinessName());
                ps.setString(7, businessClearance.getBusinessAddres());
                ps.setString(8, businessClearance.getBusinessType());
                ps.setString(9, businessClearance.getApplicationType());
                ps.setString(10, businessClearance.getBuildingType());
                ps.setString(11, businessClearance.getOwnershipType());
                ps.setString(12, businessClearance.getClearanceFee());
                ps.setString(13, businessClearance.getPlateNo());
                ps.setString(14, businessClearance.getORNo());
                ps.setString(15, businessClearance.getORDate());
                ps.setString(16, businessClearance.getBrgyCapt());
                ps.setString(17, businessClearance.getBarangay());
                ps.setString(18, businessClearance.getCurrentDate());
                ps.setString(19, businessClearance.getClearanceType());
            }
            ps.execute();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(BarangayClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  businessClearance;
    }

    @Override
    public boolean removeClearance(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BusinessClearance generateBarangayReport(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayReport(BusinessClearance businessClearance) throws ServiceException {
         BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setBusinessClearance(businessClearance);
        barangayClearanceReport.setBusinessClearancePrint(ReportUtility.generateBusClearanceReport(businessClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(BusinessClearance businessClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList<BusinessClearanceProperties> loadTable() throws ServiceException {
       ObservableList<BusinessClearanceProperties> data = FXCollections.observableArrayList();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM bus_clearance WHERE barangay = '" + UserContext.getCurrentBarangay() + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.add(new BusinessClearanceProperties(
                rs.getString(2),
                rs.getString(6),
                rs.getString(7)
            
              
                ));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public JasperReport showReport(BusinessClearance businessClearance) throws ServiceException {
        JasperViewer jv;
        jv = new JasperViewer(generateAndSaveBarangayReport(businessClearance).getBusinessClearancePrint(),false);
                  jv.setExtendedState(JasperViewer.NORMAL);
                 jv.setDefaultCloseOperation(HIDE_ON_CLOSE);
                  jv.setVisible(true);
        return null;
    }

    @Override
    public BarangayOfficials addNewOfficial(BarangayOfficials barangayOfficials) throws ServiceException {
        return null;
      
    
}


    @Override
    public boolean validateRecord(String controlNo) throws ServiceException {
      PreparedStatement preparedStatement;
         ResultSet resultSet;
         
        
        String validateQuery = "SELECT * FROM bus_clearance WHERE controlNo = '" + controlNo + "'";
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
            Logger.getLogger(BusinessClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ObservableList<BusinessClearance> loadBusinessType(ObservableList data) throws ServiceException {
       try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM businessType" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
               data.add(
                       rs.getString("businessType")
               );
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

  
}
