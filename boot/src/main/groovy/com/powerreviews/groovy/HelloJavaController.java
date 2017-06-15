package com.powerreviews.groovy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by garyturovsky on 6/15/17.
 */
@RestController
public class HelloJavaController {

    @RequestMapping("/java/hello")
    public String index() {
        return "Greetings from Java!";
    }

}
