/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
 
/**
 *
 * @author Esraa
 */
public class XO extends Application {
    
    private MediaPlayer song;
    
    public static boolean issplashscreen=false;
    
    
    @Override
   public void start(Stage stage) throws Exception {
       
    song = new MediaPlayer(new Media(getClass().getResource("song.mp3").toString()));
    song.setCycleCount(MediaPlayer.INDEFINITE);
    song.play();
    song.getOnRepeat();
       
        Parent root = FXMLLoader.load(getClass().getResource("mysplash.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
        
        
    }
   
    public static void main(String[] args) {
        launch(args);
        
        
        
         
    }
}
    

