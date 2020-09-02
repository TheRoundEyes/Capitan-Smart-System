package com.circuit.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.circuit.db.impl.BusinessClearanceImpl;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.capitanObj.UserContext;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Marvin
 */
public class EditOfficialsController implements Initializable {
    
    BarangayClearance barangayOfficials = new BarangayClearance();
    BusinessClearanceImpl busClearanceServiceImpl = new BusinessClearanceImpl();
    
    
      @FXML
    private AnchorPane edit_officials_pane;
      
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
    private JFXTextField brgy_capt_field;

    @FXML
    private JFXTextField brgy_kgwd_1_field;

    @FXML
    private JFXTextField brgy_kgwd_2_field;

    @FXML
    private JFXTextField brgy_kgwd_3_field;

    @FXML
    private JFXTextField brgy_kgwd_4_field;

    @FXML
    private JFXTextField brgy_kgwd_5_field;

    @FXML
    private JFXTextField brgy_kgwd_6_field;

    @FXML
    private JFXTextField brgy_kgwd_7_field;

    @FXML
    private JFXTextField brgy_sec_field;

    @FXML
    private JFXTextField brgy_treas_field;

    @FXML
    private JFXButton saveOfficials;
    
      int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @FXML
    void createNewApp(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Records.fxml"));
          edit_officials_pane.getChildren().setAll(pane);

    }

    @FXML
    void manageDataButton(ActionEvent event) throws IOException {
//         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Records.fxml"));
//          edit_officials_pane.getChildren().setAll(pane);

    }

    @FXML
    void openHome(ActionEvent event) throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          edit_officials_pane.getChildren().setAll(pane);

    }

    @FXML
    void saveOfficialsBtn(ActionEvent event) throws ServiceException {
        
        barangayOfficials.setId(getId());
        barangayOfficials.setBarangayName(UserContext.getCurrentBarangay());
        barangayOfficials.setBarangayCapt(brgy_capt_field.getText());
        barangayOfficials.setBarangayKag1(brgy_kgwd_1_field.getText());
        barangayOfficials.setBarangayKag2(brgy_kgwd_2_field.getText());
        barangayOfficials.setBarangayKag3(brgy_kgwd_3_field.getText());
        barangayOfficials.setBarangayKag4(brgy_kgwd_4_field.getText());
        barangayOfficials.setBarangayKag5(brgy_kgwd_5_field.getText());
        barangayOfficials.setBarangayKag6(brgy_kgwd_6_field.getText());
        barangayOfficials.setBarangayKag7(brgy_kgwd_7_field.getText());
        barangayOfficials.setBarangaySec(brgy_sec_field.getText());
        barangayOfficials.setBarangayTres(brgy_treas_field.getText());
        
        
        
        
     
        
     

    }

    @FXML
    void viewRecords(ActionEvent event)throws IOException {
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Records.fxml"));
          edit_officials_pane.getChildren().setAll(pane);

    }
    
     @FXML
    void viewOfficials(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Officials.fxml"));
          edit_officials_pane.getChildren().setAll(pane);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    
        // TODO
    }    
    
}
