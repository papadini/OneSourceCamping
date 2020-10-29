import service.testService;

import java.sql.*;

public class oneSourceMain {

    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String dbURL = "jdbc:postgresql://localhost:5432/starterDB";

        System.out.println("Hello Camping World");

        Connection textConn;
        {
            try {
                textConn = DriverManager.getConnection(dbURL);
                if (textConn != null) {
                    DatabaseMetaData databaseMeta = textConn.getMetaData();
                    ResultSet resultSet = databaseMeta.getTables(null, null, null, new String[]{"TABLE"});
                    System.out.println("Printing TABLE_TYPE \"TABLE\" ");
                    System.out.println("----------------------------------");
                    while(resultSet.next())
                    {
                        //Print
                        System.out.println(resultSet.getString("TABLE_NAME"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }



    }
}
