package sample.graphics.blocks;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CycleBlock implements Shape {

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKGOLDENROD);
        graphicsContext.fillPolygon(
                new double[]{100, 200, 400, 500, 400, 200},
                new double[]{175, 70, 70, 175, 280, 280},
                6
        );
    }
}
