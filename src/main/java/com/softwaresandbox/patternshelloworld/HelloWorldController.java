package com.softwaresandbox.patternshelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String getNameBold(@RequestParam(required = false) String style) {
        return new StyleFactory().create(style).printSelf();
    }

}
