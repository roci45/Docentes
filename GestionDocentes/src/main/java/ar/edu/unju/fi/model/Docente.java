package ar.edu.unju.fi.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDocente;
	
	private String legajo;
	private String nombre;
	private String apellido;
	
@Enumerated(EnumType.STRING)
private Curso curso;
private LocalDate fechaIngreso;
private Boolean estado;
public int calcularAntiguedad() {
	return Period.between(fechaIngreso, LocalDate.now()).getYears();
}



}
