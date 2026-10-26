package edu.ledo.examen.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="ExpedientesAcademicos")
public class ExpedienteAcademico {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_expediente;

    @Column(unique = true, nullable = false)
    private String numeroExpediente;

    @Column(nullable=false)
    private LocalDate fechaApertura;

    @Column(nullable=false)
    private Double notaMediaAcceso;

    public ExpedienteAcademico(String numeroExpediente, LocalDate fechaApertura, Double notaMediaAcceso) {
        this.numeroExpediente = numeroExpediente;
        this.fechaApertura = fechaApertura;
        this.notaMediaAcceso = notaMediaAcceso;
    }

    public ExpedienteAcademico() {
    }

    public Long getId() {
        return id_expediente;
    }

    public void setId(Long id) {
        this.id_expediente = id;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Double getNotaMediaAcceso() {
        return notaMediaAcceso;
    }

    public void setNotaMediaAcceso(Double notaMediaAcceso) {
        this.notaMediaAcceso = notaMediaAcceso;
    }



    


}
