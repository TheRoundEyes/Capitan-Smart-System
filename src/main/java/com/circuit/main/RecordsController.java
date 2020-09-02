package com.circuit.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.circuit.obj.capitanObj.UserContext;
import com.circuit.properties.AdminProperties;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Marvin
 */
public class RecordsController implements Initializable {
    
     @FXML
    private AnchorPane recordsPane;
     
         @FXML
    private JFXButton viewOfficials;


    @FXML
    private JFXButton dashboardButton;

    @FXML
    private JFXButton createNewButton;

    @FXML
    private JFXButton managementButton;

    @FXML
    private JFXButton recordsButton;

    @FXML
    private TableView<AdminProperties> adminTable;

    @FXML
    private TableColumn<AdminProperties, Integer> idNoColumn;

    @FXML
    private TableColumn<AdminProperties, String> adminNameCol;

    @FXML
    private TableColumn<AdminProperties, String> positionCol;

    @FXML
    public Label current_barangay;

    @FXML
    public Label current_date;

    @FXML
    void createNewApp(ActionEvent event) throws IOException {
        
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          recordsPane.getChildren().setAll(pane);

    }

    @FXML
    void manageDataButton(ActionEvent event) {
        

    }

    @FXML
    void openHome(ActionEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
             recordsPane.getChildren().setAll(pane);

    }

    @FXML
    void viewRecords(ActionEvent event) throws IOException {
           AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Records.fxml"));
          recordsPane.getChildren().setAll(pane);

    }
    
     @FXML
    void viewOfficials(ActionEvent event) throws IOException {
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Officials.fxml"));
          recordsPane.getChildren().setAll(pane);
    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy ");
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            String control_no_format = new SimpleDateFormat("yyyy-HmmSS").format(date);
            
            current_date.setText(dateFormat.format(date));
            current_barangay.setText(UserContext.getCurrentBarangay());
    }    
    
}
