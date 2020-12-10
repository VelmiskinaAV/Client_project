import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public String db_name = "clients_data";

    public Connection getConnection() throws ClassNotFoundException, SQLException{

        String url = "jdbc:h2:/c:/JavaPrj/SQLDemo/db/" + db_name;
        Class.forName("org.h2.Driver");
        String username = "root";
        String password = "Arinavelm98!";
        Connection connection = DriverManager.getConnection(url , username, password);

        return connection;
    }

}
