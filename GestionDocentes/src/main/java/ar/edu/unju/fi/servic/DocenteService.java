package ar.edu.unju.fi.servic;

import ar.edu.unju.fi.model.Docente;
import java.util.List;

public interface DocenteService {
    List<Docente> obtenerDocentesActivos();
    void guardarDocente(Docente docente);
    void eliminarDocente(Integer id);
}
