package creationaldesignpatterns.singleton.doublelocking;

public class DBConnection {
    private static DBConnection connObject;

    private DBConnection() {
    }

    //very expensive
    public static DBConnection getInstance() {
        if (connObject == null) {
            synchronized (DBConnection.class) {
                if (connObject == null) {
                    connObject = new DBConnection();
                }
            }
        }
        return connObject;
    }
}
