    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.SqlConnect;
import com.circuit.db.intrfc.BarangayClearanceDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.main.MainController;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.BarangayReport;
import com.circuit.utils.ReportUtility;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import static javax.swing.WindowConstants.HIDE_ON_CLOSE;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Marvin
 */
public class BarangayClearanceImpl extends DatabaseSource implements BarangayClearanceDatabase {
    
 

    @Override
    public BarangayClearance getBarangayClearance(int id) throws ServiceException {
        
        
        
        return null;
        
    }

    @Override
    public List<BarangayClearance> getAllBarangayClearanceInRange(int from, int to) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BarangayClearance> getAllBarangayClearance() throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayClearance saveClearance(BarangayClearance barangayClearance) throws ServiceException {
        PreparedStatement ps;
      
        
        try
        {
            if(barangayClearance.getId() == 0)
            {
                String insertSql = ""
                        + "INSERT INTO "
                        + "bgy_clearance "
                        + " ("
                        + "surname, "
                        + "firstname, "
                        + "middlename,"
                        + "fullname, "
                        + "gender, "
                        + "birthdate, "
                        + "age, "
                        + "citizenship, "
                        + "address, "
                        + "barangay, "
                        + "city, "
                        + "remarks, "
                        + "paidamount, "
                        + "changeamount, "
                        + "regcost, "
                        + "control_no, "
                        + "current_date, "
                        + "civilStatus,"
                        + "purpose,"
                        + "currentAdmin,"
                        + "orNo,"
                        + "clearanceType"
                        + ")"
                        + "VALUES "
                        + "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, barangayClearance.getSurname());
                ps.setString(2, barangayClearance.getFirstName());
                ps.setString(3, barangayClearance.getMiddleName());
                ps.setString(4, barangayClearance.getFullname());
                ps.setString(5, barangayClearance.getGender());
                ps.setString(6, String.valueOf(barangayClearance.getBirthDate()));
                ps.setString(7, String.valueOf(barangayClearance.getAge()));
                ps.setString(8, barangayClearance.getCitizenship());
                ps.setString(9, barangayClearance.getAddress());
                ps.setString(10, barangayClearance.getBarangay());
                ps.setString(11, barangayClearance.getCity());
                ps.setString(12, barangayClearance.getRemarks());
                ps.setString(13,  String.valueOf(barangayClearance.getAmountPaid()));
                ps.setString(14,  String.valueOf(barangayClearance.getAmountChange()));
                ps.setString(15, String.valueOf(barangayClearance.getRegCost()));
                ps.setString(16, String.valueOf(barangayClearance.getControl_no()));
                ps.setString(17, barangayClearance.getCurrent_date());        
                ps.setString(18, barangayClearance.getCivilStatus());
                ps.setString(19, barangayClearance.getClearancePurpose());
                ps.setString(20, barangayClearance.getCurrentAdmin());
                ps.setString(21, barangayClearance.getORNo());
                ps.setString(22, barangayClearance.getClearanceType());
            }
            else
            {
                 String updateSQL = ""
                        + "UPDATE "
                        + "bgy_clearance "
                        + "SET "
                        + "surname = ?, "
                        + "firstname = ?, "
                        + "middlename = ?,"
                         + "fullname = ?, "
                        + "gender = ?, "
                        + "birthdate = ?, "
                        + "age = ?, "
                        + "citizenship = ?, "
                        + "address = ?, "
                        + "barangay = ?, "
                        + "city = ?, "
                        + "remarks = ?, "
                        + "paidamount = ?, "
                        + "changeamount = ?, "
                        + "regcost = ?, "
                        + "regvat = ?,"
                         + "control_no = ?,"
                         + "current_date = ?,"
                         + "civilStatus = ?,"
                         + "purpose = ?,"
                         + "currentAdmin = ?,"
                         + "orNo = ?,"
                         + "clearanceType = ?"
                         + "WHERE "
                         + "id = ?";
 
                
                ps = this.getConnection().prepareStatement(updateSQL);
                 ps.setString(1, barangayClearance.getSurname());
                ps.setString(2, barangayClearance.getFirstName());
                ps.setString(3, barangayClearance.getMiddleName());
                ps.setString(4, barangayClearance.getFullname());
                ps.setString(5, barangayClearance.getGender());
                ps.setString(6, String.valueOf(barangayClearance.getBirthDate()));
                ps.setString(7, String.valueOf(barangayClearance.getAge()));
                ps.setString(8, barangayClearance.getCitizenship());
                ps.setString(9, barangayClearance.getAddress());
                ps.setString(10, barangayClearance.getBarangay());
                ps.setString(11, barangayClearance.getCity());
                ps.setString(12, barangayClearance.getRemarks());
                ps.setString(13,  String.valueOf(barangayClearance.getAmountPaid()));
                ps.setString(14,  String.valueOf(barangayClearance.getAmountChange()));
                ps.setString(15, String.valueOf(barangayClearance.getRegCost()));
                ps.setString(16, String.valueOf(barangayClearance.getControl_no()));
                ps.setString(17, barangayClearance.getCurrent_date());        
                ps.setString(18, barangayClearance.getCivilStatus());
                ps.setString(19, barangayClearance.getClearancePurpose());
                ps.setString(20, barangayClearance.getCurrentAdmin());
                ps.setString(21, barangayClearance.getORNo());
                ps.setString(22, barangayClearance.getClearanceType());
       
            }
            ps.execute();
            ps.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(BarangayClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  barangayClearance;
    }

    @Override
    public boolean removeClearance(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayClearance generateBarangayReport(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BarangayReport generateAndSaveBarangayReport(BarangayClearance barangayClearance) throws ServiceException {
       BarangayReport barangayClearanceReport = new BarangayReport();
        
       
        barangayClearanceReport.setBarangayClearance(barangayClearance);
        barangayClearanceReport.setBarangayClearancePrint(ReportUtility.generateJasperPrintReport(barangayClearance));
      
        return barangayClearanceReport;
    }

    @Override
    public BarangayReport generateAndSaveBarangayClearanceReportReciept(BarangayClearance barangayClearance) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public JasperReport showReport(BarangayClearance barangayClearance) throws ServiceException {
        JasperViewer jv;
        jv = new JasperViewer(generateAndSaveBarangayReport(barangayClearance).getBarangayClearancePrint(),false);
                  jv.setExtendedState(JasperViewer.NORMAL);
                  jv.setDefaultCloseOperation(HIDE_ON_CLOSE);
                  jv.setVisible(true);
                  
  
        return null;
    }

  

    @Override
    public ObservableList loadComboBox(ObservableList data) throws ServiceException {
         
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearance_purpose" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
               data.add(
                       rs.getString("purpose")
               );
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
        
        
      
     
        
    
    }

    @Override
    public void loadCost(String purpose) throws ServiceException {
       try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearace_purpose WHERE purpose = '" + purpose + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
               String cost = rs.getString("cost");
     
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ObservableList loadRemarksBox(ObservableList data) throws ServiceException {
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearance_remarks" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
               data.add(
                       rs.getString("remarks")
               );
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public void VideoFeedTaker() throws ServiceException {
        Thread thread = new Thread();
       
        try {
            thread.sleep(80);
        } catch (InterruptedException ex) {
            Logger.getLogger(BusinessClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void startStream() throws ServiceException {
        
    }

    @Override
    public boolean validateRecord(String controlNo) throws ServiceException {
        PreparedStatement preparedStatement;
         ResultSet resultSet;
         
        
        String validateQuery = "SELECT * FROM bgy_clearance WHERE controlNo = '" + controlNo + "'";
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
            Logger.getLogger(BarangayClearanceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
 
    
}
