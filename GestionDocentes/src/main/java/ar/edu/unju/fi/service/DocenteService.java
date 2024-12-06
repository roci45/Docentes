package ar.edu.unju.fi.service;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.repository.DoceneRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {

    private final DoceneRepository docenteRepository;

    public DocenteService(DoceneRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public List<Docente> obtenerDocentesActivos() {
        return docenteRepository.findByEstadoTrue();
    }

    public void guardarDocente(Docente docente) {
        docenteRepository.save(docente);
    }

    public void eliminarDocente(Integer id) {
        Docente docente = docenteRepository.findById(id).orElseThrow(() -> new RuntimeException("Docente no encontrado"));
         docente.setEstado(false);
        docenteRepository.save(docente);
    }
}
