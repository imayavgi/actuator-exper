package uiak.exper.actuatorexper.services;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "simplesvc")
public class SimpleService {

    private String val;

    @ReadOperation
    public String read() {
        return val;
    }

    @WriteOperation
    public void write(String val) {

        this.val =val;
    }
}
