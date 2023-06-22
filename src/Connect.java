import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connnection {
    public Connection connnect() {
        String url = " jdbc:mysql://localhost:3306";
        Connection con;

        {
            try {
                con = DriverManager.getConnection(url, "root", "mlp0mlp0S$");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}
