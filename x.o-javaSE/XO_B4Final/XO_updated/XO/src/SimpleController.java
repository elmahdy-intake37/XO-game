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
public class SimpleController implements Initializable {

    /**
     * Initializes the controller class.
     */
    /*
    
    
    */
    @FXML 
    private Button label;
    
    @FXML
   public void handleButtonAction(ActionEvent event) throws IOException{
    try{  
     Stage stage; 
     Parent root;
     if(event.getSource()== label){
        //get reference to the button's stage         
        stage=(Stage) label.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("play.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     else{
       
      } }
    catch(IOException e){}
  
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
        
        // TODO
    }    

    private void getScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
