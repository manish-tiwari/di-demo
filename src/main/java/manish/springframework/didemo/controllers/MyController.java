package manish.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by Manish Tiwari on 2/14/2019.
 */
@Controller
public class MyController {
    public String hello() {
        System.out.println("MyController hello !!!");
        return "ji";
    }
}
