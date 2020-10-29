package sample.graphics.blocks;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class InputOutputBlock implements Shape {

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKRED);
        graphicsContext.strokePolygon(
                new double[]{100, 200, 500, 400},
                new double[]{280, 70, 70, 280},
                4);
    }
}
