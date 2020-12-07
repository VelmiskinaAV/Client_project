import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public String host = "localhost";
    public String db_name = "clients_data";
    public String port = "3306";

    Connection connection;

    public Connection getConnection () throws ClassNotFoundException, SQLException{ // возвращать базу данных

        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_name;
        Class.forName("com.mysql.jdbc.Driver");
        String username = "root";
        String password = "Arinavelm98!";
        connection = DriverManager.getConnection(url, username, password);

        return connection;
    }

}
