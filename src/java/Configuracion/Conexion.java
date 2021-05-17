package Configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlertaCovid19", "root", "123abc");
            return conexion;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;

        }

    }
}
