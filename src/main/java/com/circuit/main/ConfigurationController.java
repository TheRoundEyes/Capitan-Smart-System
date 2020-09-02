package com.circuit.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.circuit.db.impl.ConfigurationImpl;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.capitanObj.Admin;
import com.circuit.obj.clearanceobj.BarangayOfficials;
import com.circuit.obj.clearanceobj.ClearancePurpose;
import com.circuit.obj.clearanceobj.ClearanceRemarks;
import com.circuit.obj.capitanObj.UserContext;
import com.circuit.properties.ClearancePurposeProperties;
import com.circuit.properties.ClearanceRemarksProperties;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author Marvin
 */
public class ConfigurationController implements Initializable {
    
    ConfigurationImpl  configurationImpl = new ConfigurationImpl();
    BarangayOfficials barangayOfficials = new BarangayOfficials();
    BarangayClearance  barangayClearance = new BarangayClearance();
    Admin admin = new Admin();
    ClearancePurpose clearancePurpose = new ClearancePurpose();
    ClearanceRemarks clearanceRemarks =  new ClearanceRemarks();
    
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
    private JFXTextField brgyCaptField;

    @FXML
    private JFXTextField kgwdField1;

    @FXML
    private JFXTextField kgwdField2;

    @FXML
    private JFXTextField kgwdField3;

    @FXML
    private JFXTextField kgwdField4;

    @FXML
    private JFXTextField kgwdField5;

    @FXML
    private JFXTextField kgwdField6;

    @FXML
    private JFXTextField kgwdField7;

    @FXML
    private JFXTextField brgySecField;

    @FXML
    private JFXTextField brgyTresField;

    @FXML
    private JFXButton editOfficials;

    @FXML
    private JFXButton saveOfficials;

    @FXML
    private TableView<ClearancePurposeProperties> purposeTblView;

    @FXML
    private TableColumn<ClearancePurposeProperties, String> purposeColumn;

    @FXML
    private TableColumn<ClearancePurposeProperties, String> costColumn;

 
    @FXML
    private JFXTextField clearancePurposeField;

    @FXML
    private JFXButton addPurposeBtn;

    @FXML
    private JFXButton deletePurposeBtn;

    @FXML
    private JFXTextField clearanceCostFIeld;
    @FXML
    private TableView<ClearanceRemarksProperties> remarksTblView;

    @FXML
    private TableColumn<ClearanceRemarksProperties, String> remarksColumn;

    
    @FXML
    private JFXTextField remarksField;
    @FXML
    private JFXButton addRemarksBtn;

    @FXML
    private JFXButton deleteRemarksBtn;

    @FXML
    private ImageView currentAdminPic;

    @FXML
    private JFXTextField adminFirstNameField;

    @FXML
    private JFXTextField adminPositionField;

    @FXML
    private JFXTextField adminLastNameField;

    @FXML
    private Label adminIdNo;

    @FXML
    private JFXButton editAdminProfile;

    @FXML
    private JFXButton saveAdminProfile;


    
      @FXML
    void addPurposeData(ActionEvent event) throws IOException {
        
        clearancePurpose.setClearancePurpose(clearancePurposeField.getText());
        clearancePurpose.setClearanceCost(clearanceCostFIeld.getText());
        
        if(clearancePurposeField.getText().trim().equals("") || clearanceCostFIeld.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Invalid Input");
        }
        else
        {
            configurationImpl.savePurpose(clearancePurpose);
            JOptionPane.showMessageDialog(null, "Input Saved");
             AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Configuration.fxml"));
          rootPane.getChildren().setAll(pane);
        }
        

    }

    @FXML
    void addRemarksData(ActionEvent event) throws IOException, ServiceException {
        
        clearanceRemarks.setRemarks(remarksField.getText());
        
        if(remarksField.getText().trim().equals(""))
        {
          JOptionPane.showMessageDialog(null, "Invalid Input");
        }
        else
        {
            configurationImpl.saveRemarks(clearanceRemarks);
            JOptionPane.showMessageDialog(null, "Input Saved");
             AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Configuration.fxml"));
          rootPane.getChildren().setAll(pane);
        }
        
        

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
    void deletePurposeData(ActionEvent event) {

    }

    @FXML
    void deleteRemarksData(ActionEvent event) {

    }

    @FXML
    void editAdminProfile(ActionEvent event) {
        
        adminFirstNameField.setDisable(false);
        adminLastNameField.setDisable(false);
        adminPositionField.setDisable(false);
        saveAdminProfile.setDisable(false);

    }

    @FXML
    void enableFields(ActionEvent event) {
        
        brgyCaptField.setDisable(false);
        kgwdField1.setDisable(false);
        kgwdField2.setDisable(false);
        kgwdField3.setDisable(false);
        kgwdField4.setDisable(false);
        kgwdField5.setDisable(false);
        kgwdField6.setDisable(false);
        kgwdField7.setDisable(false);
        brgySecField.setDisable(false);
        brgyTresField.setDisable(false);
        saveOfficials.setDisable(false);

    }

    @FXML
    void openHome(ActionEvent event) throws IOException {
  AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          rootPane.getChildren().setAll(pane);
    }

    @FXML
    void saveAdminProfile(ActionEvent event) throws ServiceException {
        
        admin.setFirstName(adminFirstNameField.getText());
        admin.setLastName(adminLastNameField.getText());
        admin.setPosition(adminPositionField.getText());
        
        
        if(adminFirstNameField.getText().trim().equals("") || adminLastNameField.getText().trim().equals("") || adminPositionField.getText().trim().equals(""))
        {
             JOptionPane.showMessageDialog(null, "Incomplete Data Input");
        }
        else
        {
             configurationImpl.editAdmin(admin);
             JOptionPane.showMessageDialog(null, "Admin Data Updated!");
             adminFirstNameField.setDisable(true);
             adminLastNameField.setDisable(true);
             adminPositionField.setDisable(true);
        }
       
        

    }

    @FXML
    void saveOfficials(ActionEvent event) throws ServiceException {
        
        barangayClearance.setBarangayCapt(brgyCaptField.getText());
        barangayClearance.setBarangayKag1(kgwdField1.getText());
        barangayClearance.setBarangayKag2(kgwdField2.getText());
        barangayClearance.setBarangayKag3(kgwdField3.getText());
        barangayClearance.setBarangayKag4(kgwdField4.getText());
        barangayClearance.setBarangayKag5(kgwdField5.getText());
        barangayClearance.setBarangayKag6(kgwdField6.getText());
        barangayClearance.setBarangayKag7(kgwdField7.getText());
        barangayClearance.setBarangaySec(brgySecField.getText());
        barangayClearance.setBarangayTres(brgyTresField.getText());
        
        
        if(brgyCaptField.getText().trim().equals("") || kgwdField1.getText().trim().equals("") ||  kgwdField2.getText().trim().equals("") ||  kgwdField3.getText().trim().equals("") ||
                 kgwdField4.getText().trim().equals("") ||  kgwdField5.getText().trim().equals("") ||  kgwdField6.getText().trim().equals("") ||  kgwdField7.getText().trim().equals("") ||
                brgySecField.getText().trim().equals("") || brgyTresField.getText().trim().equals(""))
        {
              JOptionPane.showMessageDialog(null, "Incomplete Data Input");
        }
        else
        {
        configurationImpl.editOfficials(barangayClearance);
        JOptionPane.showMessageDialog(null, "Officials Updated!");
        brgyCaptField.setDisable(true);
        kgwdField1.setDisable(true);
        kgwdField2.setDisable(true);
        kgwdField3.setDisable(true);
        kgwdField4.setDisable(true);
        kgwdField5.setDisable(true);
        kgwdField6.setDisable(true);
        kgwdField7.setDisable(true);
        brgySecField.setDisable(true);
        brgyTresField.setDisable(true);
        saveOfficials.setDisable(true);
        }
        
      
        

    }

    @FXML
    void signOutCapitan(ActionEvent event) throws IOException {
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
          rootPane.getChildren().setAll(pane);

    }

    @FXML
    void viewRecords(ActionEvent event) throws IOException {
         JOptionPane.showMessageDialog(null, "Under Maintenance");
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          rootPane.getChildren().setAll(pane);

    }
    
     @FXML
    void editDataRow(MouseEvent event) {

    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        purposeColumn.setCellValueFactory(new PropertyValueFactory<>("purpose"));
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        
        try {
            purposeTblView.setItems(configurationImpl.loadPurposeTable());
        } catch (ServiceException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        remarksColumn.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        try
        {
            remarksTblView.setItems(configurationImpl.loadRemarksTable());
        } catch (ServiceException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            configurationImpl.loadOfficials(UserContext.getCurrentBarangay());
            
             
            brgyCaptField.setText(UserContext.getBARANGAY_CAPTAIN());
            kgwdField1.setText(UserContext.getKAGAWAD_1());
            kgwdField2.setText(UserContext.getKAGAWAD_2());
            kgwdField3.setText(UserContext.getKAGAWAD_3());
            kgwdField4.setText(UserContext.getKAGAWAD_4());
            kgwdField5.setText(UserContext.getKAGAWAD_5());
            kgwdField6.setText(UserContext.getKAGAWAD_6());
            kgwdField7.setText(UserContext.getKAGAWAD_7());
            brgySecField.setText(UserContext.getBARANGAY_SEC());
            brgyTresField.setText(UserContext.getBARANGAY_TRES());
            
            
        } catch (ServiceException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            configurationImpl.loadAdmin(UserContext.getId());
            adminFirstNameField.setText(UserContext.getAdminFirstName());
            adminLastNameField.setText(UserContext.getAdminLastName());
            adminPositionField.setText(UserContext.getAdminPosition());
            adminIdNo.setText(UserContext.getAdminIdNo());
        }catch (ServiceException ex) {
            Logger.getLogger(ConfigurationController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }    
    
}
