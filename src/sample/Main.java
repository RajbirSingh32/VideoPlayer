package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
       VideoPlayer videoPlayer = new VideoPlayer("file:///C:/Users/rajveer/Desktop/Dhadak%20-%20Title%20Track%20%20Dhadak%20%20Ishaan%20&%20Janhvi%20%20Ajay%20Gogavale%20&%20Shreya%20Ghoshal%20%20Ajay-Atul.mp4");
       Scene scene = new Scene(videoPlayer, 1280,720, Color.BLACK);
       primaryStage.setScene(scene);
       primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
