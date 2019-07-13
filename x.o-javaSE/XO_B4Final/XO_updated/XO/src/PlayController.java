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
public class PlayController implements Initializable {

    /**
     * Initializes the controller class.
     */
	DiffrentController con;
     @FXML 
    private Button pc;
     @FXML 
    private Button back;
    @FXML
    private Button same_pc;
    
    @FXML 
    private Button com;
    
     @FXML
    public  void handleButtonAction(ActionEvent event)  throws IOException

    {
      try{  
        Stage stage; 
     Parent root;
     if(event.getSource()== pc){
        //get reference to the button's stage         
        stage=(Stage) pc.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("signupin.fxml"));
     /*   FXMLLoader loader = new FXMLLoader();
	 root =loader.load(getClass().getResource("signupin.fxml")); 
	      con =loader.getController();*/
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     
     
      }
      
       catch(IOException e){}
        
    }
    
    @FXML
    public void sameAction(ActionEvent event)  throws IOException

    {
      try{  
        Stage stage; 
     Parent root;
     if(event.getSource()== same_pc){
        //get reference to the button's stage         
        stage=(Stage) same_pc.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("pcplay.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     else{
       
      } }
    catch(IOException e){}
        
    }

    
    
     @FXML
    public void computer(ActionEvent event)  throws IOException

    {
      try{  
        Stage stage; 
     Parent root;
     if(event.getSource()== com){
        //get reference to the button's stage         
        stage=(Stage) com.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("levels.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
     else{
       
      } }
    catch(IOException e){}
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     /*elseif(event.getSource()== pc){
        //get reference to the button's stage         
        stage=(Stage) pc.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("signupin.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }
	  else if(event.getSource()== pc){
        //get reference to the button's stage         
        stage=(Stage) pc.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("signupin.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }*/
         
         
         /*
          if(event.getSource()== computer){
        //get reference to the button's stage         
        stage=(Stage) computer.getScene().getWindow();
        //load up OTHER FXML document
  root = FXMLLoader.load(getClass().getResource("computerhuman.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
      }

	  }
    catch(IOException e){}
        
    }*/
    
    
       
    
    
    
    
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
                            root = FXMLLoader.load(getClass().getResource("levels.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            else{} 
                     }
                        catch(IOException e){}
           } 
           
    
   
}
