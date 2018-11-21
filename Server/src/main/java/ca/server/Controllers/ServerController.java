package ca.server.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ServerController {

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "HOLA A TODOS";
    }


}
