package edu.ledo.examen.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_asignatura;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable=false)
    private int creditos;

    @Column (nullable=false, unique=true)
    private String codigo;


    @OneToMany (mappedBy = "asignatura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Matricula> matriculas;

    public Asignatura() {
    }

    public Asignatura(String nombre, int creditos, String codigo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
    }

    public Long getId_asignatura() {
        return id_asignatura;
    }

    public void setId_asignatura(Long id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    



}
