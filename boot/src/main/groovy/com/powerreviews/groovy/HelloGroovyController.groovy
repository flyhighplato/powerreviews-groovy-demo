package com.powerreviews.groovy

import groovy.transform.CompileStatic
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by garyturovsky on 6/15/17.
 */
@RestController
@CompileStatic
class HelloGroovyController {
    
    @RequestMapping("/groovy/hello")
    String index() {
         "Greetings from Groovy!"
    }
}
