package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String enderecoIP = "localhost";
    private static final String enderecoPorta = "5432";
    private static final String username = "postgres";
    private static final String password = "admin";
    private static final String nomeBanco = "postgres";


    public static Connection conectar() {

        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://"+enderecoIP+":"+enderecoPorta+"/"+nomeBanco,
                    username,
                    password
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
