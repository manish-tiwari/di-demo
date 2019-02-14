package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class  PropertyInjectedController {

    @Autowired
    public GreetingServiceImpl greetingService;
    /*
    * Below also works bec of reflection as Spring figures out that property name matches
    * the bean name which is an implementation of this interface!
    *
    *  @Autowired
    public GreetingService greetingServiceImpl;
    *
    *
    * * However, this is not recommended as it might create confusion to other reading your code.
    * @Qualifiers make the intention clear
    * */

    public String sayHello() {
        return "PropertyInjectedController "+greetingService.greet();
    }
}
