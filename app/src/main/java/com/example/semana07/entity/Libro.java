package com.example.semana07.entity;

import java.io.Serializable;

//Serializable:  es cuando un objeto ejm: "Libro", si tu quieres enviar de un lugar
//a otro se va a serializar, quiere decir que se va a convertir un medio fisico ".xml, .xlsx, .json"
// este archivo se dirige al destino es desearilable, quiere decir convertir un
// archivo fisico a objeto.

public class Libro implements Serializable {

    private int idLibro;
    private String titulo;
    private int anio;
    private String serie;
    private String fechaRegistro;
    private int estado;
    private Categoria categoria;
    private  Pais pais;

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
