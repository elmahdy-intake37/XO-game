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


public class TryController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    private Button exit1;
    @FXML 
    private Button btn;
    @FXML
 private Button back;
    @FXML
    private Button intermediate;
    /**
     *
     * @param event
     * @throws IOException
     */
    
    @FXML
    protected void handleButtonAction(ActionEvent event)  throws IOException

    {
      try{  
        Stage stage; 
     Parent root;
     if(event.getSource()== btn){
        //get reference to the button's stage         
        stage=(Stage) btn.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("computer.fxml"));
        
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
                            root = FXMLLoader.load(getClass().getResource("homepage.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            else{} 
                     }
                        catch(IOException e){}
           }
           
             @FXML
    protected void intermediateAction(ActionEvent event)  throws IOException

    {
      try{  
        Stage stage; 
     Parent root;
     if(event.getSource()== intermediate){
        //get reference to the button's stage         
        stage=(Stage) intermediate.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("inter.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     else{
       
      } }
    catch(IOException e){}
        
    }
           
 
    @FXML
	   public void exitAction(ActionEvent event) throws IOException
           {
             try
                     {  
                          Stage stage; 
                          Parent root;
                          if(event.getSource()== exit1)
                           {
                            //get reference to the button's stage         
                            stage=(Stage) exit1.getScene().getWindow();
                            //load up OTHER FXML document
                            root = FXMLLoader.load(getClass().getResource("exit.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            
                     }
                        catch(IOException e){}
           } 
 
}
