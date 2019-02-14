package manish.springframework.didemo.controllers;

import manish.springframework.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class ConstructedInjectedCoontrollerTest {
    private ConstructedInjectedConroller constructedInjectedConroller;

    @Before
    public void setUp() throws Exception{
        this.constructedInjectedConroller = new ConstructedInjectedConroller(new GreetingServiceImpl());

    }

    @Test
    public void testGreeting() {
        //assertEquas(GreetingService.)
        assertEquals("testGreeting failed",GreetingServiceImpl.HELLO_GURUS, constructedInjectedConroller.sayHello());
    }
}
