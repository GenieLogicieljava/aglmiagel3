
package application;
	
import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public final class Main extends Application {

	  @Override
	  public void start(final Stage primaryStage) {
	    try {
	      final URL url = getClass().getResource("Authentification.fxml");
	      final FXMLLoader fxmlLoader = new FXMLLoader(url);
	      // final AnchorPane root = (AnchorPane) fxmlLoader.load();
	      final BorderPane root = (BorderPane) fxmlLoader.load();
	      final Scene scene = new Scene(root, 700, 500);
	      primaryStage.setScene(scene);
	    } catch (IOException ex) {
	      System.err.println("Erreur au chargement: " + ex);
	    }
	    primaryStage.setTitle("Test FXML");
	    primaryStage.show();
	  }

	  public static void main(String[] args) {
	    launch(args);
	  }
	}