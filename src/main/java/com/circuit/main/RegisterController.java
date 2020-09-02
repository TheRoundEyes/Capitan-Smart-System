package com.circuit.main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.circuit.db.impl.BarangayClearanceImpl;
import com.circuit.db.impl.BusinessClearanceImpl;
import com.circuit.db.DatabaseSource;
import com.circuit.db.impl.PedicabClearanceImpl;
import com.circuit.db.SqlConnect;
import com.circuit.db.impl.WorkingClearanceImpl;
import com.circuit.exception.ServiceException;
import com.circuit.obj.BarangayClearance;
import com.circuit.obj.BusinessClearance;
import com.circuit.obj.PedicabClearance;
import com.circuit.obj.WorkingClearance;
import com.circuit.obj.capitanObj.UserContext;
import com.circuit.service.ClearanceService;
import com.circuit.service.impl.ClearanceServiceImpl;
import com.github.sarxos.webcam.Webcam;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;


/**
 * FXML Controller class
 *
 * @author Marvin
 */
public class RegisterController extends DatabaseSource implements Initializable {
    private final BarangayClearance barangayClearance = new BarangayClearance();
        private final BusinessClearance businessClearance = new BusinessClearance();
    private final WorkingClearance workingClearance = new WorkingClearance();
       private final PedicabClearance pedicabClearance = new PedicabClearance();
    private final BarangayClearanceImpl barangayClearanceImpl = new BarangayClearanceImpl();
    private final BusinessClearanceImpl businessClearanceImpl = new BusinessClearanceImpl();
    private final WorkingClearanceImpl workingClearanceImpl = new WorkingClearanceImpl();
    private final PedicabClearanceImpl pedicabClearanceImpl = new PedicabClearanceImpl();
    private final ObjectProperty<Image> imageProperty = new SimpleObjectProperty<Image>();
    private static Task webCamTask;
      private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @FXML
    private AnchorPane createNew;

    @FXML
    private Label date_label;

    @FXML
    private Pane clearancePane;

    @FXML
    private Pane brgyPane;

    @FXML
    public JFXTextField lastNameField;

    @FXML
    public JFXTextField firstNameField;

    @FXML
    public JFXTextField middleNameField;

    @FXML
    public JFXComboBox<String> genderType;
    
       @FXML
    private JFXButton newClearanceBtn;
    
    @FXML
    public JFXDatePicker birthDate;

    @FXML
    public JFXTextField cityField;

    @FXML
    public JFXTextField ageField;

    @FXML
    public JFXTextField citizenshipField;

    @FXML
    public JFXTextField addressField;

    @FXML
    public JFXComboBox<String> civilStat;


    @FXML
    public JFXTextField barangayField;

    @FXML
    public JFXTextField purposeField;

    @FXML
    private Label control_no;

    @FXML
    private JFXButton submitButton;

    @FXML
    private JFXButton saveButton;

    @FXML
    private Pane webcamPane;

    @FXML
    public ImageView profilePicId;

    @FXML
    private JFXButton capture_btn;

    @FXML
    private JFXComboBox<String> registerType;

    @FXML
    private Label time_label;
    
       @FXML
    private Pane busClearance;

    @FXML
    private Pane busPane;

    @FXML
    private JFXTextField BCFirstName;

    @FXML
    private JFXTextField BCLastName;

    @FXML
    private JFXTextField BCMiddleName;

    @FXML
    private JFXTextField BCBusName;

    @FXML
    private JFXTextField BCBusAdd;

    @FXML
    private JFXTextField BCBusType;

     @FXML
    private JFXComboBox<String> BCbldgType;
    @FXML
    private JFXTextField BCPlateNo;
    
        @FXML
    private JFXButton resetBtn;

    @FXML
    private JFXTextField BCBal;

    @FXML
    private JFXTextField BCStatus;

    @FXML
    private JFXTextField BCAmountPaid;

    @FXML
    private JFXTextField BCChange;

    @FXML
    private JFXButton printBC;

    @FXML
    private JFXButton saBC;

    @FXML
    private JFXTextField BCBrgyField;

    @FXML
    private Label BCCtrlNo;

    @FXML
    private JFXTextField BCORNo;

    @FXML
    private JFXTextField BCORDate;

    @FXML
    private JFXButton dashboardButton;

    @FXML
    private JFXButton createNewButton;

    @FXML
    private JFXButton managementButton;

    @FXML
    private JFXButton recordsButton;

    @FXML
    private JFXButton viewOfficials;
    
      @FXML
    public JFXTextField balanceField;

    @FXML
    public JFXTextField statusField;

    @FXML
    public JFXTextField amountPaidField;

    @FXML
    public JFXTextField changeField;
    
    
    @FXML
    private JFXButton newBusClearance;
    
    
    @FXML
    private JFXTextField orNoField;

    
    @FXML
    private JFXComboBox<String> BCRegisterType;
    
        @FXML
    private Pane workPane;
    
   @FXML
    private JFXTextField WCFirstName;

    @FXML
    private JFXTextField WCLastName;

    @FXML
    private JFXTextField WCMiddleName;

    @FXML
    private JFXDatePicker WCBirthdate;

    @FXML
    private JFXComboBox<String> WCGender;

    @FXML
    private JFXTextField WCAdd;

    @FXML
    private JFXTextField WCAge;

    @FXML
    private JFXComboBox<String> WCCivilStat;

    @FXML
    private JFXTextField WCCitizenship;

    @FXML
    private JFXTextField WCAppliedPos;

    @FXML
    private JFXTextField WCcompanyName;

    @FXML
    private JFXTextField WCcompanyAdd;

    @FXML
    private JFXTextField WCRemarks;

    @FXML
    private JFXTextField WCBrgyField;

    @FXML
    private Label WCCtrlNo;

    @FXML
    private JFXTextField WCOrNo;

    @FXML
    private JFXTextField WCAmountPaid;

    @FXML
    private JFXTextField WCORDate;

    @FXML
    private JFXButton saveWC;

    @FXML
    private JFXButton printWC;

    @FXML
    private JFXButton newWorkClearance;

    @FXML
    private JFXButton WCCapture_btn;

    @FXML
    private JFXButton WCResetBtn;

    @FXML
    private ImageView WCProfilePic;
    
    @FXML
    private Pane pedPane;

    @FXML
    private JFXTextField PCFirstName;

    @FXML
    private JFXTextField PCLastName;

    @FXML
    private JFXTextField PCMiddleName;

    @FXML
    private JFXDatePicker PCBirthdate;

    @FXML
    private JFXComboBox<String> PCGender;

    @FXML
    private JFXTextField PCAdd;

    @FXML
    private JFXTextField PCRemarks;
    
     @FXML
    private JFXComboBox<String> PCCivilStat;
    
       @FXML
    private JFXTextField PCPlateNo;
       
     @FXML
    private JFXTextField PCExpire;


    @FXML
    private JFXTextField PCSideColor;

    @FXML
    private JFXTextField PCBikeColor;

    @FXML
    private JFXTextField PCTrapColor;

    @FXML
    private JFXTextField PCRSide;

    @FXML
    private JFXTextField PCCLside;

    @FXML
    private JFXTextField PCFrontM;

    @FXML
    private JFXTextField PCBackM;

    @FXML
    private JFXTextField PCBrgtField;

    @FXML
    private Label PCCtrlNo;

    @FXML
    private JFXTextField PCOrNo;

    @FXML
    private JFXTextField PCAmountPaid;

    @FXML
    private JFXTextField PCORDate;

    @FXML
    private JFXButton savePC;

    @FXML
    private JFXButton printPC;

    @FXML
    private JFXButton newPedClearance;



    
    final ObservableList purposeOptions = FXCollections.observableArrayList();
     final ObservableList remarksOptions = FXCollections.observableArrayList();
         final ObservableList ownershipOptions = FXCollections.observableArrayList();
      @FXML
    private JFXComboBox purposeBox = new JFXComboBox(purposeOptions);
      
          @FXML
    private JFXComboBox remarksBox = new JFXComboBox(remarksOptions);
          
            @FXML
    private JFXComboBox BCOwnership = new JFXComboBox(ownershipOptions);
      private int webCamIndex;
  
    
    
    
    private boolean image;
    private boolean stopCamera = false;
    private Thread webCamThread;
    private File file;
    
    private  ByteArrayOutputStream bos = new ByteArrayOutputStream();
     private ClearanceService clearanceService = new ClearanceServiceImpl();
     private Webcam webcam = null;
     
        @FXML
    void BCOwnershipBox(ActionEvent event) {
        
          if(BCOwnership.getSelectionModel().getSelectedItem().equals("SINGLE PROPRIETOR")|| BCOwnership.getSelectionModel().getSelectedItem().equals("PARTNERSHIP"))
              {
                  BCLastName.setDisable(false);
                  BCFirstName.setDisable(false);
                  BCMiddleName.setDisable(false);
              }
              else
              {
                   BCLastName.setDisable(true);
                  BCFirstName.setDisable(true);
                  BCMiddleName.setDisable(true);
              }


    }

    @FXML
    void WCcapture_image(ActionEvent event) {
         if(stopCamera != true)
        {
             stopCamera = true;
         webcam.close();
        }
        else
        {
             webcam = Webcam.getDefault();
         webcam.setViewSize(new Dimension(640,480));
          webcam.open();
          BufferedImage bufferedImage = webcam.getImage();
          
          javafx.scene.image.Image imageFx = SwingFXUtils.toFXImage(bufferedImage, null);
          WCProfilePic.setImage(imageFx);
          webcam.close();
        

    }
    }

    @FXML
    void capture_image(ActionEvent event) {
         if(stopCamera != true)
        {
             stopCamera = true;
         webcam.close();
        }
        else
        {
             webcam = Webcam.getDefault();
         webcam.setViewSize(new Dimension(640,480));
          webcam.open();
          BufferedImage bufferedImage = webcam.getImage();
          
          javafx.scene.image.Image imageFx = SwingFXUtils.toFXImage(bufferedImage, null);
          profilePicId.setImage(imageFx);
          webcam.close();

        }
    }

    @FXML
    void configureSystem(ActionEvent event) throws IOException {
            webcam.close();
  AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Configuration.fxml"));
          createNew.getChildren().setAll(pane);


    }

    @FXML
    void createNewApp(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/CreateNew.fxml"));
          createNew.getChildren().setAll(pane);


    }

    @FXML
    void createNewBrgyClear(ActionEvent event) throws IOException {
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/CreateNew.fxml"));
        createNew.getChildren().setAll(pane);    
        //th.stop();


    }

    @FXML
    void createNewBusClearance(ActionEvent event) {
        Date date = new Date();
           String Buscontrol_no_format = new SimpleDateFormat("yyyy-ddhms").format(date);
        BCAmountPaid.clear();
        BCBusAdd.clear();
        BCBusName.clear();
        BCBusType.clear();
        BCBusType.clear();
        BCFirstName.clear();
        BCLastName.clear();
        BCMiddleName.clear();
        BCPlateNo.clear();
        BCORNo.clear();
        BCOwnership.getSelectionModel().select(0);
        BCCtrlNo.setText(Buscontrol_no_format);


    }

    @FXML
    void createNewPedClearance(ActionEvent event) {
        Date date = new Date();
           String Buscontrol_no_format = new SimpleDateFormat("yyyy-ddhms").format(date);
        PCAdd.clear();
        PCAmountPaid.clear();
        PCBackM.clear();
        PCBikeColor.clear();
        PCBirthdate.getEditor().clear();
        PCCLside.clear();
        PCCivilStat.getSelectionModel().select(0);
        PCCtrlNo.setText(Buscontrol_no_format);
        PCFirstName.clear();
        PCLastName.clear();
        PCMiddleName.clear();
        PCPlateNo.clear();
        PCRSide.clear();
        PCTrapColor.clear();
       
    }

    @FXML
    void createNewWorkClearance(ActionEvent event) {
        Date date = new Date();
        String Buscontrol_no_format = new SimpleDateFormat("yyyy-ddhms").format(date);
        WCAdd.clear();
        WCAge.clear();
        WCAmountPaid.clear();
        WCAppliedPos.clear();
        WCBirthdate.getEditor().clear();
        WCCitizenship.clear();
        WCCivilStat.getSelectionModel().select(0);
        WCCtrlNo.setText(Buscontrol_no_format);
        WCFirstName.clear();
        WCLastName.clear();
        WCMiddleName.clear();
        WCOrNo.clear();
        if(stopCamera == true)
        {
         stopCamera = false;
         initializeWebCam();
        }
           WCcompanyAdd.clear();
           WCcompanyName.clear();

    }

    @FXML
    void openHome(ActionEvent event) throws IOException {
        webcam.close();
          AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
          
          createNew.getChildren().setAll(pane);   


    }

    @FXML
    void printBrgyClearance(ActionEvent event)throws ServiceException{
         barangayClearanceImpl.showReport(barangayClearance);


    }

    @FXML
    void printBusClearance(ActionEvent event) throws ServiceException {
         businessClearanceImpl.showReport(businessClearance);   

    }

    @FXML
    void printPedClearance(ActionEvent event) throws ServiceException {
         pedicabClearanceImpl.showReport(pedicabClearance);   

    }

    @FXML
    void printWorkClearance(ActionEvent event) throws ServiceException {
        workingClearanceImpl.showReport(workingClearance);   
    }

    @FXML
    void purposeItemPick(ActionEvent event) {
         try {
         SqlConnect connect = new SqlConnect();
       
        
                    String query = "SELECT * FROM brgy_clearance_purpose WHERE purpose = ? " ;
                  PreparedStatement pst= connect.getDataSource().getConnection().prepareStatement(query);
                    pst.setString(1, (String) purposeBox.getSelectionModel().getSelectedItem());
                ResultSet rs =  pst.executeQuery();
              
            while(rs.next())
            {
                balanceField.setText((rs.getString("cost")));
            }
          
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    @FXML
    void regTypePick(ActionEvent event) {
        
         if("Barangay Clearance".equals(registerType.getSelectionModel().getSelectedItem()))
        {
             AnchorPane pane = new AnchorPane(brgyPane);
             clearancePane.getChildren().setAll(pane);
             brgyPane.setVisible(true);
             brgyPane.setDisable(false);
             initializeWebCam();
             busPane.setVisible(false);
             busPane.setDisable(true);
             workPane.setVisible(false);
             workPane.setDisable(true);
             pedPane.setVisible(false);
             pedPane.setDisable(true);
             barangayField.setText(UserContext.getCurrentBarangay());
             
        }
         else if("Business Clearance".equals(registerType.getSelectionModel().getSelectedItem()))
       {
              AnchorPane pane =  new AnchorPane(busPane);
             clearancePane.getChildren().setAll(pane);
               brgyPane.setVisible(true);
             brgyPane.setDisable(false);
             busPane.setVisible(true);
             busPane.setDisable(false);
             webcam.close();
             workPane.setVisible(false);
             workPane.setDisable(true);
             pedPane.setVisible(false);
             pedPane.setDisable(true);
               BCBrgyField.setText(UserContext.getCurrentBarangay());
           
      }else if ("Working Clearance".equals(registerType.getSelectionModel().getSelectedItem()))
      {
           AnchorPane pane =  new AnchorPane(workPane);
              clearancePane.getChildren().setAll(pane);
              initializeWebCam();
               brgyPane.setVisible(true);
             brgyPane.setDisable(false);
             busPane.setVisible(false);
             busPane.setDisable(true);
             workPane.setVisible(true);
             workPane.setDisable(false);
             pedPane.setVisible(false);
             pedPane.setDisable(true);
              WCBrgyField.setText(UserContext.getCurrentBarangay());

      }
      else if ("Pedicab Clearance".equals(registerType.getSelectionModel().getSelectedItem()))
      {
           AnchorPane pane =  new AnchorPane(pedPane);
              clearancePane.getChildren().setAll(pane);
               webcam.close();
               brgyPane.setVisible(true);
             brgyPane.setDisable(false);
             busPane.setVisible(false);
             busPane.setDisable(true);
             workPane.setVisible(false);
             workPane.setDisable(true);
             pedPane.setVisible(true);
             pedPane.setDisable(false);
              PCBrgtField.setText(UserContext.getCurrentBarangay());
      }


    }

    @FXML
    void resetWebcam(ActionEvent event) {
        
    
         stopCamera = false;
         initializeWebCam();
        


    }

    @FXML
    void saveBrgyClearanceRecord(ActionEvent event) throws ServiceException {
        
       
          int change;
          
       
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            String control_no_format = new SimpleDateFormat("yyyy-HmmSS").format(date);        
          
       
               
        
       barangayClearance.setId(getId());
       barangayClearance.setSurname(lastNameField.getText());
       barangayClearance.setFirstName(firstNameField.getText());
       barangayClearance.setMiddleName(middleNameField.getText());
       barangayClearance.setFullname(firstNameField.getText() + " " +  middleNameField.getText() + " " +lastNameField.getText());
       barangayClearance.setGender(genderType.getSelectionModel().getSelectedItem());
       barangayClearance.setBirthDate(birthDate.getEditor().getText());
       barangayClearance.setCity(cityField.getText());
       barangayClearance.setAddress(addressField.getText());
       barangayClearance.setAge(ageField.getText());
       barangayClearance.setRemarks(remarksBox.getSelectionModel().getSelectedItem().toString());
       barangayClearance.setCitizenship(citizenshipField.getText());
       barangayClearance.setBarangay(UserContext.getCurrentBarangay()); 
       barangayClearance.setCurrent_date(dateFormat.format(date));
       barangayClearance.setControl_no(control_no.getText());
       barangayClearance.setCivilStatus(civilStat.getSelectionModel().getSelectedItem());
       barangayClearance.setClearancePurpose(purposeBox.getSelectionModel().getSelectedItem().toString());
       barangayClearance.setCurrentAdmin(UserContext.getAdminName());
       barangayClearance.setRegCost(Integer.parseInt(balanceField.getText()));
       barangayClearance.setORNo(orNoField.getText());
       barangayClearance.setAmountPaid(amountPaidField.getText());
       barangayClearance.setClearanceType(registerType.getSelectionModel().getSelectedItem().toString());
       change = Integer.parseInt(balanceField.getText()) - Integer.parseInt(amountPaidField.getText());
       changeField.setText(String.valueOf(change));
       barangayClearance.setAmountChange(Integer.parseInt(changeField.getText()));
        BufferedImage bImage = SwingFXUtils.fromFXImage(profilePicId.getImage(), null);
        try {
            barangayClearance.setProfileImage(bImage);
            File file = new File(System.getProperty("FOLDER_LOCATION") + barangayClearance.getFullname() + ".png");
            ImageIO.write(bImage, "png", file);
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (barangayClearanceImpl.validateRecord(control_no.getText()) == true)
            {
                 JOptionPane.showMessageDialog(null, "Data Exist");
            }
        
        else if(birthDate.getEditor().getText().isEmpty() || lastNameField.getText().trim().equals("") || firstNameField.getText().trim().equals("") || middleNameField.getText().trim().equals("") || ageField.getText().trim().equals("")
                || citizenshipField.getText().trim().equals("") || cityField.getText().trim().equals("") || addressField.getText().trim().equals("") ||
                profilePicId.getImage() == null || orNoField.getText().trim().equals(""))
        {
             JOptionPane.showMessageDialog(null, "Incomplete Data Input");
        }
        else
        {
            changeField.setText(String.valueOf(change));
            barangayClearanceImpl.saveClearance(barangayClearance);
            JOptionPane.showMessageDialog(null, "Saved!");
        }


    }

    @FXML
    void saveBusClearanceRecord(ActionEvent event) throws ServiceException {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            Timestamp timestamp = new Timestamp(date.getTime());
            String control_no_format = new SimpleDateFormat("yyyy-HmmSS").format(date); 
             int change;
            
             
             if(BCOwnership.getSelectionModel().getSelectedItem().equals("SINGLE PROPRIETOR") || BCOwnership.getSelectionModel().getSelectedItem().equals("PARTNERSHIP"))
             {
                businessClearance.setId(getId());
                businessClearance.setBusinessName(BCBusName.getText());
                businessClearance.setFirstName(BCFirstName.getText());
                businessClearance.setSurname(BCLastName.getText());
                businessClearance.setMiddleName(BCMiddleName.getText());
                businessClearance.setBusinessAddres(BCBusAdd.getText() + " " + UserContext.getCurrentBarangay() + "," + UserContext.getCurrentCity());
                businessClearance.setBusinessType(BCBusType.getText());
                businessClearance.setBuildingType(BCbldgType.getSelectionModel().getSelectedItem());
                businessClearance.setOwnershipType(BCOwnership.getSelectionModel().getSelectedItem().toString());
                businessClearance.setFullName(BCFirstName.getText() + " "+ BCMiddleName.getText() + " "+ BCLastName.getText());
                businessClearance.setPlateNo(BCPlateNo.getText());
                businessClearance.setORNo(BCORNo.getText());
                businessClearance.setCtrlNo(BCCtrlNo.getText());
                businessClearance.setORDate(BCORDate.getText());
                businessClearance.setClearanceFee(BCAmountPaid.getText());
                businessClearance.setApplicationType(BCRegisterType.getSelectionModel().getSelectedItem());
                businessClearance.setCurrentDate(dateFormat.format(date));
                businessClearance.setClearanceType(registerType.getSelectionModel().getSelectedItem().toString());
                
                 if (businessClearanceImpl.validateRecord(BCCtrlNo.getText()) == true)
            {
                 JOptionPane.showMessageDialog(null, "Data Exist");
            }
        
                 else if(BCBusName.getText().trim().equals("") || BCFirstName.getText().trim().equals("") || BCLastName.getText().trim().equals("") || BCMiddleName.getText().trim().equals("") 
                        || BCBusAdd.getText().trim().equals("") || BCBusType.getText().trim().equals("") || BCOwnership.getEditor().equals("") || BCPlateNo.getText().trim().equals("") 
                        || BCORDate.getText().trim().equals("") || BCORNo.getText().trim().equals("") )
                {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }
                else
                {

                    businessClearanceImpl.saveClearance(businessClearance);
                    JOptionPane.showMessageDialog(null, "Saved!");
                }
             }
             else
             {
                businessClearance.setId(getId());
                businessClearance.setBusinessName(BCBusName.getText());
                businessClearance.setBusinessAddres(BCBusAdd.getText() + " " + UserContext.getCurrentBarangay() + "," + UserContext.getCurrentCity());
                businessClearance.setBusinessType(BCBusType.getText());
                businessClearance.setBuildingType(BCbldgType.getSelectionModel().getSelectedItem());
                businessClearance.setFullName(BCBusName.getText());
                businessClearance.setOwnershipType(BCOwnership.getSelectionModel().getSelectedItem().toString());
                businessClearance.setPlateNo(BCPlateNo.getText());
                businessClearance.setORNo(BCORNo.getText());
                businessClearance.setCtrlNo(BCCtrlNo.getText());
                businessClearance.setORDate(BCORDate.getText());
                 businessClearance.setClearanceFee(BCAmountPaid.getText());
                businessClearance.setApplicationType(BCRegisterType.getSelectionModel().getSelectedItem());
                businessClearance.setCurrentDate(dateFormat.format(date));
                businessClearance.setClearanceType(registerType.getSelectionModel().getSelectedItem());

                if (businessClearanceImpl.validateRecord(BCCtrlNo.getText()) == true)
                         {
                              JOptionPane.showMessageDialog(null, "Data Exist");
                         }
                else if(BCBusName.getText().trim().equals("") || BCBusAdd.getText().trim().equals("") || BCBusType.getText().trim().equals("") || BCOwnership.getEditor().equals("") || BCPlateNo.getText().trim().equals("") 
                                     || BCORDate.getText().trim().equals("") || BCORNo.getText().trim().equals("") )
                {
                    JOptionPane.showMessageDialog(null, "Invalid Input");
                }
                else
                {
                    //BCChange.setText(String.valueOf(change));
                    businessClearanceImpl.saveClearance(businessClearance);
                    JOptionPane.showMessageDialog(null, "Saved!");
                }
             }


    }

    @FXML
    void savePedClearanceRecord(ActionEvent event) throws ServiceException {
        
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            
            pedicabClearance.setId(getId());
            pedicabClearance.setOwnerName(PCFirstName.getText() + " " + PCMiddleName.getText() + " " + PCLastName.getText());
            pedicabClearance.setAddress(PCAdd.getText() + " " + UserContext.getCurrentBarangay() + "," + UserContext.getCurrentCity());
            pedicabClearance.setBirthDate(PCBirthdate.getEditor().getText());
            pedicabClearance.setGender(PCGender.getSelectionModel().getSelectedItem());
            pedicabClearance.setRemarks(PCRemarks.getText());
            pedicabClearance.setPlateNo(PCPlateNo.getText());
            pedicabClearance.setPedBodNo(PCPlateNo.getText());
            pedicabClearance.setExpiryDate(PCExpire.getText());
            pedicabClearance.setSideColor(PCSideColor.getText());
            pedicabClearance.setBikeColor(PCBikeColor.getText());
            pedicabClearance.setTrapColor(PCTrapColor.getText());
            pedicabClearance.setrSide(PCRSide.getText());
            pedicabClearance.setlSide(PCCLside.getText());
            pedicabClearance.setFrontMark(PCFrontM.getText());
            pedicabClearance.setBackMark(PCBackM.getText());
            pedicabClearance.setBarangay(PCBrgtField.getText());
            pedicabClearance.setBarangayKap(UserContext.getBARANGAY_CAPTAIN());
            pedicabClearance.setORNo(PCOrNo.getText());
            pedicabClearance.setORDate(PCORDate.getText());
            pedicabClearance.setControlNo(PCCtrlNo.getText());
            pedicabClearance.setCtrNo(PCPlateNo.getText());
            pedicabClearance.setCivilStat(PCCivilStat.getSelectionModel().getSelectedItem());
            pedicabClearance.setDateIssued(dateFormat.format(date));
            pedicabClearance.setCurrentAdmin(UserContext.getAdminName());
            pedicabClearance.setClearanceType(registerType.getSelectionModel().getSelectedItem());
            
            if(pedicabClearanceImpl.validateRecord(PCCtrlNo.getText()) == true)
            {
                    JOptionPane.showMessageDialog(null, "Data Exists");
                    
            } 
            else if(PCFirstName.getText().equals("") || PCMiddleName.getText().equals("") || PCLastName.getText().equals("") || PCAdd.getText().equals("") || PCBirthdate.getEditor().getText().equals("")
                    || PCGender.getSelectionModel().getSelectedItem().equals("") || PCPlateNo.getText().equals(""))
            {
                  JOptionPane.showMessageDialog(null, "Invalid Input");
            }
            else
            {
                pedicabClearanceImpl.saveClearance(pedicabClearance);
                JOptionPane.showMessageDialog(null, "Saved!");
            }
            
            
    }

    @FXML
    void saveWorkClearanceRecord(ActionEvent event) throws ServiceException {
        
        int dialogButton = JOptionPane.YES_NO_OPTION;;
          
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
           
            
            workingClearance.setId(getId());
            workingClearance.setFirstName(WCFirstName.getText());
            workingClearance.setMiddleName(WCMiddleName.getText());
            workingClearance.setLastName(WCLastName.getText());
            workingClearance.setFullName(WCFirstName.getText() + " " + WCMiddleName.getText() + " " + WCLastName.getText());
            workingClearance.setControlNo(WCCtrlNo.getText());
            workingClearance.setAddress(WCAdd.getText()  + " " + UserContext.getCurrentBarangay() + "," + UserContext.getCurrentCity());
            workingClearance.setBirthDate(WCBirthdate.getEditor().getText());
            workingClearance.setAge(WCAge.getText());
            workingClearance.setGender(WCGender.getSelectionModel().getSelectedItem());
            workingClearance.setCivilStat(WCCivilStat.getSelectionModel().getSelectedItem());
            workingClearance.setCitizenship(WCCitizenship.getText());
            workingClearance.setAppPos(WCAppliedPos.getText());
            workingClearance.setComName(WCcompanyName.getText());
            workingClearance.setComAdd(WCcompanyAdd.getText());
            workingClearance.setBarangayKap(UserContext.getBARANGAY_CAPTAIN());
            workingClearance.setBarangaySec(UserContext.getBARANGAY_SEC());
            workingClearance.setBarangay(WCBrgyField.getText());
            workingClearance.setCurrentDate(dateFormat.format(date));
            workingClearance.setRemarks(WCRemarks.getText());
            workingClearance.setCurrentAdmin(UserContext.getAdminName());
            workingClearance.setClearanceType(registerType.getSelectionModel().getSelectedItem());
            BufferedImage bImage = SwingFXUtils.fromFXImage(WCProfilePic.getImage(), null);
             try {
                workingClearance.setProfileImage(bImage);
                File file = new File(System.getProperty("FOLDER_LOCATION") + workingClearance.getFullName() + registerType.getSelectionModel().getSelectedItem() + ".png");
                ImageIO.write(bImage, "png", file);
            } catch (IOException e) {
                e.printStackTrace();
            }
             if (workingClearanceImpl.validateRecord(WCCtrlNo.getText()) == true)
            {
                 JOptionPane.showMessageDialog(null, "Data Exist");
            }
            else if(WCFirstName.getText().equals("") || WCMiddleName.getText().equals("") || WCLastName.getText().equals("")
                    || WCAdd.getText().equals("") || WCAge.getText().equals("")  || WCcompanyAdd.getText().equals("")
                    || WCcompanyName.getText().equals(""))
            {
                 JOptionPane.showMessageDialog(null, "Invalid Input");
            }
            else 
            {
                    workingClearanceImpl.saveClearance(workingClearance);
                     JOptionPane.showMessageDialog(null, "Saved!");
               
            }
    }

    @FXML
    void signOutCapitan(ActionEvent event) throws IOException {
        
        webcam.close();
         AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
          createNew.getChildren().setAll(pane);


    }

    @FXML
    void viewRecords(ActionEvent event) {

    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        initializeWebCam();
        
        
        barangayClearance.setBarangayCapt(UserContext.getBARANGAY_CAPTAIN());
        barangayClearance.setBarangayKag1(UserContext.getKAGAWAD_1());
        barangayClearance.setBarangayKag2(UserContext.getKAGAWAD_2());
        barangayClearance.setBarangayKag3(UserContext.getKAGAWAD_3());
        barangayClearance.setBarangayKag4(UserContext.getKAGAWAD_4());
        barangayClearance.setBarangayKag5(UserContext.getKAGAWAD_5());
        barangayClearance.setBarangayKag6(UserContext.getKAGAWAD_6());
        barangayClearance.setBarangayKag7(UserContext.getKAGAWAD_7());
        barangayClearance.setBarangaySec(UserContext.getBARANGAY_SEC());
        barangayClearance.setBarangayTres(UserContext.getBARANGAY_TRES());
        
        BCBrgyField.setText(UserContext.getCurrentBarangay());
        businessClearance.setBrgyCapt(UserContext.getBARANGAY_CAPTAIN());
        businessClearance.setBarangay(UserContext.getCurrentBarangay());
      
        try {
            purposeBox.getItems().addAll(barangayClearanceImpl.loadComboBox(purposeOptions));
           purposeBox.getSelectionModel().select(1);
        } catch (ServiceException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try
        {
            remarksBox.getItems().addAll(barangayClearanceImpl.loadRemarksBox(remarksOptions));
            remarksBox.getSelectionModel().select(1);
        }catch (ServiceException ex)
        {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            BCOwnership.getItems().addAll(businessClearanceImpl.loadBusinessType(ownershipOptions));
            BCOwnership.getSelectionModel().select(0);
        } catch (ServiceException ex) {
            Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
            BCbldgType.getItems().addAll("RENTED" , "OWNED");
            BCbldgType.getSelectionModel().select("OWNED");
//     
       
       
            registerType.getItems().addAll("Barangay Clearance","Business Clearance","Working Clearance","Pedicab Clearance");
            registerType.getSelectionModel().select("Barangay Clearance");
            
            barangayField.setText(UserContext.getCurrentBarangay());
          
    
            genderType.getItems().addAll("Male","Female");
            genderType.getSelectionModel().select("Male");
            WCGender.getItems().addAll("Male" , "Female");
            WCGender.getSelectionModel().select("Male");
            PCGender.getItems().addAll("Male" , "Female");
            PCGender.getSelectionModel().select("Male");
            
            civilStat.getItems().addAll("Single","Married","Divorced","Widowed");
            civilStat.getSelectionModel().select("Single");
            WCCivilStat.getItems().addAll("Single","Married","Divorced","Widowed");
            WCCivilStat.getSelectionModel().select("Single");
            PCCivilStat.getItems().addAll("Single","Married","Divorced","Widowed");
            PCCivilStat.getSelectionModel().select("Single");
           

            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            Date date = new Date();
            String control_no_format = new SimpleDateFormat("yyyy-ddhms").format(date);
            String time_format = new SimpleDateFormat("hh:mm a").format(date);
               long year = TimeUnit.MILLISECONDS.convert(365, TimeUnit.DAYS);
              Date expiry = new Date(System.currentTimeMillis() + year);
              String expire = new SimpleDateFormat("MM/dd/yyyy").format(expiry);
            time_label.setText(time_format);
            date_label.setText(dateFormat.format(date));
            
             control_no.setText(control_no_format);
             BCCtrlNo.setText(control_no_format);
             WCCtrlNo.setText(control_no_format);
             PCCtrlNo.setText(control_no_format);
          
           
            BCORDate.setText(dateFormat.format(date));
            BCRegisterType.getItems().addAll("NEW","RENEWAL");
            BCRegisterType.getSelectionModel().select("NEW");
            PCExpire.setText(expire);
            PCORDate.setText(dateFormat.format(date));
            
     
            if(barangayClearance.getId() != 0)
            {
             
            try {
                 String query = "SELECT * FROM bgy_clearance";
                Statement st = this.getConnection().createStatement();
                ResultSet  rs= st.executeQuery(query);
                while(rs.next())
                {
                    int ctrlNo = rs.getInt("control_no");
                    System.out.println(ctrlNo);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(RegisterController.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
            
            //initializeWebCam();
       System.out.println("Number of Active Threads " + Thread.activeCount());
         
 }
   
    protected void initializeWebCam() {
        if(webCamTask != null) {
            webCamTask.cancel();
        }
        else
        {
             webCamTask = new Task<Void>() {

            @Override
            protected Void call() throws Exception {
                
                webcam = Webcam.getDefault();
                webcam.open();

                
                startWebCamStream();
                startWCCamStream();
                return null;

            }
        };
       
        }
        
    
        webCamThread = new Thread(webCamTask);
        webCamThread.setDaemon(true);
        webCamThread.start();
        System.out.println("active thread count: " + webCamThread.activeCount());

    }
  
    protected void startWebCamStream() throws InterruptedException {
         if(webCamTask != null) {
            webCamTask.cancel();
        }
            stopCamera = false;

		webCamTask = new Task<Void>() {

			@Override
			protected Void call() throws Exception {

				final AtomicReference<WritableImage> ref = new AtomicReference<>();
				BufferedImage img = null;

				while (!stopCamera) {
					try {
						if ((img = webcam.getImage()) != null) {

							ref.set(SwingFXUtils.toFXImage(img, ref.get()));
							img.flush();

							Platform.runLater(new Runnable() {

								@Override
								public void run() {
									imageProperty.set(ref.get());
								}
							});
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				return null;
			}
		};

		Thread th = new Thread(webCamTask);
		th.setDaemon(true);
		th.start();
		profilePicId.imageProperty().bind(imageProperty);

	}
    private Task<Void> startWCCamStream;
    protected void startWCCamStream()
    {   
        if(startWCCamStream != null) {
            startWCCamStream.cancel();
        }
         stopCamera = false;
         
		startWCCamStream = new Task<Void>() {

			@Override
			protected Void call() throws Exception {

				final AtomicReference<WritableImage> ref = new AtomicReference<>();
				BufferedImage img = null;

				while (!stopCamera) {
					try {
						if ((img = webcam.getImage()) != null) {

							ref.set(SwingFXUtils.toFXImage(img, ref.get()));
							img.flush();

							Platform.runLater(new Runnable() {

								@Override
								public void run() {
									imageProperty.set(ref.get());
								}
							});
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

				return null;
			}
		};
                
		Thread th = new Thread(startWCCamStream);
		th.setDaemon(true);
		th.start();
		WCProfilePic.imageProperty().bind(imageProperty);
    }
    

    }    
