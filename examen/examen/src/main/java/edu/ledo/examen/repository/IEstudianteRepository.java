package edu.ledo.examen.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.ledo.examen.entity.Estudiante;

public interface IEstudianteRepository extends JpaRepository<Estudiante,Long>{

    Optional<Estudiante> findByDni(String dni);
    




}
