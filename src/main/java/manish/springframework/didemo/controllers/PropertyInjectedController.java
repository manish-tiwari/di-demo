package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingService;
import manish.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class  PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;
    /*
    * Below also works bec of reflection as Spring figures out that property name matches
    * the bean name which is an implementation of this interface!
    *
    *  *  @Autowired
    public GreetingService greetingServiceImpl;

    *****************************************************
    *
    * NOTE:
     * If @Primary annotation is applied to one of the implementations then this will
     * override the bean identified by reflection(If @Qualifier is not used),
     * i.e., greetingServiceImpl will not be called, instead the bean which is annotated
     * as @Primary will be autowired here.
     *

    *
    *
    * * However, this is not recommended as it might create confusion to other reading your code.
    * @Qualifiers make the intention clear
    * */

    public String sayHello() {
        return "PropertyInjectedController "+greetingServiceImpl.greet();
    }
}
