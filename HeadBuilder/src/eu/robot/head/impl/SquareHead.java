package eu.robot.head.impl;

import eu.robot.head.Head;

import java.util.Optional;

public class SquareHead implements Head {

    @Override
    public void speak(String message) {
        Optional.ofNullable(message)
                .ifPresentOrElse(x -> System.out.println(x.toUpperCase()), () -> System.out.println("I am a SquareHead"));
    }

    @Override
    public String toString() {
        return "SquareHead";
    }
}
