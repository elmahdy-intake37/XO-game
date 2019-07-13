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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */
public class DiffrewinController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
      @FXML
     private TextField my_winner;
    @FXML
    private Button play_again;
    @FXML
    private Button exit;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }  
    
    @FXML
   public void playagainAction(ActionEvent event)
   {
     try{  
     Stage stage; 
     Parent root;
     if(event.getSource()== play_again){
        //get reference to the button's stage         
        stage=(Stage) play_again.getScene().getWindow();
        //load up OTHER FXML document
    root = FXMLLoader.load(getClass().getResource("diffrent.fxml"));
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     else{
       
      } }
    catch(IOException e){}
  
    }   
       
   
   
   @FXML
   public void exitAction(ActionEvent event)
   {
         System.exit(0);
   }
    
    
    
}
