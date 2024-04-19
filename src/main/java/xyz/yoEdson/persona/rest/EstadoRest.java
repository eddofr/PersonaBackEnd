package xyz.yoEdson.persona.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.yoEdson.persona.model.Estado;
import xyz.yoEdson.persona.services.EstadoService;

import java.util.List;

@RestController
@RequestMapping("/estado/")
public class EstadoRest {

    @Autowired
    private EstadoService estadoService;

    @GetMapping("{id}")
    private ResponseEntity<List<Estado>> getAllEstados(@PathVariable("id") Long idPais){
        return ResponseEntity.ok(estadoService.findByPaisId(idPais));
    }
}
