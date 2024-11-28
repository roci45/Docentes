package ar.edu.unju.fi.repository;

import ar.edu.unju.fi.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DoceneRepository extends JpaRepository<Docente, Integer> {
List<Docente> findByEstadoTrue();
}
