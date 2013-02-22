package fr.pvardanega.AppName.hello;

import org.springframework.stereotype.Service;

/**
 * Checks that spring dependency injection works.
 */
@Service
public class HelloService {

    public String sayHello() {
        return "Hello you";
    }
}
