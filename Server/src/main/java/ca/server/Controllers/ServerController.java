package ca.server.Controllers;

import ca.server.Model.Registro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController

public class ServerController {   // Controlador del server
    private List<Registro> registros = new ArrayList<>(); //Crea una lista de personas registradas
    private AtomicLong nextID = new AtomicLong();

    @GetMapping("/hello") //Funcion para probar el server. Simplemente retorna un HOLA
    public String getHelloMessage(){
        return "HOLA A TODOS";
    }


    @PostMapping("/registro")//Registra a una persona en el sistema
    public Registro CreateNewRegistro(@RequestBody Registro registro){
        registro.setId(nextID.incrementAndGet());
        registros.add(registro);
        return registro;

    }
    @GetMapping("/registro")//Obtiene el registro completo de personas
    public List<Registro> getTregistros() {
        return registros;
    }

    @GetMapping("/registro/{id}")//Retorna una persona en especifico
    public Registro GetOne(@PathVariable("id") long registroId){
        for(Registro registro : registros){
            if(registro.getId() == registroId){
                return registro;
            }
        }
        throw new IllegalArgumentException();
    }
    @PostMapping("/registro/{id}")// Edita una persona en especifico basandose en su ID
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
