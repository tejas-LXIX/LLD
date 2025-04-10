package creationaldesignpatterns.singleton.eager;

//While it is inherently thread-safe, it could potentially waste resources if the singleton instance is never used by the client application.
public class DBConnection {
    private static DBConnection connObject = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return connObject;
    }
}
