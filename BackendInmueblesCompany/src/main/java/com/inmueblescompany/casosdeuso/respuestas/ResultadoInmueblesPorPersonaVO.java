package com.inmueblescompany.casosdeuso.respuestas;

import java.util.Date;

/**
 *
 * @author Marce
 */
public class ResultadoInmueblesPorPersonaVO {
 
    //Datos persona
    private int idPersona;
    private String nombrePersona;
    private String apellidoPersona;
    private String correoPersona;
    
    //Datos registro
    private int idRegistroInmueble;
    private Date fechaIngreso;
    private Date fechaSalida;

    //Datos inmueble
    private int idInmueble;
    private String direccion;
    
    public ResultadoInmueblesPorPersonaVO() {
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getCorreoPersona() {
        return correoPersona;
    }

    public void setCorreoPersona(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    public int getIdRegistroInmueble() {
        return idRegistroInmueble;
    }

    public void setIdRegistroInmueble(int idRegistroInmueble) {
        this.idRegistroInmueble = idRegistroInmueble;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
    
}
