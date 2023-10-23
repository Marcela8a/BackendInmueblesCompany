package com.inmueblescompany.modelos.inmueble;

/**
 * Modelo para manejar los datos basicos de un Inmueble
 * @author Marce
 */
public class InmuebleVO {

    private int id;
    private String direccion;

    public InmuebleVO() {
    }

    public InmuebleVO(int id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
