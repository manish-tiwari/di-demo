package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

/**
 * Created by Manish Tiwari on 2/14/2019.
 */
@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {
        System.out.println("MyController hello !!!");
        return "ji";
    }
}
