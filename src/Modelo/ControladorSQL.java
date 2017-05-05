/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.ConexionSQL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Jesús
 */
public class ControladorSQL {

    private static ControladorSQL controladorSQL;
    private ConexionSQL conexion;
    private PreparedStatement pst;
    private ResultSet resultado;

    private ControladorSQL() throws ClassNotFoundException {
    }

    public static ControladorSQL getControlador() {
        try {
            if (controladorSQL == null) {
                controladorSQL = new ControladorSQL();
            }
        } catch (ClassNotFoundException e) {
            System.err.println("No se puede acceder al controlador SQL");
        }
        return controladorSQL;
    }
    /**
     * METODOS DE LA CLASE CONTROLADOR
     */
    /*
    public int getnumFila(String nomTabla){
        int numFila = 0;
        
        try {
          conexion = new ConexionSQL();
          pst = conexion.conectar().prepareStatement("SELECT COUNT(*) FROM " + nomTabla);
          resultado = pst.executeQuery();
          while (resultado.next()){
              numFila = resultado.getInt(1);
          }
          resultado.close();
          pst.close();
          conexion.desconectar();
          
        } catch (SQLException e) {
            System.out.println("La consulta SQL es incorrecta");
            numFila = 0;
        } finally{
              return numFila;
        }
    }
     */
}
