package edu.ledo.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import edu.ledo.examen.entity.Matricula;

public interface IMatriculaRepository extends JpaRepository<Matricula,Long>{

    List<Matricula> findByCalificacionGreaterThanEqual(Double calificacion);
     
    @Query(value = "SELECT m.* FROM matriculas m INNER JOIN asignaturas a ON m.id_asignatura = a.id_asignatura WHERE a.nombre = :nombre", nativeQuery = true)
    List<Matricula> findByAsignaturaNombre(@Param("nombre") String nombre);

    
}
