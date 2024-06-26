package xyz.yoEdson.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xyz.yoEdson.persona.model.Persona;
import xyz.yoEdson.persona.services.PersonaService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personas/")
public class PersonaRest {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    private ResponseEntity<List<Persona>> getAllPersonas(){
        return ResponseEntity.ok(personaService.findAll());
    }

    @GetMapping("persona/{id}")
    private Optional<Persona> getPersonaId(@PathVariable ("id") Long id){
        return personaService.findById(id);
    }

    @PostMapping
    private ResponseEntity<Persona> savePersona(@RequestBody Persona persona){
        try {
            Persona personaGuardada = personaService.save(persona);
            return ResponseEntity.created(new URI("/personas/"+personaGuardada.getId())).body(personaGuardada);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

    }

    @DeleteMapping (value = "delete/{id}")
    private ResponseEntity<Boolean> deletePersona (@PathVariable ("id") Long id){
        personaService.deleteById(id);
        return ResponseEntity.ok(!(personaService.findById(id)!=null));

    }

}
