package edu.ledo.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import edu.ledo.examen.entity.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula,Long>{

     List<Matricula> findByCalificacionGreaterThanOrEqual(Double calificacion);
     
     @Query(value = "SELECT m.* FROM matricula m INNER JOIN asignatura a ON m.id_matricula = a.id WHERE a.nombre = :nombre", nativeQuery = true)
     List<Matricula> findByAsignaturaNombre(String nombre);



}
