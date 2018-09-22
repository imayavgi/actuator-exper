package uiak.exper.actuatorexper.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ComponentScan(basePackages = "uiak.exper.actuatorexper.web")
@ComponentScan(basePackages = "uiak.exper.actuatorexper.security")
@ComponentScan(basePackages = "uiak.exper.actuatorexper.health")
@ComponentScan(basePackages = "uiak.exper.actuatorexper.services")
public class ActuatorExperApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActuatorExperApplication.class, args);
    }
}
