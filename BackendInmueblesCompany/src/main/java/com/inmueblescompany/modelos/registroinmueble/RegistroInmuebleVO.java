package com.inmueblescompany.modelos.registroinmueble;


import java.util.Date;

/**
 * Modelo para manejar los datos basicos de un Registro de Inmeble Habitado

 * @author Marce
 */
public class RegistroInmuebleVO {
    
    private int id;
    private int idPersona;
    private int idInmueble;
    private Date fechaIngreso;
    private Date fechaSalida;

    public RegistroInmuebleVO() {
    }

    public RegistroInmuebleVO(int id, int idPersona, int idInmueble, Date fechaIngreso, Date fechaSalida) {
        this.id = id;
        this.idPersona = idPersona;
        this.idInmueble = idInmueble;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
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
    
    
}