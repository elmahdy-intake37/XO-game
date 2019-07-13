/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;



/**
 * FXML Controller class
 *
 * @author Esraa
 */
 
public class PcplayController implements Initializable {

    /**
     * Initializes the controller class.
     */
     @FXML
private Label winner_label;
@FXML
    private Button back; 
    @FXML
   private TextArea winner;
    @FXML
   private TextArea  scoreO;
     @FXML
   private TextArea  scoreX;
    @FXML
     private Button b1;
    @FXML
    private Button b2; 
     @FXML
    private Button b3;
    @FXML
     private Button b4;
    @FXML
    private Button b5;
      @FXML
    private Button b6; 
      @FXML
      private Button b7; 
       @FXML
      private Button b8;
       @FXML
       private Button b9;
       @FXML
       int count=0;
        @FXML
       int x=0;
         @FXML
       int o=0;
         @FXML
       String   K ;
         
       @FXML
     private Button play;  
         
       @FXML 
        int []arr ={-1,-1,-1,-1,-1,-1,-1,-1,-1} ;
       
     
    @FXML
    Alert alert =new Alert (AlertType.INFORMATION);

@FXML
Boolean win ;

private Stage myStage;
private Scene myscene;
private Parent root;

 
@FXML
  public void handleButtonAction(ActionEvent a) {
       
        String letter="" ;
 count++;

if(count == 1 || count == 3 || count == 5 || count == 7 || count == 9){
            letter = "X";
} else if(count == 2 || count == 4 || count == 6 || count == 8 ){
             letter = "O";
}

 if(a.getSource() == b1 && "X".equals(letter)){
b1.setText(letter);
b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b1.setStyle("-fx-text-fill: Crimson;") ;
b1.setDisable(true);
arr[count-1]=0;
} else if(a.getSource() == b1 && "O".equals(letter)){
b1.setText(letter);
b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
     b1.setStyle("-fx-text-fill: Orange;") ;
b1.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b2 && "X".equals(letter)){
b2.setText(letter);
b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b2.setStyle("-fx-text-fill: Crimson;") ; 
b2.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b2 && "O".equals(letter)){
b2.setText(letter);
b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
     b2.setStyle("-fx-text-fill: Orange;") ; 
b2.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b3 && "X".equals(letter)){
b3.setText(letter);
b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b3.setStyle("-fx-text-fill: Crimson;") ;  
b3.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b3 && "O".equals(letter)){
b3.setText(letter);
b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b3.setStyle("-fx-text-fill: Orange;") ;   
b3.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b4 && "X".equals(letter)){
b4.setText(letter);
b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
      b4.setStyle("-fx-text-fill: Crimson;") ;
b4.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b4 && "O".equals(letter)){
b4.setText(letter);
b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
 b4.setStyle("-fx-text-fill: Orange;") ; 
b4.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b5 && "X".equals(letter)){
b5.setText(letter);
b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b5.setStyle("-fx-text-fill: Crimson;") ;  
b5.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b5 && "O".equals(letter)){
b5.setText(letter);
b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b5.setStyle("-fx-text-fill: Orange;") ;   
b5.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b6 && "X".equals(letter)){
b6.setText(letter);
b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b6.setStyle("-fx-text-fill: Crimson;") ;  
b6.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b6 && "O".equals(letter)){
b6.setText(letter);
b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b6.setStyle("-fx-text-fill: Orange;") ;   
b6.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b7 && "X".equals(letter)){
b7.setText(letter);
b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
     b7.setStyle("-fx-text-fill: Crimson;") ; 
b7.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b7 && "O".equals(letter)){
b7.setText(letter);
b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b7.setStyle("-fx-text-fill: Orange;") ;   
b7.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b8 && "X".equals(letter)){
b8.setText(letter);
b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b8.setStyle("-fx-text-fill: Crimson;") ;  
b8.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b8 && "O".equals(letter)){
b8.setText(letter);
b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b8.setStyle("-fx-text-fill: Orange;") ;   
b8.setDisable(true);
arr[count-1]=1;
}
 else if(a.getSource() == b9 && "X".equals(letter)){
b9.setText(letter);
b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
    b9.setStyle("-fx-text-fill: Crimson;") ;  
b9.setDisable(true);
arr[count-1]=0;
}
 else if(a.getSource() == b9 && "O".equals(letter)){
b9.setText(letter);
b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
  b9.setStyle("-fx-text-fill: Orange;") ;   
b9.setDisable(true);
arr[count-1]=1;
}
 
if( b1.getText() == b2.getText() && b2.getText() == b3.getText() && b1.getText() != ""){
win = true;
}
else if(b4.getText() == b5.getText() && b5.getText() == b6.getText() && b4.getText() != ""){
win = true;
}
else if(b7.getText() == b8.getText() && b8.getText() == b9.getText() && b7.getText() != ""){
win = true;
}

//virticle wins
else if(b1.getText() == b4.getText() && b4.getText() == b7.getText() && b1.getText() != ""){
win = true;
}
else if(b2.getText() == b5.getText() && b5.getText() == b8.getText() && b2.getText() != ""){
win = true;
}
else if(b3.getText() == b6.getText() && b6.getText() == b9.getText() && b3.getText() != ""){
win = true;
}

//diagonal wins
else if(b1.getText() == b5.getText() && b5.getText() == b9.getText() && b1.getText() != ""){
win = true;
}
else if(b3.getText() == b5.getText() && b5.getText() == b7.getText() && b3.getText() != ""){
win = true;
}
else {
win = false;
}

if(win == true){
    
    //  winner.setText(letter);
    
    //-------------------------------------
      try{  
     
        root = FXMLLoader.load(getClass().getResource("win.fxml"));
        myStage = (Stage) winner_label.getScene().getWindow();
        myscene = new Scene(root);
        myStage.setScene(myscene);
        
      }    
      catch (IOException ex) 
      {
        Logger.getLogger(PcplayController.class.getName()).log(Level.SEVERE, null, ex);
       }
     
  
  
      //-------------------------------------

      
      
	//alert.setTitle("WINNER");
     // alert.setContentText(letter +" WINS !");
     // alert.showAndWait();
     
      if("X".equals(letter))
      {
      x = Integer.parseInt(scoreX.getText());
      x+=10;
          String k = String.valueOf(x);
      scoreX.setText(k);
      }
      else  if("O".equals(letter))
      {
      o=Integer.parseInt(scoreO.getText());
        o+=10;
          String k = String.valueOf(o);
      scoreO.setText(k);
      }
     
      
}
 else if(count == 9 && win == false){

     //winner.setText("draw");
		alert.setTitle("GAME OVER");
      alert.setContentText("Draw");
      alert.showAndWait();

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
                            root = FXMLLoader.load(getClass().getResource("play.fxml"));

                            Scene scene = new Scene(root);

                            stage.setScene(scene);
                            stage.show();
                            }
                            else{} 
                     }
                        catch(IOException e){}
           } 
           
    
}// class
