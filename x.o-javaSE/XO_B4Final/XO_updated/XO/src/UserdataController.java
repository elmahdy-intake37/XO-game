/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */
public class UserdataController implements Initializable {
@FXML
Alert alert =new Alert (Alert.AlertType.INFORMATION);
@FXML
private TextArea fn;
@FXML
private TextArea ln;
@FXML
private TextArea un;
@FXML 
private Button submit;
@FXML
private TextArea ps;
@FXML
private Button back;

String first_name ;
String last_name ;
String username ;
 String password;
//@FXML
//private Button reset;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
     
    
    }
    	
    @FXML
   public void handleButtonAction(ActionEvent event) throws IOException
   {
         first_name =fn.getText().toString();

   last_name =ln.getText().toString();
 username = un.getText().toString();
  password= ps.getText().toString();
     
        if(fn.getText().equals("")||ln.getText().equals("")||un.getText().equals("")||ps.getText().equals(""))
        {
            alert.setTitle("Missing Fields");
            alert.setContentText("Please fill the required fields");
            alert.showAndWait();
            
        }
        else
        {
                    try 
                   {
                       Class.forName("com.mysql.jdbc.Driver");  //driver class
                       Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tictactoe","root","root"); //getconnection of MySql Server 
                       //Statement stmt = con.createStatement(); //creating a connection statement 
                      
                       PreparedStatement pst1= con.prepareStatement("select username from player where username=?");
                       pst1.setString(1,username);
                     System.out.println(username);
                       ResultSet rs=pst1.executeQuery();
                       if(rs.next())
                       {
                          
                           if(rs.getString(1).equals(username))
                           {
                               
                                alert.setTitle("Username Already Exists");
                                alert.setContentText("User already exists please sign-in or choose a different name");
                                alert.showAndWait();  
                           }
                           else
                           {
                                PreparedStatement pst= con.prepareStatement("INSERT INTO player(first_name,last_name,username,password) VALUES(?,?,?,?)");
                                pst.setString(1,first_name);
                                pst.setString(2,last_name);
                                pst.setString(3,username);
                                pst.setString(4,password);
                                pst.executeUpdate(); 
                               try
                            {  
                            Stage stage; 
                            Parent root;
                            if(event.getSource()== submit){
                               //get reference to the button's stage         
                               stage=(Stage) submit.getScene().getWindow();
                               //load up OTHER FXML document
                            //root = FXMLLoader.load(getClass().getResource("diffrent.fxml"));
                        FXMLLoader loader = new FXMLLoader();
                         root =loader.load(getClass().getResource("diffrent.fxml")); 
                         con =loader.getController();
                              
                               Scene scene = new Scene(root);

                               stage.setScene(scene);
                               stage.show();
                             }
                            else{

                             } }
                           catch(IOException e){e.printStackTrace();}
  
                           }

                       }
                       else
                       {
                       PreparedStatement pst= con.prepareStatement("INSERT INTO player(first_name,last_name,username,password) VALUES(?,?,?,?)");
                       pst.setString(1,first_name);
                       pst.setString(2,last_name);
                       pst.setString(3,username);
                       pst.setString(4,password);
                       pst.executeUpdate(); 
                            try
                            {  
                            Stage stage; 
                            Parent root;
                            if(event.getSource()== submit){
                               //get reference to the button's stage         
                               stage=(Stage) submit.getScene().getWindow();
                               //load up OTHER FXML document
                           // root = FXMLLoader.load(getClass().getResource("diffrent.fxml"));
 FXMLLoader loader = new FXMLLoader();
                         root =loader.load(getClass().getResource("diffrent.fxml")); 
                               con =loader.getController();
                               Scene scene = new Scene(root);

                               stage.setScene(scene);
                               stage.show();
                             }
                            else{

                             } }
                           catch(IOException e){e.printStackTrace();}

                       }

          
        }
        catch(ClassNotFoundException | SQLException ex)
        { 
        System.out.println("Where is your MySQL JDBC Driver?");
        }
 
            
            
            
        }
   
    
     
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
                            root = FXMLLoader.load(getClass().getResource("signupin.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            else{} 
                     }
                        catch(IOException e){}
           } 
           
       @FXML
	public void resetAction(ActionEvent event) throws IOException    
        {
            un.clear();
            ps.clear();
            fn.clear();
            ln.clear();
        }

   
   
          
  }
    
    
    
