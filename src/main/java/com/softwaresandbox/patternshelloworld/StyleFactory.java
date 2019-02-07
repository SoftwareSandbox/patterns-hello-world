package com.softwaresandbox.patternshelloworld;

import com.softwaresandbox.patternshelloworld.decorator.*;

import java.util.List;

import static java.util.Arrays.asList;

public class StyleFactory {

    public StringDecorator create(String style) {
        List<String> elements = asList(style.split("-"));
        StringDecorator current = null;
        for(String tag: elements){
            current = create(tag, current);
        }
        return current;
    }

    private StringDecorator create(String tag, StringDecorator stringDecorator){
        if("bold".equals(tag)){
            return new BoldTag(stringDecorator);
        }
        if("reversed".equals(tag)){
            return new Reverser(stringDecorator);
        }
        if("root".equals(tag)){
            return new HtmlRoot(stringDecorator);
        }
        if("tim".equals(tag)){
            return new TimName();
        }
        if("underline".equals(tag)){
            return new UnderlineTag(stringDecorator);
        }
        return new TimName();
    }
}
