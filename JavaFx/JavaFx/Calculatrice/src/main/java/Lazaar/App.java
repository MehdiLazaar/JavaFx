<<<<<<< HEAD:Calculatrice/src/main/java/Lazaar/App.java
package Lazaar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.java.Lazaar.Operations;
import main.java.Lazaar.Vue.VueOperation;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        // Initialize Operations and VueOperation
        Operations operations = new Operations();
        VueOperation vueOperation = new VueOperation(operations);

        // Create scene and set stage
        var scene = new Scene(vueOperation.getView(), 640, 480);
        stage.setScene(scene);
        stage.setTitle("Calculator App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
=======
package Lazaar;

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
        
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
>>>>>>> e5cfa3c089f64c4b62162854de4bc16adbf51826:JavaFx/Calculatrice/src/main/java/Lazaar/App.java
