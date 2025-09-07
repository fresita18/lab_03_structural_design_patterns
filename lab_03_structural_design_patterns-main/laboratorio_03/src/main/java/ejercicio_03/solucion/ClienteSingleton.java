package ejercicio_03.solucion;

public class ClienteSingleton {
    public static void main(String[] args) {
        GameConfig cfg = GameConfig.getInstance();
        cfg.setMaxPlayers(50);
        cfg.setDebugMode(true);
        cfg.setDatabaseUrl("jdbc:mysql://production:3306/gamedb");

        NetworkConfig.INSTANCE.setServerUrl("wss://prod-server.com");
        NetworkConfig.INSTANCE.setPort(9090);

        GameSession session = new GameSession();
        NetworkManager network = new NetworkManager();
        DatabaseManager database = new DatabaseManager();

        session.startSession();
        network.connect();
        database.saveData();
    }
}
