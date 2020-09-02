/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.main;

import com.circuit.db.impl.AdminAccountImpl;
import com.circuit.exception.ServiceException;
import com.circuit.obj.capitanObj.UserContext;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Marvin
 */
public class Main extends Application  {
    
    AdminAccountImpl adminAccountImpl = new AdminAccountImpl();
    UserContext userContext = new UserContext();
      
    
    
    
    
    @FXML
    private AnchorPane loginPane;

    @FXML
    public JFXTextField usernameInput;

    @FXML
    private JFXPasswordField passwordInput;
    
    @FXML
    private JFXButton loginBtn;
  
  
    
    //UserContext context;
    @FXML
    void loginAccount(ActionEvent event) throws IOException, ServiceException{
        
        
        if(adminAccountImpl.validateLogin(usernameInput.getText().trim(),passwordInput.getText().trim()) == true )
        {
                AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Main.fxml"));
                loginPane.getChildren().setAll(pane);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Wrong Credentials!");
            System.out.println("Error");
        }
        
       

    }
    @Override
    public void start(Stage primaryStage) throws  IOException{
         primaryStage.setTitle("Capitan");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"));
            Scene myScene = new Scene(pane);        
            primaryStage.setScene(myScene);
            primaryStage.setResizable(false);
            primaryStage.show();
     
            
            
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
