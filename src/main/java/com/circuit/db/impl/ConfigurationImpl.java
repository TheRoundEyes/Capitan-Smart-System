/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.SqlConnect;
import com.circuit.db.intrfc.ConfigurationDatabase;
import com.circuit.exception.ServiceException;
import com.circuit.main.ConfigurationController;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.capitanObj.Admin;
import com.circuit.obj.clearanceobj.BarangayOfficials;
import com.circuit.obj.clearanceobj.ClearancePurpose;
import com.circuit.obj.clearanceobj.ClearanceRemarks;
import com.circuit.properties.ClearancePurposeProperties;
import com.circuit.properties.ClearanceRemarksProperties;
import com.circuit.obj.capitanObj.UserContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Marvin
 */
public class ConfigurationImpl extends DatabaseSource implements ConfigurationDatabase {

    @Override
    public ObservableList<ClearancePurposeProperties> loadPurposeTable() throws ServiceException {
        ObservableList<ClearancePurposeProperties> data = FXCollections.observableArrayList();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearance_purpose" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.add(new  ClearancePurposeProperties(
                        rs.getInt(1),
                        rs.getString("purpose"),
                        rs.getString("cost")
                ));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public ObservableList<ClearanceRemarksProperties> loadRemarksTable() throws ServiceException {
       ObservableList<ClearanceRemarksProperties> data = FXCollections.observableArrayList();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearance_remarks" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.add(new ClearanceRemarksProperties(
                        rs.getInt(1),
                        rs.getString(2)
            
              
                ));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public BarangayClearance editOfficials(BarangayClearance barangayClearance) throws ServiceException {
        PreparedStatement ps;
      
      try
      {
           
                String updateSql = ""
                        + "UPDATE "
                        + "bgy_officials "
                        + "SET "
                        + "barangay_capt = ?,"
                        + "kgwd_1 = ?,"
                         + "kgwd_2 = ?,"
                         + "kgwd_3 = ?,"
                         + "kgwd_4 = ?,"
                         + "kgwd_5 = ?,"
                         + "kgwd_6 = ?,"
                         + "kgwd_7 = ?,"
                        + "barangay_sec = ?,"
                        + "barangay_tres = ?"
                        + "WHERE "
                        + "barangay_name = '" + UserContext.getCurrentBarangay() + "'";
                              
                ps = this.getConnection().prepareStatement(updateSql);
                ps.setString(1, barangayClearance.getBarangayCapt());
                ps.setString(2, barangayClearance.getBarangayKag1());
                ps.setString(3, barangayClearance.getBarangayKag2());
                ps.setString(4, barangayClearance.getBarangayKag3());
                ps.setString(5, barangayClearance.getBarangayKag4());
                ps.setString(6, barangayClearance.getBarangayKag5());
                ps.setString(7, barangayClearance.getBarangayKag6());
                ps.setString(8, barangayClearance.getBarangayKag7());
                ps.setString(9, barangayClearance.getBarangaySec());
                ps.setString(10, barangayClearance.getBarangayTres());
                ps.execute();
                ps.close();
            

    }   catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return barangayClearance;
        }
    
    
    


    @Override
    public ResultSet loadOfficials(String barangayName) throws ServiceException {
        
      PreparedStatement ps;
      ResultSet rs = null;
      
      try
      {
          String loadSql = ""
                  + "SELECT * FROM "
                  + "bgy_officials "
                  + "WHERE barangay_name = '" + barangayName + "'";
          
          ps = this.getConnection().prepareStatement(loadSql);
          rs = ps.executeQuery();
          
          while(rs.next())
          {
             
               UserContext.setBARANGAY_CAPTAIN(rs.getString("barangay_capt"));
               UserContext.setKAGAWAD_1(rs.getString("kgwd_1"));
               UserContext.setKAGAWAD_2(rs.getString("kgwd_2"));
               UserContext.setKAGAWAD_3(rs.getString("kgwd_3"));
               UserContext.setKAGAWAD_4(rs.getString("kgwd_4"));
               UserContext.setKAGAWAD_5(rs.getString("kgwd_5"));
               UserContext.setKAGAWAD_6(rs.getString("kgwd_6"));
               UserContext.setKAGAWAD_7(rs.getString("kgwd_7"));
               UserContext.setBARANGAY_SEC(rs.getString("barangay_sec"));
               UserContext.setBARANGAY_TRES(rs.getString("barangay_tres"));
               
           
               }
          rs.close();
   }    catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    @Override
    public BarangayOfficials removeOfficials(BarangayOfficials barangayOfficials) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet loadAdmin(int id) throws ServiceException {
        PreparedStatement ps;
      ResultSet rs = null;
      
      try
      {
          String loadSql = ""
                  + "SELECT * FROM "
                  + "admin_acct "
                  + "WHERE id = '" + id + "'";
          
          ps = this.getConnection().prepareStatement(loadSql);
          rs = ps.executeQuery();
          
          while(rs.next())
          {
             
              UserContext.setAdminFirstName(rs.getString("first_name"));
              UserContext.setAdminLastName(rs.getString("last_name"));
              UserContext.setAdminPosition(rs.getString("position"));
              UserContext.setAdminIdNo(rs.getString("id_no"));
           
               }
          rs.close();
   }    catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    @Override
    public Admin editAdmin(Admin admin) throws ServiceException {
        
        PreparedStatement ps;
       try
      {
           
                String updateSql = ""
                        + "UPDATE "
                        + "admin_acct "
                        + "SET "
                        + "first_name = ?,"
                        + "last_name = ?,"
                        + "position = ?"
                        + "WHERE "
                        + "id = '" + UserContext.getId() + "'";
                              
                ps = this.getConnection().prepareStatement(updateSql);
                ps.setString(1, admin.getFirstName());
                ps.setString(2, admin.getLastName());
                ps.setString(3, admin.getPosition());
                ps.execute();
                ps.close();
            

    }   catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
      
        return admin;
        }
    

   

    @Override
    public Admin removeAdmin(Admin admin) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClearanceRemarks saveRemarks(ClearanceRemarks clearanceRemarks) throws ServiceException {
        PreparedStatement ps;
      
        
        try
        {
            
                String insertSql = ""
                        + "INSERT INTO "
                        + "brgy_clearance_remarks "
                        + " ("
                        + "remarks "
                        + ") "
                        + "VALUES"
                        + "(?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, clearanceRemarks.getRemarks());
                ps.execute();
                       
              
            
        }    catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
            
                
            }
        return clearanceRemarks;
    }

    @Override
    public ClearanceRemarks deleteRemarks(ClearanceRemarks clearanceRemarks) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ClearancePurpose savePurpose(ClearancePurpose clearancePurpose) {
        PreparedStatement ps;
      
        
        try
        {
            
                String insertSql = ""
                        + "INSERT INTO "
                        + "brgy_clearance_purpose "
                        + " ("
                        + "purpose, "
                        + "cost"
                        + ") "
                        + "VALUES"
                        + "(?,?)";
                
                ps = this.getConnection().prepareStatement(insertSql);
                ps.setString(1, clearancePurpose.getClearancePurpose());
                ps.setString(2, clearancePurpose.getClearanceCost());
                ps.execute();
                       
              
            
        }    catch (SQLException ex) {
            Logger.getLogger(ConfigurationImpl.class.getName()).log(Level.SEVERE, null, ex);
            
                
            }
        return clearancePurpose;
    }
    

    @Override
    public ClearancePurpose deletePurpose(ClearancePurpose clearancePurpose) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
    
}
