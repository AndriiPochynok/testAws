package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Andrii_Pochynok
 * created at: 5/20/2019
 */
@RestController
public class HelloController {
    private int count;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String testRequest() {
        return String.format("Hello %s", count++);
    }
}
