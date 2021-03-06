import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import model.GlobalState;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception{
        GlobalState mainScreen = GlobalState.getInstance();
        mainScreen.saveStage(primaryStage);
        Parent root = FXMLLoader.load(getClass().getResource("view/"));
        primaryStage.setTitle("CyberRent");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 1280, 720, Color.BLACK));
        primaryStage.show();
    }

    public static void main(String[] args){
        System.out.println("Hello");
        launch(args);
    }
}












