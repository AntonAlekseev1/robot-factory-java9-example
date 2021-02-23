package eu.robot.head.impl;

import eu.robot.head.Head;

import java.util.Optional;

public class CircleHead implements Head {

    @Override
    public void speak(String message) {
        Optional.ofNullable(message)
                .ifPresentOrElse(System.out::println, () -> System.out.println("I am a CircleHead"));
        //ifPresentOrElse - метод выполняет заданное действие над значением, если оно присутствует, в противном случае будет выполнено некое дефолтное действие
    }

    @Override
    public String toString() {
        return "CircleHead";
    }
}
