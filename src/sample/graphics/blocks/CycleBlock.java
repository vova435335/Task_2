package sample.graphics.blocks;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CycleBlock implements Shape {

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKGOLDENROD);
        graphicsContext.fillPolygon(
                new double[]{100, 300, 500, 300},
                new double[]{175, 300, 175, 300},
                4
        );
    }
}
