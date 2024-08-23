package creationaldesignpatterns.singleton.lazy;

public class DBConnection {
    private static DBConnection connObject;

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        if (connObject == null) {
            connObject = new DBConnection();
        }
        return connObject;
    }
}
