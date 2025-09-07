package ejercicio_03.solucion;

public enum NetworkConfig {
    INSTANCE;

    private String serverUrl = "wss://game-server.com";
    private int port = 8080;

    public String getServerUrl() { return serverUrl; }
    public void setServerUrl(String serverUrl) { this.serverUrl = serverUrl; }

    public int getPort() { return port; }
    public void setPort(int port) { this.port = port; }
}
