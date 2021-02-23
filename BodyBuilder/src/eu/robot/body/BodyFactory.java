package eu.robot.body;

import eu.robot.body.impl.BigBody;
import eu.robot.body.impl.SmallBody;

public class  BodyFactory {

    public Body createBody(BodyType type) {
        switch (type) {
            case SMALL:
                return createSmallBody();
            case BIG:
                return createBigBody();
            default:
                throw new RuntimeException("Incorrect body type");
        }
    }

    private SmallBody createSmallBody() {
        return new SmallBody();
    }

    private BigBody createBigBody() {
        return new BigBody();
    }
}
