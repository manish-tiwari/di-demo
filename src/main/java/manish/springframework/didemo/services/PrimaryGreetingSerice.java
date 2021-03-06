package manish.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class PrimaryGreetingSerice implements GreetingService {

    @Override
    public String greet() {
        return "PrimaryGreetingSerice Hello !!";
    }
}
