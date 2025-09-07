package ejercicio_03.solucion;

public class NetworkManager {
    public void connect() {
        GameConfig appCfg = GameConfig.getInstance();
        NetworkConfig net = NetworkConfig.INSTANCE;

        System.out.println("Conectando a " + net.getServerUrl() + ":" + net.getPort());
        System.out.println("Debug mode (global): " + appCfg.isDebugMode());
    }
}
