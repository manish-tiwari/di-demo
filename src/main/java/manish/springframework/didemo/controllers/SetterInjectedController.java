package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
       return "SetterInjectedController "+greetingService.greet();
    }

   /* public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }*/
   @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}