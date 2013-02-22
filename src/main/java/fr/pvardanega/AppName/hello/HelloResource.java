package fr.pvardanega.AppName.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Checks that jersey works.
 */
@Component
@Path("hello")
public class HelloResource {

    @Autowired
    private HelloService helloService;

    @GET
    public String retrieveHello() {
        return helloService.sayHello();
    }
}
