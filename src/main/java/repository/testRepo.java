package repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class testRepo {


    String dbURL = "jdbc:postgresql://localhost:5432/starterDB";

    public void testRepoConnection() {
        Connection textConn;
        {
            try {
                textConn = DriverManager.getConnection(dbURL);
                if (textConn != null) {
                    System.out.println("DB Connected");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }


}
