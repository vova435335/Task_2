package sample.controllers;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import sample.graphics.ShapeFactory;
import sample.graphics.blocks.Shape;

public class Controller {

    private int numberOfSides;

    @FXML
    private TextField select_tf;
    @FXML
    private Button draw_btn;
    @FXML
    private Canvas canvas;

    @FXML
    void initialize() {
        draw_btn.setOnAction(event -> {
            if (checkField()) {
                ShapeFactory factory = new ShapeFactory();
                Shape shape = factory.createPolygon(numberOfSides);

                GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
                graphicsContext.clearRect(0, 0, 600, 350);
                shape.draw(graphicsContext);
            }
        });
    }

    private boolean checkField() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        try {
            if (!select_tf.getText().equals("")) {
                numberOfSides = Integer.parseInt(select_tf.getText());
                numberOfSides--;
            } else {
                alert.setTitle("Предупреждение:");
                alert.setHeaderText(null);
                alert.setContentText("Поле ввода пустое");
                alert.showAndWait();
                return false;
            }

            if (numberOfSides < 0 || numberOfSides > 6) {
                alert.setTitle("Предупреждение:");
                alert.setHeaderText(null);
                alert.setContentText("Введено неверное число");
                alert.showAndWait();
                return false;
            }
        } catch (NumberFormatException e) {
            alert.setTitle("Предупреждение:");
            alert.setHeaderText(null);
            alert.setContentText("Неверный формат ввода");
            alert.showAndWait();
            return false;
        }

        return true;
    }
}
