package com.inmueblescompany.casosdeuso;

import java.util.List;

import com.inmueblescompany.casosdeuso.respuestas.ResultadoInmueblesPorPersonaVO;
import com.inmueblescompany.modelos.registroinmueble.RegistroInmuebleDAO;

/**
* Clase para implementar servicios de busqueda
* @author Marce
*/
public class BusquedaInmueblesBusiness implements IBusquedaInmuebles {

   // Instanciamos los DAO
   RegistroInmuebleDAO registroInmuebleDAO = new RegistroInmuebleDAO();
   
   
   // Implementamos los metodos de la interfaz
   @Override
   public List<ResultadoInmueblesPorPersonaVO> buscarInmueblesHabitadosPorPersona(String textoBusqueda) {
       
       System.out.println("[INFO] BusquedaInmueblesBusiness: Logica de negocio para busqueda de registro de inmubles habitados");
       List<ResultadoInmueblesPorPersonaVO> resultado = registroInmuebleDAO.buscarRegistroInmueblePorPersona(textoBusqueda);
       return resultado;

   }

}