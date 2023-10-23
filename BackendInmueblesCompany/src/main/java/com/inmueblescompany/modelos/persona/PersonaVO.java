package com.inmueblescompany.modelos.persona;


/**
 * Modelo para manejar los datos basicos de una Persona
 * @author Marce
 */
public class PersonaVO {
    
    private int id;
    private String nombre;
    private String apellido;
    private String correo;

    public PersonaVO() {
        //Constructor vacio
    }

    public PersonaVO(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}

