package junittesting.basictesting.beforeeachaftereach;

public class DatabaseConnection {

    private boolean connected;

    // Method to simulate connecting to a database
    public void connect() {
        connected = true;
        System.out.println("Database connected.");
    }

    // Method to simulate disconnecting from the database
    public void disconnect() {
        connected = false;
        System.out.println("Database disconnected.");
    }

    // Method to check if the database is connected
    public boolean isConnected() {
        return connected;
    }
}

