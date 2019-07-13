/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */
public class InterwinController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
     @FXML
    private ImageView winning_image;
    
    private Stage myStage;
    private Scene myscene;
    private Parent root;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        Thread timer = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(1000); //1000 milliseconds is one second.
                    }
                    catch (InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }finally
                        {
                            //System.out.println("Testing");
                            try 
                            {
                             //calling the root node of the new destintion 
                                root = FXMLLoader.load(getClass().getResource("interrewin.fxml"));
                            } catch (IOException ex)
                            {
                                ex.printStackTrace();
                            }
                            Platform.runLater(new Runnable() {
                            @Override public void run() 
                            {
                             //get a the new scene and referencing it to my stge
                                myStage = (Stage) winning_image.getScene().getWindow();
                                myscene = new Scene(root);
                                myStage.setScene(myscene);
                            }
                            });
                        }
                    }
                 });
                timer.start();
        
        
        
        
        
        
        
        
    }    
        
        
    }    
    

