package edu.ledo.examen;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.ledo.examen.entity.Estudiante;
import edu.ledo.examen.entity.Matricula;
import edu.ledo.examen.repository.IAsignaturaRepository;
import edu.ledo.examen.repository.IEstudianteRepository;
import edu.ledo.examen.repository.IMatriculaRepository;

@SpringBootApplication
public class ExamenApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteRepository estudianteRepository;

	@Autowired
	private IMatriculaRepository matriculaRepository;

	@Autowired
	private IAsignaturaRepository asignaturaRepository;

	public static void main(String[] args) {
		SpringApplication.run(ExamenApplication.class, args);
	}

	@Override
	public void run(String... args) {
	
		System.out.println("estudiantes " + estudianteRepository.count());
		System.out.println("matriculas" + matriculaRepository.count());
		System.out.println("asignaturas" + asignaturaRepository.count());

		estudianteRepository.findById(1L);


		Optional<Estudiante> estudiantePorDni = estudianteRepository.findByDni("12345678A");


		}

		

}
