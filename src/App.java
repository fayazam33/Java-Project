import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       
        try {
            Parent root=FXMLLoader.load(getClass().getResource("/tictactoe.fxml"));
            Scene scene=new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tic Tac Toe");
            primaryStage.show();
        } catch (IOException e) {
           
            e.printStackTrace();
        }

    }
}