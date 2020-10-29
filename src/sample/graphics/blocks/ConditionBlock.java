package sample.graphics.blocks;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ConditionBlock implements Shape {

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKSEAGREEN);
        graphicsContext.fillPolygon(
                new double[]{100, 300, 500, 300},
                new double[]{175, 70, 175, 280},
                4
        );
    }
}
