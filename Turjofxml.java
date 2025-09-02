package turjofxm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Turjofxml extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MoviePlayer.fxml"));
                System.out.println(getClass().getResource("MoviePlayer.fxml"));

        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
