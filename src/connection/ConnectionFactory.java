package connection;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Augusto Barros
 */
public class ConnectionFactory {

    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost/db_juliana";
    private final String USER = "root";
    private final String PASS = "1234";

    public Connection getConnection() {
        try {

            return DriverManager.getConnection(URL, USER, PASS);

        } catch (SQLException ex) {

            throw new RuntimeException("Erro de Conexão: ", ex);

        }

    }

    public static void closeConnection(Connection con) {

        if (con != null) {

            try {

                con.close();

            } catch (SQLException ex) {

                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);

            }
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        
        closeConnection(con);
        
        try {
            
            if (stmt != null) {
                stmt.close();
                
            }
            
        } catch (SQLException e) {
            
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
            
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        
        try {
            
            if (rs != null) {
                rs.close();
            }
            
        } catch (SQLException e) {
            
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e);
        
        }
    }

}
