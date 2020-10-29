package sample.graphics.blocks;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class StartEndBlock implements Shape {

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setFill(Color.DARKRED);
        graphicsContext.fillOval(100, 175, 400, 210);
    }

}
