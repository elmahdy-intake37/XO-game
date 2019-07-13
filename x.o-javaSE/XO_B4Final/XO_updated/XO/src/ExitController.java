/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */


public class ExitController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private Button no;
    @FXML 
    private Button exit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    
    
    @FXML
	   public void exit(ActionEvent event) throws IOException
           {
             System.exit(0);
    
           }
           
           
       @FXML
	   public void nothing(ActionEvent event) throws IOException
           {
             try
                     {  
                          Stage stage; 
                          Parent root;
                          if(event.getSource()== no)
                           {
                            //get reference to the button's stage         
                            stage=(Stage) no.getScene().getWindow();
                            //load up OTHER FXML document
                            root = FXMLLoader.load(getClass().getResource("levels.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            
                     }
                        catch(IOException e){}
           } 
    
           }    
           
    

