package manish.springframework.didemo;

import org.springframework.stereotype.Controller;

/**
 * Created by Manish Tiwari on 2/14/2019.
 */
@Controller
public class MyController {
    public String hello() {
        System.out.println("hello");
        return "ji";
    }
}
