package manish.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service   // @Service vs @Controller ???
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus !!!";

    @Override
    public String greet() {
        return "GreetingServiceImpl "+HELLO_GURUS;
    }
}
