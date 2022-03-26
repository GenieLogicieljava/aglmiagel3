package application;

import java.io.IOException;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControllerAuthentification {
//Controller page Authentication
	@FXML
	private AnchorPane root;
	
	@FXML
	private Parent fxml;
	
	@FXML
    private Button authAdminID;

    @FXML
    private TextField authName;

    @FXML
    private PasswordField authPassword;

    @FXML
    void authAdmin(MouseEvent  event) throws IOException {
    	String pseudo = authName.getText();
    	String password = authPassword.getText();
    	if(pseudo.equals("admin") && password.equals("admin")) {
    		/*fxml = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
    		root.getChildren().removeAll();
    		root.getChildren().setAll(fxml);
    		Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
    		Stage stage = new Stage();
    		stage.setScene(new Scene (root));
    	    stage.show();*/
    		Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
    	    Stage window = (Stage) authAdminID.getScene().getWindow();
    	    window.setScene(new Scene (root));
    	}else {
    		JOptionPane.showMessageDialog(null,"Identifiant ou mot de passe incorrect");
    	}
    }

    

}
