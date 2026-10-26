package edu.ledo.examen.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Estudiantes")
public class Estudiante {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_Estudiante;

@Column (unique=true, nullable=false)
private String dni;


@Column(nullable =false)
private String nombre;

@Column(nullable =false)
private String apellidos;




public Estudiante() {
}

public Estudiante(String dni, String nombre, String apellidos) {
    this.dni = dni;
    this.nombre = nombre;
    this.apellidos = apellidos;
}

public Long getId_Estudiante() {
    return id_Estudiante;
}

public void setId_Estudiante(Long id_Estudiante) {
    this.id_Estudiante = id_Estudiante;
}

public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}





}
