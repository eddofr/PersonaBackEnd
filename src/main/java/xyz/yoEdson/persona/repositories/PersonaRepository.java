package xyz.yoEdson.persona.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoEdson.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
