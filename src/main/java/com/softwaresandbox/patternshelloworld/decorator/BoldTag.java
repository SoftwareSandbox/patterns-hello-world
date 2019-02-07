package com.softwaresandbox.patternshelloworld.decorator;

public class BoldTag  implements StringDecorator {

    private StringDecorator stringDecorator;

    public BoldTag(StringDecorator tag) {
        this.stringDecorator = tag;
    }


    @Override
    public String printSelf() {
        return "<b>" + stringDecorator.printSelf() + "</b>";
    }
}
