import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static final String URL =
            "jdbc:mysql://localhost:3306/land_record_db";

    static final String USER = "root";

    static final String PASSWORD = "root";

    public static Connection getConnection() {

        Connection con = null;

        try {

            con = DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );

            System.out.println("Database Connected!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}