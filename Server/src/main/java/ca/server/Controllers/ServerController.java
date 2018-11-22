package ca.server.Controllers;

import ca.server.Model.Registro;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/registro/{id}")
    public Registro GetOne(@PathVariable("id") long registroId){
        for(Registro registro : registros){
            if(registro.getId() == registroId){
                return registro;
            }
        }
        throw new IllegalArgumentException();
    }
    @PostMapping("/registro/{id}")
    public Registro editregistro(
            @PathVariable("id") long RegistroId,
            @RequestBody Registro newRegistro
    ){
        for(Registro registro : registros){
            if(registro.getId() == RegistroId){
                registros.remove(registro);
                newRegistro.setId(RegistroId);
                registros.add(newRegistro);
                return registro;
            }
        }
        throw new IllegalArgumentException();


    }


}
