package com.softwaresandbox.patternshelloworld.decorator;

public class UnderlineTag implements StringDecorator {

    private StringDecorator stringDecorator;

    public UnderlineTag(StringDecorator stringDecorator) {
        this.stringDecorator = stringDecorator;
    }

    @Override
    public String printSelf() {
        return "<u>" + stringDecorator.printSelf() + "</u>";
    }
}
