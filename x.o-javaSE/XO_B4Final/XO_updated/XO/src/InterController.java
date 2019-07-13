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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Esraa
 */
public class InterController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
           @FXML
 private Button back;
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
private Label winner_label;
       @FXML 
       int []arr ={-1,-1,-1,-1,-1,-1,-1,-1,-1} ;
       
     
    @FXML
    Alert alert =new Alert (Alert.AlertType.INFORMATION);

@FXML
Boolean win ;


private Stage myStage;
private Scene myscene;
private Parent root;
     @FXML
  public void handleButtonAction(ActionEvent a) {
       
        String letter="" ;
        count++;

if(count ==1 ||count ==3 ||count ==5 ||count ==7 ||count ==9 ){
      
            letter = "X";


 if(a.getSource() == b1 ){
b1.setText(letter);
b1.setDisable(true);
arr[0]=0;

} 
 else if(a.getSource() == b2 ){
b2.setText(letter);
b2.setDisable(true);
arr[1]=0;

}
 
 else if(a.getSource() == b3 ){
b3.setText(letter);
b3.setDisable(true);
arr[2]=0;

}
 
 else if(a.getSource() == b4 ){
b4.setText(letter);
b4.setDisable(true);
arr[3]=0;

}
 
 else if(a.getSource() == b5 ){
b5.setText(letter);
b5.setDisable(true);
arr[4]=0;

}

 else if(a.getSource() == b6){
b6.setText(letter);
b6.setDisable(true);
arr[5]=0;

}
 else if(a.getSource() == b7 ){
b7.setText(letter);
b7.setDisable(true);
arr[6]=0;

}
 
 else if(a.getSource() == b8 ){
b8.setText(letter);
b8.setDisable(true);
arr[7]=0;

}

 else if(a.getSource() == b9 ){
b9.setText(letter);
b9.setDisable(true);
arr[8]=0;

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
//-------------------------

    try {

        root = FXMLLoader.load(getClass().getResource("interwin.fxml"));
        myStage = (Stage) winner_label.getScene().getWindow();
        myscene = new Scene(root);
        myStage.setScene(myscene);

    } catch (IOException ex) {
        Logger.getLogger(PcplayController.class.getName()).log(Level.SEVERE, null, ex);
    }

//------------------------
    
}
 else if(count == 9 && win == false){

		alert.setTitle("GAME OVER");
      alert.setContentText("PLAY AGAIN!!");
      alert.showAndWait();

 } 

count ++;
}
         if (count ==2||count ==4||count ==6||count ==8)

         {
             letter = "O";
       
 //          Random ran=new Random();
   //          int f = ran.nextInt(9)+1;
            /*
             System.out.println(f);
             System.out.println(arr[f-1]);*/
            int i=0;
            int F;
            int [] f={5,1,3,7,9,2,4,8,6};
            F=f[i];
       try{    while(arr[f[i]-1]!= -1 || arr[f[i]-1] == 0 || arr[f[i]-1] == 1)
      {   
          
     //       f = ran.nextInt(9)+1;
           i++;
            F = f[i];
             if(i>8)
             {i=0;}
            
      } }catch(Exception e ){ }
       
          switch (F) {
             case 1:
                b1.setText(letter);
                arr[0]=1;
                b1.setDisable(true);
                break;
             case 2:
                    b2.setText(letter);
                arr[1]=1;
                b2.setDisable(true);
                break;
              case 3:
                b3.setText(letter);
                arr[2]=1;
                b3.setDisable(true);
                break;
              case 4:
                 b4.setText(letter);
                arr[3]=1;
                b4.setDisable(true);
                break;
              case 5:
                b5.setText(letter);
                arr[4]=1;
                b5.setDisable(true);
                break;
              case 6:
                b6.setText(letter);
                arr[5]=1;
                b6.setDisable(true);
                break;
              case 7:
                b7.setText(letter);
                arr[6]=1;
                b7.setDisable(true);
                break;
              case 8:
                b8.setText(letter);
                arr[7]=1;
                b8.setDisable(true);
                break;
                case 9:
                b9.setText(letter);
                arr[8]=1;
                b9.setDisable(true);
                break;
              default:
            alert.setTitle("msg err");
            alert.setContentText("invalid entery");
            alert.showAndWait();
            break;
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

    try {

        root = FXMLLoader.load(getClass().getResource("comp_win.fxml"));
        myStage = (Stage) winner_label.getScene().getWindow();
        myscene = new Scene(root);
        myStage.setScene(myscene);

    } catch (IOException ex) {
        Logger.getLogger(PcplayController.class.getName()).log(Level.SEVERE, null, ex);
    }

    
    
    
//	alert.setTitle("WINNER");
  //    alert.setContentText(letter +" WINS !");
    //  alert.showAndWait();
}
 else if(count == 9 && win == false){

       alert.setTitle("GAME OVER");
      alert.setContentText("DRAW");
      alert.showAndWait();
      

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
