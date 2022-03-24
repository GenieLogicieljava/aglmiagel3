package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControllerAccueil {

    @FXML
    private Button btnDash;

    @FXML
    private Button btnGestCom;

    @FXML
    private Button btnPara;

    @FXML
    private Button btnQuit;

    @FXML
    void btnDashCliked(MouseEvent event) throws IOException  {
    	Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
	    Stage window = (Stage) btnDash.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    

    @FXML
    void btnGestComCliked(MouseEvent event) throws IOException  {
    	Parent root = FXMLLoader.load(getClass().getResource("CreerCommande.fxml"));
	    Stage window = (Stage) btnGestCom.getScene().getWindow();
	    
	    window.setScene(new Scene (root)); 
	    
    }
    @FXML
    void btnParaCliked(MouseEvent event)throws IOException  {
    	Parent root = FXMLLoader.load(getClass().getResource("ParametreArticle.fxml"));
	    Stage window = (Stage) btnPara.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnQuitCliked(MouseEvent event)throws IOException  {
    	Parent root = FXMLLoader.load(getClass().getResource("Authentification.fxml"));
	    Stage window = (Stage) btnQuit.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }
    
    
    
 
}
