package uiak.exper.actuatorexper.web;

import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@Timed
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot with Actuator!";
    }

}