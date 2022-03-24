package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ControllerParametreArticle {

    @FXML
    private Pane PaneCenter;

    @FXML
    private Button btnAccueil;

    @FXML
    private Button btnDash;

    @FXML
    private Button btnGestCom;

    @FXML
    private Button btnQuit;

    @FXML
    private MenuItem idMIArticle;

    @FXML
    private MenuItem idMILivreur;

    @FXML
    private MenuItem idMIMenu;

    @FXML
    private MenuItem idMITable;

    @FXML
    private CheckMenuItem idTypeBoisson;

    @FXML
    private CheckMenuItem idTypePLat;

    @FXML
    private MenuButton labelMenuBtn;

    @FXML
    void OnActionArticle(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ParametreArticle.fxml"));
	    Stage window = (Stage) btnAccueil.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }


    @FXML
    void OnActionLivreur(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ParametreLivreur.fxml"));
    	//   labelMenuBtn= new MenuButton("");
	    PaneCenter.getChildren().removeAll();
	    PaneCenter.getChildren().setAll((root));}

    @FXML
    void OnActionMenu(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("EnregistrerMenu.fxml"));
    	PaneCenter.getChildren().removeAll();
  	    PaneCenter.getChildren().setAll((root));  
	   
    }

    @FXML
    void OnActionTable(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("ParametreTable.fxml"));
 	 
	    PaneCenter.getChildren().removeAll();
	    PaneCenter.getChildren().setAll((root));
 }

    @FXML
    void OnActionTypeBoisson(ActionEvent event) {

    }

    @FXML
    void OnActionTypePlat(ActionEvent event) {

    }

    @FXML
    void btnAccCliked(MouseEvent event)throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Accueil.fxml"));
	    Stage window = (Stage) btnAccueil.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnDashClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
	    Stage window = (Stage) btnDash.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnGestComClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("CreerCommande.fxml"));
	    Stage window = (Stage) btnGestCom.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

    @FXML
    void btnQuitClicked(MouseEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("Authentification.fxml"));
	    Stage window = (Stage) btnQuit.getScene().getWindow();
	    
	    window.setScene(new Scene (root));  }

}
