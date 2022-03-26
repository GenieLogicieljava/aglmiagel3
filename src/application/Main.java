package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {
	//private static Scene scene;
	@Override
	public void start(Stage primaryStage) {
		
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("ParametreLivreur.fxml"));
			
			primaryStage.setTitle("Logiciel De Gestion Restaurant~chap.chap by groupe 9 ");
			primaryStage.setScene(new Scene (root));
			
			primaryStage.getIcons().add(
					new Image(
							Main.class.getResourceAsStream("Iconeexe.jpg")));
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
