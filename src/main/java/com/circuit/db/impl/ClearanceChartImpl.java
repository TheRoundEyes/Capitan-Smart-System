/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.db.impl;

import com.circuit.db.DatabaseSource;
import com.circuit.db.SqlConnect;
import com.circuit.db.intrfc.ClearanceChart;
import com.circuit.exception.ServiceException;
import com.circuit.main.MainController;
import com.circuit.obj.capitanObj.UserContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.XYChart;

/**
 *
 * @author Marvin
 */
public class ClearanceChartImpl extends  DatabaseSource implements ClearanceChart{

    @Override
    public XYChart.Series<String, Integer> loadBrgyClearance() throws ServiceException {
         XYChart.Series<String, Integer> data = new XYChart.Series<>();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM bgy_clearance WHERE barangay = '" + UserContext.getCurrentBarangay() + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.getData().add(new XYChart.Data<>(rs.getString(23), rs.getInt(1)));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public XYChart.Series<String, Integer> loadBusClearance() throws ServiceException {
        XYChart.Series<String, Integer> data = new XYChart.Series<>();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM bus_clearance WHERE barangay = '" + UserContext.getCurrentBarangay() + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.getData().add(new XYChart.Data<>(rs.getString(20), rs.getInt(1)));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public XYChart.Series<String, Integer> loadWorkingClearance() throws ServiceException {
       XYChart.Series<String, Integer> data = new XYChart.Series<>();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM work_clearance WHERE barangay = '" + UserContext.getCurrentBarangay() + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.getData().add(new XYChart.Data<>(rs.getString(22), rs.getInt(1)));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }

    @Override
    public XYChart.Series<String, Integer> loadPedicabClearance() throws ServiceException {
         XYChart.Series<String, Integer> data = new XYChart.Series<>();
           
        try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM ped_clearance WHERE barangay = '" + UserContext.getCurrentBarangay() + "'" ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                ResultSet rs =  pst.executeQuery();
           
            
            while(rs.next())
            {
                data.getData().add(new XYChart.Data<>(rs.getString(24), rs.getInt(1)));
                        
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
    
    
}
