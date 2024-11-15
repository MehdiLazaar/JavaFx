package Lazaar;

import javax.swing.JLabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Personne p1 = new Personne("Lazaar", "Mehdi", 22);
        System.out.println(p1.toString());
        /* Label label = new Label(p1.toString());

        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 320, 240);

        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch();
    }
}