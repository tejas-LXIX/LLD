package creationaldesignpatterns.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    Connection mySqlConnection;

    DBConnection() {
        try {
            mySqlConnection = DriverManager.getConnection("url", "username", "password");
        } catch (Exception e) {

        }
    }
}
