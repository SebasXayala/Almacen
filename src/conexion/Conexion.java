/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author juans
 */
public class Conexion {

    Connection con;

    public Conexion() throws ClassNotFoundException {
        Connection con;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/almacen", "root", "020319");

        } catch (SQLException ex) {
        }
    }

    public Connection getConnection(){
        return con;
    }
}
