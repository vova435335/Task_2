package sample.graphics;

import sample.graphics.blocks.*;

public class ShapeFactory {

    public Shape createPolygon(int numberOfSides) {
        switch (numberOfSides) {
            case 0:
            case 7:
                return new StartEndBlock();
            case 1:
            case 6:
                return new InputOutputBlock();
            case 2:
                return new DecisionBlock();
            case 3:
                return new CycleBlock();
            case 4:
                return new ConditionBlock();
        }

        return null;
    }
}
