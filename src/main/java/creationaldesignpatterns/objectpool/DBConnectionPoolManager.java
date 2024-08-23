package creationaldesignpatterns.objectpool;

import java.util.ArrayList;
import java.util.List;

public class DBConnectionPoolManager {
    List<DBConnection> freeConnectionsInPool = new ArrayList<>();
    List<DBConnection> connectionsCurrentlyInUse = new ArrayList<>();
    int INITIAL_POOL_SIZE = 3;
    int MAX_POOL_SIZE = 6;

    private static DBConnectionPoolManager dbConnectionPoolManager;

    public static DBConnectionPoolManager getInstance() {
        if (dbConnectionPoolManager == null) {
            synchronized (DBConnectionPoolManager.class) {
                if (dbConnectionPoolManager == null) {
                    dbConnectionPoolManager = new DBConnectionPoolManager();
                }
            }
        }
        return dbConnectionPoolManager;
    }

    private DBConnectionPoolManager() {
        for(int i=0;i<INITIAL_POOL_SIZE;i++) {
            freeConnectionsInPool.add(new DBConnection());
        }
    }

    public synchronized DBConnection getDBConnection() {
        if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() < MAX_POOL_SIZE) {
            freeConnectionsInPool.add(new DBConnection());
            System.out.println("Created new connection and added into the pool.");
        } else if (freeConnectionsInPool.isEmpty() && connectionsCurrentlyInUse.size() >= MAX_POOL_SIZE) {
            System.out.println("Cannot create new connection as max limit reached.");
            return null;
        }
        DBConnection dbConnection = freeConnectionsInPool.remove(freeConnectionsInPool.size()-1);
        connectionsCurrentlyInUse.add(dbConnection);
        return dbConnection;
    }

    public synchronized void releaseDBConnection(DBConnection dbConnection) {
        if (dbConnection != null) {
            connectionsCurrentlyInUse.remove(dbConnection);
            freeConnectionsInPool.add(dbConnection);
            System.out.println("Released the db connection successfully. DBConnection: " + dbConnection);
        }
    }
}
