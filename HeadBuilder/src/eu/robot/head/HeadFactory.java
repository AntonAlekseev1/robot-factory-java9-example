package eu.robot.head;

import eu.robot.head.impl.CircleHead;
import eu.robot.head.impl.SquareHead;

public class HeadFactory {

    public Head createHead(HeadType type) {
        switch (type) {
            case CIRCLE:
                return createCircleHead();
            case SQUARE:
                return createSquareHead();
            default:
                throw new RuntimeException("Incorrect head type");
        }
    }

    private CircleHead createCircleHead() {
        return new CircleHead();
    }

    private SquareHead createSquareHead() {
        return new SquareHead();
    }
}
