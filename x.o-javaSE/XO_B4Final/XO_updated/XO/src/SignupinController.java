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
public class SignupinController implements Initializable {

    /**
     * Initializes the controller class.
     */
	 @FXML 
    private Button back;
	 @FXML 
    private Button sign_up;
         @FXML
	private Button signin;
    
    @FXML
   public void sign_upAction(ActionEvent event) throws IOException{
        System.out.println("here");
       try{  
     Stage stage; 
     Parent root;
   //  if(event.getSource()== sign_up){
        //get reference to the button's stage         
        stage=(Stage) sign_up.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("userdata.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
       // stage.show();
      //}
    // else{
       
       }
    catch(IOException e){
    e.printStackTrace();
    }
  
    }
	
	@FXML
	   public void signinAction(ActionEvent event) throws IOException{
    try{  
     Stage stage; 
     Parent root;
     if(event.getSource()== signin){
        //get reference to the button's stage         
        stage=(Stage) signin.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("signin.fxml"));
        
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
    
    
    
    @FXML
	   public void backAction(ActionEvent event) throws IOException
           {
             try
                     {  
                          Stage stage; 
                          Parent root;
                          if(event.getSource()== back)
                           {
                            //get reference to the button's stage         
                            stage=(Stage) back.getScene().getWindow();
                            //load up OTHER FXML document
                            root = FXMLLoader.load(getClass().getResource("play.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            else{} 
                     }
                        catch(IOException e){}
           } 
    
}
