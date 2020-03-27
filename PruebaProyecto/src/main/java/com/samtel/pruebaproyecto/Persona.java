
package com.samtel.pruebaproyecto;

import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @Column(name="tipo_documento")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String tipoDocumento;
    @Column(name="numero_documento")
    private String numeroDocumento;
    @Column(name="nombre")
    private String nombre;
    @Column(name="edad")
    private int edad;
    @Column(name="email")
    private String email;
    @Column(name="salario")
    private float salario;
    @Column(name="descripcion")
    private String descripcion;

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
