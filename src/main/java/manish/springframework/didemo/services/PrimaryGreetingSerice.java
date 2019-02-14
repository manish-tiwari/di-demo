package manish.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PrimaryGreetingSerice implements GreetingService {

    @Override
    public String greet() {
        return "PrimaryGreetingSerice Hello !!";
    }
}
