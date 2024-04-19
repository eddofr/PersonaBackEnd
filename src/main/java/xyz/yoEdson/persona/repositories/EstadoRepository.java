package xyz.yoEdson.persona.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.yoEdson.persona.model.Estado;

import java.util.ArrayList;

public interface EstadoRepository extends JpaRepository<Estado, Long> {
    public abstract ArrayList<Estado> findByPaisId(Long idPais);
}
