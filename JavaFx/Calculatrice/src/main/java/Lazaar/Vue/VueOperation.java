package main.java.Lazaar.Vue;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import main.java.Lazaar.Operations;

public class VueOperation {
    GridPane grid = new GridPane();
    public Button button = new Button("Operate");
    public TextField textf1 = new TextField();
    public TextField textf2 = new TextField();
    public ComboBox<String> combo = new ComboBox<>();
    public TextField result = new TextField();
    public Operations operations;

    public VueOperation(Operations operations) {
        this.operations = operations;
        init();
    }

    public void init() {

        // Configure UI elements
        result.setEditable(false);
        combo.getItems().addAll("+", "-", "*", "/", "%", "^");

        // Add elements to GridPane
        grid.add(new Label("Number 1:"), 0, 0);
        grid.add(textf1, 1, 0);
        grid.add(new Label("Number 2:"), 0, 1);
        grid.add(textf2, 1, 1);
        grid.add(new Label("Operation:"), 0, 2);
        grid.add(combo, 1, 2);
        grid.add(new Label("Result:"), 0, 4);
        grid.add(button, 1, 3);
        grid.add(result, 1, 4);

        

        // Set bindings
        textf1.textProperty().addListener((obs, oldVal, newVal) -> {
            try {
                operations.nb1Property().set(Integer.parseInt(newVal));
            } catch (NumberFormatException e) {
                operations.nb1Property().set(0);
            }
        });

        textf2.textProperty().addListener((obs, oldVal, newVal) -> {
            try {
                operations.nb2Property().set(Integer.parseInt(newVal));
            } catch (NumberFormatException e) {
                operations.nb2Property().set(0);
            }
        });

        combo.valueProperty().addListener((obs, oldVal, newVal) -> {
            operations.expressionProperty().set(newVal);
        });

        operations.resultProperty().addListener((obs, oldVal, newVal) -> {
            result.setText(newVal);
        });

        // Button action
        button.setOnAction(e -> operations.init());
    }

    public GridPane getView() {
        
        return grid;
    }
}
