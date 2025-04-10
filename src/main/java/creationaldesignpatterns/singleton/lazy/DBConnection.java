package creationaldesignpatterns.singleton.lazy;

//This implementation is not thread-safe. If multiple threads call getInstance() simultaneously when instance is null, it's possible to create multiple instances.
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
