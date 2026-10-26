package edu.ledo.examen.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import edu.ledo.examen.entity.Asignatura;

public interface IAsignaturaRepository extends JpaRepository<Asignatura,Long>{

    long countByCreditos(int creditos);
}
