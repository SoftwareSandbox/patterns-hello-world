package com.softwaresandbox.patternshelloworld.decorator;

public class Reverser implements StringDecorator {

    private StringDecorator stringDecorator;

    public Reverser(StringDecorator stringDecorator) {
        this.stringDecorator = stringDecorator;
    }

    @Override
    public String printSelf() {
        return new StringBuilder(stringDecorator.printSelf()).reverse().toString();
    }
}
