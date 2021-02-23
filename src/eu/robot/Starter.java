package eu.robot;

import eu.robot.body.BodyFactory;
import eu.robot.body.BodyType;
import eu.robot.head.HeadFactory;
import eu.robot.head.HeadType;

public class Starter {

    private static final RobotFactory ROBOT_FACTORY = new RobotFactory(new BodyFactory(), new HeadFactory());

    public static void main(String[] args) {
        System.out.println(System.getProperty("java.version"));
        Robot t1000 = ROBOT_FACTORY.createRobot(HeadType.SQUARE, BodyType.BIG, "T1000");
        System.out.println(t1000);
        t1000.getHead().speak(null);
        t1000.getHead().speak("hello world");

        Robot defaultRobot = ROBOT_FACTORY.createRobot(null, null, "Default robot");
        System.out.println(defaultRobot);
        defaultRobot.getHead().speak("Message");
        t1000.getHead().speak(null);
    }

}
