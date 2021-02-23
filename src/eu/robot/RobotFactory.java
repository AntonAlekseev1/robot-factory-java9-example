package eu.robot;

import eu.robot.body.Body;
import eu.robot.body.BodyFactory;
import eu.robot.body.BodyType;
import eu.robot.head.HeadFactory;
import eu.robot.head.HeadType;

import java.util.Objects;

public class RobotFactory {

    private final BodyFactory bodyFactory;
    private final HeadFactory headFactory;

    public RobotFactory(BodyFactory bodyFactory, HeadFactory headFactory) {
        this.bodyFactory = bodyFactory;
        this.headFactory = headFactory;
    }

    public Robot createRobot(HeadType headType, BodyType bodyType, String name) {
        Robot robot = new Robot();
        bodyType = Objects.requireNonNullElse(bodyType, BodyType.SMALL); // requireNonNullElse - оператора Элвиса, если объект == null возвращает значение по умолчанию
        robot.setBody(bodyFactory.createBody(bodyType));
        headType = Objects.requireNonNullElse(headType, HeadType.CIRCLE);
        robot.setHead(headFactory.createHead(headType));
        robot.setName(name);
        return robot;
    }
}
