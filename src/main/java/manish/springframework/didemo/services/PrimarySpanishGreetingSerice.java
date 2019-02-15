package manish.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimarySpanishGreetingSerice implements GreetingService {

    @Override
    public String greet() {
        return "Saludo primarioSericio Hola !!";
    }
}
