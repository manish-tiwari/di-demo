package manish.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service   // @Service vs @Controller ???
public class SetterInjectedGreetingService implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus !!!";

    @Override
    public String greet() {
        return "SetterInjectedGreetingService "+HELLO_GURUS;
    }
}
