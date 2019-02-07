package com.softwaresandbox.patternshelloworld.decorator;

public class TimName implements StringDecorator {

    @Override
    public String printSelf() {
        return "WhereIsTim?";
    }
}
