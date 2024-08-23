package creationaldesignpatterns.singleton.synchronizedway;

public class DBConnection {
    private static DBConnection connObject;

    private DBConnection() {
    }

    //very expensive
    synchronized public static DBConnection getInstance() {
        if (connObject == null) {
            connObject = new DBConnection();
        }
        return connObject;
    }
}
