package creationaldesignpatterns.singleton.doublelocking;

//best way as it reduces overhead and is thread safe.
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
