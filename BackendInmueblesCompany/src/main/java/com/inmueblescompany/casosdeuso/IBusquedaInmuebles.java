package com.inmueblescompany.casosdeuso;

import com.inmueblescompany.casosdeuso.respuestas.ResultadoInmueblesPorPersonaVO;
import java.util.List;


/**
 * Contrato de la interfaz de servicio
 * @author Marce
 */
public interface IBusquedaInmuebles {
     
    public List<ResultadoInmueblesPorPersonaVO> buscarInmueblesHabitadosPorPersona(String textoBusqueda);
}
