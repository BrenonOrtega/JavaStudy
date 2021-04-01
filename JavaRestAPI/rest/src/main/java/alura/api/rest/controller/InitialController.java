package alura.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * InitialController
 */
@RestController
public class InitialController {

    @GetMapping(path="/")
    String index(){
        return "Hello Java!";
    }

}