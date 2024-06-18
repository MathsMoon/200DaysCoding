package JDBCRevision.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public Connection getConnection() throws SQLException {
        String sql = "jdbc:mysql://localhost:3305";
        String username = "root";
        String password = "root";
        return DriverManager.getConnection(sql, username, password);
    }
}