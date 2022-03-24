package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ControllerAuthentification {
//Controller page Authentication
    @FXML
    private Button btnCon;

    @FXML
    
    void btnConClicked(MouseEvent event) throws IOException {
        	Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
    	    Stage window = (Stage) btnCon.getScene().getWindow();
    	    
    	    window.setScene(new Scene (root));  }

    

}
