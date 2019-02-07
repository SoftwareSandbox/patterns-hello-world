package com.softwaresandbox.patternshelloworld;

import com.softwaresandbox.patternshelloworld.decorator.BoldTag;
import com.softwaresandbox.patternshelloworld.decorator.HtmlRoot;
import com.softwaresandbox.patternshelloworld.decorator.Reverser;
import com.softwaresandbox.patternshelloworld.decorator.TimName;

public class StyleFactory {

    public HtmlRoot create(String style) {
        if ("bold".equals(style)) {
            return new HtmlRoot(new BoldTag(new TimName()));
        }
        if ("reversed".equals(style)) {
            return new HtmlRoot(new Reverser(new TimName()));
        }
        return new HtmlRoot(new TimName());
    }
}
