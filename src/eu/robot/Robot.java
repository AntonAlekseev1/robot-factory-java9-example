package eu.robot;

import eu.robot.body.Body;
import eu.robot.head.Head;

public class Robot {

    private String name;
    private Head head;
    private Body body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name=" + name +
                ", head=" + head +
                ", body=" + body +
                '}';
    }
}
