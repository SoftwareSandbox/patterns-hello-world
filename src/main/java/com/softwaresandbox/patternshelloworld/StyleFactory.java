package com.softwaresandbox.patternshelloworld;

import com.softwaresandbox.patternshelloworld.decorator.*;

public class StyleFactory {

    public StringDecorator create(String style) {
        if ("bold".equals(style)) {
            return new HtmlRoot(new BoldTag(new TimName()));
        }
        if ("reversed".equals(style)) {
            return new HtmlRoot(new Reverser(new TimName()));
        }
        return new HtmlRoot(new TimName());
    }
}
