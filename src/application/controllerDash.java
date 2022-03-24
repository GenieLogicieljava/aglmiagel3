package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class controllerDash {
	//Declarations buttons
    @FXML
    private Button btnAccueil;

    @FXML
    private Button btnGestCom;

    @FXML
    private Button btnPara;

    @FXML
    private Button btnQuit;
    
    //Declarations method's buttons

    @FXML
    void btnAccClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
	    Stage window = (Stage) btnAccueil.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnComClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("CreerCommande.fxml"));
	    Stage window = (Stage) btnGestCom.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }
    
    @FXML
    void btnParaClicked(MouseEvent event)  throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ParametreArticle.fxml"));
	    Stage window = (Stage) btnPara.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnQuitClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Authentification.fxml"));
	    Stage window = (Stage) btnQuit.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }
}
