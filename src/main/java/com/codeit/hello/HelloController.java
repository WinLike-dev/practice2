package com.codeit.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)

    public String sayHello() {
        return "hello";
    }
    @RequestMapping(value = "/goodbye", method = RequestMethod.GET)
    public String sayGoodbye() {
        return "goodbye.html";
    }
}
