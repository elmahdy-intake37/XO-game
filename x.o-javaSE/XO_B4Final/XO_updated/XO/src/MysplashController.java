/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author NNMMs
 */
public class MysplashController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
      @FXML
    private ImageView loadingimage;
    private Stage myStage;
    private Scene myscene;
    private Parent root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        Thread timer = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(3000); //1000 milliseconds is one second.
                    }
                    catch (InterruptedException ex)
                    {
                        Thread.currentThread().interrupt();
                    }finally
                        {
                            //System.out.println("Testing");
                            try 
                            {
                              root = FXMLLoader.load(getClass().getResource("homepage.fxml"));
                            } catch (IOException ex)
                            {
                                ex.printStackTrace();
                            }
                            Platform.runLater(new Runnable() {
                            @Override public void run() 
                            {
                                    myStage = (Stage) loadingimage.getScene().getWindow();
                                    myscene = new Scene(root);
                                //    String style = getClass().getResource("nahla.css").toExternalForm();
                                  //   myscene.getStylesheets().addAll(style);
                                    myStage.setScene(myscene);
                            }
                            });
                        }
                    }
                 });
                timer.start();
        
        
        
        
        
        // TODO
    }    
    
}
