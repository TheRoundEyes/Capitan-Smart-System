/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.circuit.utils;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamEvent;
import com.github.sarxos.webcam.WebcamListener;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javax.imageio.ImageIO;



/**
 *
 * @author Marvin
 */
public class WebcamCapture {
    
  

   
        
        public void openWebcam() throws IOException
        {
//         Webcam webcam = Webcam.getDefault();
//          
//         
//          webcam.setViewSize(WebcamResolution.VGA.getSize());
//          webcam.open();
//          
//          BufferedImage bufferedImage = webcam.getImage();
//          javafx.scene.image.Image imageFx = SwingFXUtils.toFXImage(bufferedImage, null);
//          profilePicId.setImage(imageFx);
//           ByteArrayOutputStream baos = new ByteArrayOutputStream();
//            ImageIO.write(bufferedImage, "JPG", baos);
//              byte [] res = baos.toByteArray();
//            ByteArrayInputStream is=new ByteArrayInputStream(res);
//            profilePicId.setImage(new Image(is));
//            baos.close();
//             Base64.encode(res);
//          
//          
//          webcam.close();
    }

    public void start(Stage stage) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
        
   


}