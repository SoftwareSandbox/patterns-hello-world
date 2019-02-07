package com.softwaresandbox.patternshelloworld.decorator;

public class HtmlRoot implements StringDecorator {

    private StringDecorator stringDecorator;

    public HtmlRoot(StringDecorator stringDecorator) {
        this.stringDecorator = stringDecorator;
    }

    @Override
    public String printSelf() {
        return "<html><body>" + stringDecorator.printSelf() + "</body></html>";
    }
}
