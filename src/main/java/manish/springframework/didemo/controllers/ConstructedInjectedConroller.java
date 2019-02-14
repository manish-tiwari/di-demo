package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructedInjectedConroller {
    private GreetingService greetingService;

    @Autowired  //Annotation optional here !!
    public ConstructedInjectedConroller(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
       return "ConstructedInjectedConroller "+greetingService.greet();
    }
}
