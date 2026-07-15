import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) throws SQLException {

        Connection conexao = ConnectionFactory.conectar();

        if (conexao != null) {
            System.out.println("CONECTADO COM SUCESSO!");
        } else {
            System.out.println("DEU RUIM!");
        }

    }
}
