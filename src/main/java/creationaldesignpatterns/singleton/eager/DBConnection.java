package creationaldesignpatterns.singleton.eager;

public class DBConnection {
    private static DBConnection connObject = new DBConnection();

    private DBConnection() {
    }

    public static DBConnection getInstance() {
        return connObject;
    }
}
