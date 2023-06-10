/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author juans
 */
public class Conexion {

    Connection conectar = null;
    
    String usuario = "root";
    String contraseña = "020319";
    String bd = "almacen";
    String ip = "localHost";
    String puerto = "3306";
    
    String cadena ="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            conectar = (Connection) DriverManager.getConnection(cadena, usuario, contraseña);
            JOptionPane.showMessageDialog(null, "la conexion se a realiado con exito");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error al conectarse a la base de datos, error:"+e.toString());
        }
        return conectar;
    }
    
    
}
