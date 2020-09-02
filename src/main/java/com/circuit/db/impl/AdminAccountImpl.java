/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.SqlConnect;
import com.circuit.db.intrfc.AdminAcount;
import com.circuit.properties.AdminProperties;
import com.circuit.properties.BarangayClearanceProperties;
import com.circuit.exception.ServiceException;
import com.circuit.main.MainController;
import com.circuit.obj.capitanObj.Admin;
import com.circuit.obj.capitanObj.UserContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Marvin
 */
public class AdminAccountImpl extends DatabaseSource implements AdminAcount {


    @Override
    public Admin addNewAccount(Admin admin) throws ServiceException {
        PreparedStatement preparedStatement;
        
        try
        {
            if(admin.getId() == 0)
            {
                String insertSql = ""
                        + "INSERT_INTO "
                        + "admin_acct "
                        + " ("
                        + "id_no, "
                        + "first_name, "
                        + "last_name, "
                        + "user_name, "
                        + "password, "
                        + "profilepic"
                        + ") "
                        + "VALUES "
                        + "(?,?,?,?,?,?)";
                
                preparedStatement = this.getConnection().prepareStatement(insertSql);
                preparedStatement.setInt(1, admin.getIdNo());
                preparedStatement.setString(2, admin.getFirstName());
                preparedStatement.setString(3, admin.getLastName());
                preparedStatement.setString(4, admin.getUsername());
                preparedStatement.setString(5, admin.getPassword());  
            }
             else
            {
               String updateSql = ""
                       + "UPDATE "
                       + "admin_acct "
                       + "SET "
                       + "id_no = ?,"
                       + "first_name = ?,"
                       + "last_name = ?,"
                       + "user_name = ?,"
                       + "password = ?"
                       + "WHERE "
                       + "id = ?";
               
                preparedStatement = this.getConnection().prepareStatement(updateSql);
                preparedStatement.setInt(1, admin.getIdNo());
                preparedStatement.setString(2, admin.getFirstName());
                preparedStatement.setString(3, admin.getLastName());
                preparedStatement.setString(4, admin.getUsername());
                preparedStatement.setString(5, admin.getPassword());  
            }
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminAccountImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Admin removeAccount(Admin admin) throws ServiceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ObservableList loadTable() throws ServiceException {
       ObservableList data = FXCollections.observableArrayList();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM admin_acct" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
            data.add(new AdminProperties(
                rs.getInt(2),
                rs.getString(3),
                rs.getString(7),
                rs.getString(8),
                rs.getBoolean(9)
            
              
                ));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    public boolean validateLogin(String username, String password) throws ServiceException {
        
        PreparedStatement preparedStatement;
         ResultSet resultSet;
         
        
        String validateQuery = "SELECT * FROM admin_acct WHERE user_name = '" + username + "' AND password = '" + password + "'";
        try
        {
            
            //Statement st = this.getConnection().createStatement();
            preparedStatement = this.getConnection().prepareStatement(validateQuery);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next())
            {
                if(username.equals(resultSet.getString("user_name")) && password.equals(resultSet.getString("password")))
                {

                      
                        System.out.println("Welcome " + username);
                        UserContext.setId(resultSet.getInt("id"));
                        UserContext.setAdminName(resultSet.getString("first_name") + " " + resultSet.getString("last_name"));
                        UserContext.setCurrentBarangay(resultSet.getString("barangay"));
                        UserContext.setCurrentCity(resultSet.getString("city"));
                        
                        return true; 


           }
            else
            {
                System.out.println("Mali tanga");
                return false;
            }
            }
           preparedStatement.close();
            resultSet.close();
           
    }   catch (SQLException ex) {
            Logger.getLogger(AdminAccountImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
          
    
}
//
//     
       
    

}
