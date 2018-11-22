package ca.server.Controllers;

import ca.server.Model.Registro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController

public class ServerController {
    private List<Registro> registros = new ArrayList<>();
    private AtomicLong nextID = new AtomicLong();

    @GetMapping("/hello")
    public String getHelloMessage(){
        return "HOLA A TODOS";
    }
    @PostMapping("/registro")
    public Registro CreateNewRegistro(@RequestBody Registro registro){
        registro.setId(nextID.incrementAndGet());
        registros.add(registro);
        return registro;

    }
    @GetMapping("/registro")
    public List<Registro> getTregistros() {
        return registros;
    }


}
