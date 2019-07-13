/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import InterfaceS.ServerInt;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.LoadException;

/**
 * FXML Controller class
 *
 * @author Hager
 */
public class DiffrentController implements Initializable {

ServerInt ref;

 public int[]  Array ;
 public  String letter ;
 public  int letter_num;
 
 public DiffrentController()
    {
        try {
            ClientImpl client = new ClientImpl();
		Registry reg = LocateRegistry.getRegistry("127.0.0.1",5000);
            ref = (ServerInt) reg.lookup("ChatService");
	    ref.register(client);
	    client.setCon(this);
		 ref.setArr(letter_num , count);		
		 ref.setCount(1);        
		ref.setLetter(1);
		
		 ref.getCount();
 		 ref.getArr();
		 ref.getLetter();
           
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(DiffrentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }	
	
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
    Alert alert =new Alert (Alert.AlertType.INFORMATION);     
@FXML
Boolean win ;

private Stage myStage;
private Scene myscene;
private Parent root;

 

@FXML
  public void handelButtonAction(ActionEvent a) throws RemoteException, IOException {

	
count=ref.getCount();

System.out.println(count);
letter=ref.getLetter();
System.out.println(letter);
Array=ref.getArr();



if(a.getSource() == b1 && "X".equals(letter)){
b1.setText(letter);
b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b1.setStyle("-fx-text-fill: Crimson;") ;
b1.setDisable(true);

ref.setArr(1, 0);
int[] hager=ref.getArr();
	System.out.println(hager[0]);
ref.tellOthers(ref.getArr(),0);

}
else if(a.getSource() == b2 && "X".equals(letter)){
		
b2.setText(letter);
b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b2.setStyle("-fx-text-fill: Crimson;") ;
b2.setDisable(true);
ref.setArr(1, 1);
ref.tellOthers(ref.getArr(),1);

}
else if(a.getSource() == b3 && "X".equals(letter)){
		
b3.setText(letter);
b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b3.setStyle("-fx-text-fill: Crimson;") ;
b3.setDisable(true);
ref.setArr(1, 2);
ref.tellOthers(ref.getArr(),2);

}
else if(a.getSource() == b4 && "X".equals(letter)){
		
b4.setText(letter);
b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b4.setStyle("-fx-text-fill: Crimson;") ;
b4.setDisable(true);
ref.setArr(1, 3);
ref.tellOthers(ref.getArr(),3);

}
else if(a.getSource() == b5 && "X".equals(letter)){
		
b5.setText(letter);
b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b5.setStyle("-fx-text-fill: Crimson;") ;
b5.setDisable(true);
ref.setArr(1, 4);
ref.tellOthers(ref.getArr(),4);

}
else if(a.getSource() == b6 && "X".equals(letter)){
		
b6.setText(letter);
b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b6.setStyle("-fx-text-fill: Crimson;") ;
b6.setDisable(true);
ref.setArr(1, 5);
ref.tellOthers(ref.getArr(),5);

}
else if(a.getSource() == b7 && "X".equals(letter)){
		
b7.setText(letter);
b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b7.setStyle("-fx-text-fill: Crimson;") ;
b7.setDisable(true);
ref.setArr(1, 6);
ref.tellOthers(ref.getArr(),6);
}
else if(a.getSource() == b8 && "X".equals(letter)){
		
b8.setText(letter);
b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b8.setStyle("-fx-text-fill: Crimson;") ;
b8.setDisable(true);
ref.setArr(1, 7);
ref.tellOthers(ref.getArr(),7);

}
else if(a.getSource() == b9 && "X".equals(letter)){
		
b9.setText(letter);
b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b9.setStyle("-fx-text-fill: Crimson;") ;
b9.setDisable(true);
ref.setArr(1, 8);
ref.tellOthers(ref.getArr(),8);
}
else if(a.getSource() == b1 && "O".equals(letter)){
		
b1.setText(letter);
b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b1.setStyle("-fx-text-fill: Crimson;") ;
b1.setDisable(true);
ref.setArr(0, 0);
ref.tellOthers(ref.getArr(),0);
}
else if(a.getSource() == b2 && "O".equals(letter)){
		
b2.setText(letter);
b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b2.setStyle("-fx-text-fill: Crimson;") ;
b2.setDisable(true);
ref.setArr(0, 1);
ref.tellOthers(ref.getArr(),1);
}
else if(a.getSource() == b3 && "O".equals(letter)){
		
b3.setText(letter);
b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b3.setStyle("-fx-text-fill: Crimson;") ;
b3.setDisable(true);
ref.setArr(0, 2);
ref.tellOthers(ref.getArr(),2);
}
else if(a.getSource() == b4 && "O".equals(letter)){
		
b4.setText(letter);
b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b4.setStyle("-fx-text-fill: Crimson;") ;
b4.setDisable(true);
ref.setArr(0, 3);
ref.tellOthers(ref.getArr(),3);
}
else if(a.getSource() == b5 && "O".equals(letter)){
		
b5.setText(letter);
b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b5.setStyle("-fx-text-fill: Crimson;") ;
b5.setDisable(true);
ref.setArr(0, 4);
ref.tellOthers(ref.getArr(),4);
}
else if(a.getSource() == b6 && "O".equals(letter)){
		
b6.setText(letter);
b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b6.setStyle("-fx-text-fill: Crimson;") ;
b6.setDisable(true);
ref.setArr(0, 5);
ref.tellOthers(ref.getArr(),5);
}
else if(a.getSource() == b7 && "O".equals(letter)){
		
b7.setText(letter);
b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b7.setStyle("-fx-text-fill: Crimson;") ;
b7.setDisable(true);
ref.setArr(0, 6);
ref.tellOthers(ref.getArr(),6);
}
else if(a.getSource() == b8 && "O".equals(letter)){
		
b8.setText(letter);
b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b8.setStyle("-fx-text-fill: Crimson;") ;
b8.setDisable(true);
ref.setArr(0, 7);
ref.tellOthers(ref.getArr(),7);
}
else if(a.getSource() == b9 && "O".equals(letter)){
		
b9.setText(letter);
b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b9.setStyle("-fx-text-fill: Crimson;") ;
b9.setDisable(true);
ref.setArr(0, 8);
ref.tellOthers(ref.getArr(),8);
}

ref.setLetter(count);
        
/*	  

if(Array[0]== Array[1] &&Array[1] == Array[2] && Array[0]!= -1){
win = true;
}
else if(Array[3]== Array[4] &&Array[4] == Array[5] && Array[3]!= -1){
win = true;
}
else if(Array[6]== Array[7] &&Array[7] == Array[8] && Array[6]!= -1){
win = true;
}

//virticle wins
else if(Array[0]== Array[3] &&Array[3] == Array[6] && Array[0]!= -1){
win = true;
}
else if(Array[1]== Array[4] &&Array[4] == Array[7] && Array[1]!= -1){
win = true;
}
else if(Array[2]== Array[5] &&Array[5] == Array[8] && Array[2]!= -1){
win = true;
}

//diagonal wins

else if(Array[0]== Array[4] &&Array[4] == Array[8] && Array[0]!= -1){
win = true;
}
else if(Array[2]== Array[4] &&Array[4] == Array[6] && Array[2]!= -1){
win = true;
}
else {
win = false;
}
*/

	  
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


//////////////////////////////////////////////


    
if(win == true){
   
    System.out.println("hager wins");
    //  winner.setText(letter);
    System.out.println("hear");
    //-------------------------------------
      try{  
      System.out.println("hager fxml  wins");
      
        root = FXMLLoader.load(getClass().getResource("diffwin.fxml"));
       // System.out.println("root");
        myStage = (Stage) winner_label.getScene().getWindow();
      //  System.out.println("stage");
        myscene = new Scene(root);
        System.out.println("scene");
      //  myStage.setScene(myscene);
	//System.out.println("hager wins");
        myStage.show();
      }   
      catch (LoadException ex) 
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
  
  
  public void display(int[] msg, int pos) throws IOException{
	  if(Platform.isFxApplicationThread()){
	  //here
	  int Number=  msg[pos] ;
if(Number==1)	  
{
	letter="X";
}
else if (Number == 0) {
	letter="O" ;
		  
	  }

	   switch (pos) {
             case 0:
		   
                b1.setText(letter);
  b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b1.setStyle("-fx-text-fill: Crimson;") ;
                b1.setDisable(true);
		     System.out.println(letter);
                break;
             case 1:
                    b2.setText(letter);
		      b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b2.setStyle("-fx-text-fill: Crimson;") ;
                     b2.setDisable(true);
		     System.out.println(letter);
                break;
              case 2:
                b3.setText(letter);
		  b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b3.setStyle("-fx-text-fill: Crimson;") ;
                b3.setDisable(true);
		System.out.println(letter);
                break;
              case 3:
                 b4.setText(letter);
		   b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b4.setStyle("-fx-text-fill: Crimson;") ;
                b4.setDisable(true);
		System.out.println(letter);
                break;
              case 4:
                b5.setText(letter);
    b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b5.setStyle("-fx-text-fill: Crimson;") ;              
                b5.setDisable(true);
			System.out.println(letter);
                break;
              case 5:
                b6.setText(letter);
    b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b6.setStyle("-fx-text-fill: Crimson;") ;              
                b6.setDisable(true);
			System.out.println(letter);
                break;
              case 6:
                b7.setText(letter);
    b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b7.setStyle("-fx-text-fill: Crimson;") ;              
                b7.setDisable(true);
			System.out.println(letter);
                break;
              case 7:
                b8.setText(letter);
                  b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b8.setStyle("-fx-text-fill: Crimson;") ;
                b8.setDisable(true);
			System.out.println(letter);
                break;
                case 8:
                b9.setText(letter);
    b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b9.setStyle("-fx-text-fill: Crimson;") ;              
                b9.setDisable(true);
			System.out.println(letter);
                break;
              
          } 
	  //
	  }else{Platform.runLater(()->{
	  //copy here
	  int Number=  msg[pos] ;
if(Number==1)	  
{
	letter="X";
}
else if (Number == 0) {
	letter="O" ;
		  
	  }
 switch (pos) {
             case 0:
		   
                b1.setText(letter);
  b1.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b1.setStyle("-fx-text-fill: Crimson;") ;
                b1.setDisable(true);
		     System.out.println(letter);
                break;
             case 1:
                    b2.setText(letter);
		      b2.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b2.setStyle("-fx-text-fill: Crimson;") ;
                     b2.setDisable(true);
		     System.out.println(letter);
                break;
              case 2:
                b3.setText(letter);
		  b3.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b3.setStyle("-fx-text-fill: Crimson;") ;
                b3.setDisable(true);
		System.out.println(letter);
                break;
              case 3:
                 b4.setText(letter);
		   b4.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b4.setStyle("-fx-text-fill: Crimson;") ;
                b4.setDisable(true);
		System.out.println(letter);
                break;
              case 4:
                b5.setText(letter);
    b5.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b5.setStyle("-fx-text-fill: Crimson;") ;              
                b5.setDisable(true);
			System.out.println(letter);
                break;
              case 5:
                b6.setText(letter);
    b6.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b6.setStyle("-fx-text-fill: Crimson;") ;              
                b6.setDisable(true);
			System.out.println(letter);
                break;
              case 6:
                b7.setText(letter);
    b7.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b7.setStyle("-fx-text-fill: Crimson;") ;              
                b7.setDisable(true);
			System.out.println(letter);
                break;
              case 7:
                b8.setText(letter);
                  b8.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b8.setStyle("-fx-text-fill: Crimson;") ;
                b8.setDisable(true);
			System.out.println(letter);
                break;
                case 8:
                b9.setText(letter);
    b9.setFont(Font.font("Blackadder ITC", FontWeight.BOLD, 30));
b9.setStyle("-fx-text-fill: Crimson;") ;              
                b9.setDisable(true);
			System.out.println(letter);
                break;
              
          } 
	  
	  //
	  });}

	  
	  
	  
	  
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


/*	  

if(Array[0]== Array[1] &&Array[1] == Array[2] && Array[0]!= -1){
win = true;
}
else if(Array[3]== Array[4] &&Array[4] == Array[5] && Array[3]!= -1){
win = true;
}
else if(Array[6]== Array[7] &&Array[7] == Array[8] && Array[6]!= -1){
win = true;
}

//virticle wins
else if(Array[0]== Array[3] &&Array[3] == Array[6] && Array[0]!= -1){
win = true;
}
else if(Array[1]== Array[4] &&Array[4] == Array[7] && Array[1]!= -1){
win = true;
}
else if(Array[2]== Array[5] &&Array[5] == Array[8] && Array[2]!= -1){
win = true;
}*/

//////////////////////////////////////////////

//win=true;
    
if(win == true){
    System.out.println("hager wins");
    //  winner.setText(letter);
    System.out.println("hear");
              //-------------------------------------
              System.out.println("hager fxml  wins");
              Platform.runLater(()->{
                  try {
                      root = FXMLLoader.load(getClass().getResource("diffwin.fxml"));
                      System.out.println("root");
                      myStage = (Stage) winner_label.getScene().getWindow();
                      System.out.println("stage");
                      myscene = new Scene(root);
                      System.out.println("scene");
                      myStage.setScene(myscene);
                      //System.out.println("hager wins");
                      myStage.show();
                  } catch (IOException ex) {
                      Logger.getLogger(DiffrentController.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  
              });
              
//        root = FXMLLoader.load(getClass().getResource("diffwin.fxml"));
//        System.out.println("root");
//        myStage = (Stage) winner_label.getScene().getWindow();
//        System.out.println("stage");
//        myscene = new Scene(root);
//        System.out.println("scene");
//        myStage.setScene(myscene);
//	//System.out.println("hager wins");
//         myStage.show();
     
  
  
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
      System.out.println(win);
	  
  }
  

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }
}





