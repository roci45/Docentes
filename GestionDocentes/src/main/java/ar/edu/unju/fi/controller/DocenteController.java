package ar.edu.unju.fi.controller;

import ar.edu.unju.fi.model.Docente;
import ar.edu.unju.fi.service.DocenteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/docentes")
public class DocenteController{
	private final DocenteService docenteService;
public DocenteController(DocenteService docenteService) {
	   this.docenteService = docenteService;
}

@GetMapping
public String listarDocentesActivos(Model model) {
    model.addAttribute("docentes", docenteService.obtenerDocentesActivos());
    return "index";
}

@GetMapping("/nuevo")
public String mostrarFormulario(Model model) {
    model.addAttribute("docente", new Docente());
    return "formulario";
}

@PostMapping
public String guardarDocente(@ModelAttribute Docente docente) {
    docenteService.guardarDocente(docente);
    return "redirect:/docentes";
}

@GetMapping("/eliminar/{id}")
public String eliminarDocente(@PathVariable Integer id) {
    docenteService.eliminarDocente(id);
    return "redirect:/docentes";
}

}
