package xyz.yoEdson.persona.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoEdson.persona.model.Pais;

public interface PaisRepository extends JpaRepository<Pais, Long> {
}
