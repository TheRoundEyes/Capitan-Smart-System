package com.circuit.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.circuit.db.impl.BarangayClearanceImpl;
import com.circuit.db.impl.BusinessClearanceImpl;
import com.circuit.db.impl.ClearanceChartImpl;
import com.circuit.db.impl.ConfigurationImpl;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.capitanObj.Admin;
import com.circuit.obj.capitanObj.UserContext;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Marvin
 */
public class MainController implements Initializable {
    
    BarangayClearanceImpl barangayClearanceImpl = new BarangayClearanceImpl();
    Admin admin = new Admin();
     BarangayClearance barangayClearance = new BarangayClearance();
     RegisterController registerController = new RegisterController();
     ConfigurationImpl configurationImpl = new ConfigurationImpl();
     BusinessClearanceImpl businessClearanceImpl = new BusinessClearanceImpl();
     ClearanceChartImpl clearanceChartImpl = new ClearanceChartImpl();
    
   @FXML
    private AnchorPane rootPane;

    @FXML
    private JFXButton dashboardButton;

    @FXML
    private JFXButton createNewButton;

    @FXML
    private JFXButton recordsButton;

    @FXML
    private JFXButton configureBtn;

    @FXML
    private JFXButton signOutBtn;

    @FXML
    private Label currentAdmin;

    @FXML
    private Label currentDate;

    @FXML
    private BarChart<String, Integer> clearanceChart;
    

    
       @FXML
    void bailTab(ActionEvent event) {

    }

    

    @FXML
    void configureSystem(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Configuration.fxml"));
          rootPane.getChildren().setAll(pane);

    }

    @FXML
    void createNewApp(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/CreateNew.fxml"));
          rootPane.getChildren().setAll(pane);

    }
    
        @FXML
    void editBrgyClearanceData(MouseEvent event) throws IOException {
        
        
//        try
//        {
//            
//            brgyDataTable.getSelectionModel().select(1, idCol);
//            
//   
//          AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/CreateNew.fxml"));
//          rootPane.getChildren().setAll(pane);
//          
//          String
//          
//          
//        }
//        
     

        

    }

    @FXML
    void openHome(ActionEvent event) throws IOException{
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          rootPane.getChildren().setAll(pane);

    }

    @FXML
    void pedTab(ActionEvent event) {

    }

    @FXML
    void signOutCapitan(ActionEvent event) throws IOException{
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
          rootPane.getChildren().setAll(pane);

    }

    @FXML
    void viewRecords(ActionEvent event) throws IOException {
         JOptionPane.showMessageDialog(null, "Under Maintenance");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          rootPane.getChildren().setAll(pane);

    }
  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
           
           barangayClearance.setCurrentAdmin(UserContext.getAdminName());
        try {
            configurationImpl.loadOfficials(UserContext.getCurrentBarangay());
        } catch (ServiceException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        

       
        currentAdmin.setText(UserContext.getAdminName());
         DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            currentDate.setText(dateFormat.format(date));
      
       
            try
            {
                 clearanceChart.getData().add(clearanceChartImpl.loadBrgyClearance());
                 clearanceChart.getData().add(clearanceChartImpl.loadBusClearance());
                 clearanceChart.getData().add(clearanceChartImpl.loadWorkingClearance());
                 clearanceChart.getData().add(clearanceChartImpl.loadPedicabClearance());
            }
            catch(Exception e)
            {
                
            }
                   
            
    System.out.println("Number of Active Threads " + Thread.activeCount());
    }    
    
}
