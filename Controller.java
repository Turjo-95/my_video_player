package turjofxm;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class Controller implements Initializable{
    @FXML
    private MediaView mediaView;
    
    @FXML
    private Button playButton, pauseButton, resetButton;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        file = new File("E:/Programm/Java/turjofxml/MovieLibrary/Batman Begins.mp4");
        media = new Media(file.toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaView.setMediaPlayer(mediaPlayer);
        
        
    }
    public void playMedia(){
        mediaPlayer.play();
    }
    public void pauseMedia(){
        
    }
    public void resetMedia(){
        
    }
    
}
    

