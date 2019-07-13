/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */
public class SigninController implements Initializable {

    /**
     * Initializes the controller class.
     */
    //@FXML
    //private Button reset;
    @FXML
    private Button back;
    @FXML 
    private Button submit;
    @FXML
    private TextArea usrnm;
    @FXML
    private TextArea  pass;
    @FXML
    Alert alert =new Alert (AlertType.INFORMATION);
    @FXML
   public void handleButtonAction(ActionEvent event) throws IOException{
    
   if(usrnm.getText().equals("") || pass.getText().equals(""))
   {
     alert.setTitle("Missing Fields");
     alert.setContentText("Please fill the required fields");
     alert.showAndWait();   
   }
   else
   {
     try 
        { 
            String username = usrnm.getText();
            String password=pass.getText();
            Class.forName("com.mysql.jdbc.Driver");  //driver class
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/tictactoe","root","root"); //getconnection of MySql Server 
            //Statement stmt = con.createStatement(); //creating a connection statement 
            PreparedStatement pst= con.prepareStatement("select username,password from player where username=?  and password=? ");
            pst.setString(1,username);
            pst.setString(2,password);
            ResultSet rs=pst.executeQuery();
           
            if(rs.next())
            {
                   if(rs.getString(1).equals(username)&& rs.getString(2).equals(password))  //wadeny lel pcgame
                   {System.out.println("here");
                     try
                     {  
                         System.out.println("ahlaaan");
                          Stage stage; 
                          Parent root;
                          if(event.getSource()== submit)
                           {
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
                            else{} 
                     }
                        catch(IOException e){}
                   }
                 }
            else if (!rs.next())
            {
            PreparedStatement pst1= con.prepareStatement("select username from player where username=?");
            pst1.setString(1,username);
            ResultSet rs1=pst1.executeQuery();
                if(rs1.next())
                {
                alert.setTitle("Invalid Password");
                alert.setContentText("Please insert the correct password ");
                alert.showAndWait(); 
                }
                else
            {
             System.out.println("Please insert a valid user name or password ");
                alert.setTitle("Invalid Username or Password");
                alert.setContentText("Please Insert a Valid Username or Password ");
                alert.showAndWait();
            }
            }
            
           
        }
        catch(ClassNotFoundException | SQLException ex)
        { 
        System.out.println("Where is your MySQL JDBC Driver?");
        }
   }  
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
            usrnm.clear();
            pass.clear();
        }
           
}
