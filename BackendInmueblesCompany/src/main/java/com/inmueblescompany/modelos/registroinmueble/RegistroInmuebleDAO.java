package com.inmueblescompany.modelos.registroinmueble;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.inmueblescompany.casosdeuso.respuestas.ResultadoInmueblesPorPersonaVO;
import com.inmueblescompany.conexionbd.ConexionMySql;

/**
 * Consultas a la base de datos para la entidad RegistroInmueble
 * @author Marce
 */
public class RegistroInmuebleDAO {

    private ConexionMySql conexion;

    public RegistroInmuebleDAO() {
        conexion = new ConexionMySql();
    }

    public List<ResultadoInmueblesPorPersonaVO> buscarRegistroInmueblePorPersona(String textoBusqueda) {
        Connection conn = null;
        List<ResultadoInmueblesPorPersonaVO> datos = new ArrayList<ResultadoInmueblesPorPersonaVO>();
        String sql = "select p.id as idpersona, p.nombre, p.apellido, p.correo, "
                + "rih.id as idregistro, rih.fecha_ingreso, rih.fecha_salida, "
                + "i.id as idinmueble, i.direccion "
                + "from personas as p "
                + "left join registro_inmuebles_habitados as rih ON p.id = rih.idpersona "
                + "left join inmuebles as i ON rih.idinmueble = i.id "
                + "where nombre like ? or apellido like ? or correo like ? ";
        

        try {
            // abrir la conexion 
            conn = conexion.getConnection();

            // preara la consulta
            PreparedStatement sentencia = conn.prepareStatement(sql);
            String criterio = "%" + textoBusqueda + "%";
            sentencia.setString(1, criterio );
            sentencia.setString(2, criterio);
            sentencia.setString(3, criterio);
            
            ResultSet rs = sentencia.executeQuery();
            
            while (rs.next()){
                ResultadoInmueblesPorPersonaVO vo = new ResultadoInmueblesPorPersonaVO();
                
                vo.setIdPersona(rs.getInt("idpersona"));
                vo.setNombrePersona(rs.getString("nombre"));
                vo.setApellidoPersona(rs.getString("apellido"));
                vo.setCorreoPersona(rs.getString("correo"));
                
                vo.setIdRegistroInmueble(rs.getInt("idregistro"));
                vo.setFechaIngreso(rs.getDate("fecha_ingreso"));
                vo.setFechaSalida(rs.getDate("fecha_salida"));
                
                vo.setDireccion(rs.getString("direccion"));
                
                datos.add(vo);
            }
            

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error Cerrando Conexion");
                    System.err.println(e.getMessage());
                    //e.printStackTrace();
                }
            }
        }
    
        return datos;
        
    }
}
