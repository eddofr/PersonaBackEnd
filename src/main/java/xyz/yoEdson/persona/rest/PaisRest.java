package xyz.yoEdson.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yoEdson.persona.model.Pais;
import xyz.yoEdson.persona.services.PaisService;

import java.util.List;

@RestController
@RequestMapping("/pais/")
public class PaisRest {

    @Autowired
    private PaisService paisService;

    @GetMapping
    private ResponseEntity<List<Pais>> getAllPaises(){
        return ResponseEntity.ok(paisService.findAll());
    }
}
