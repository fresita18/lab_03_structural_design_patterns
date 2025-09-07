package ejercicio_01.solucion;

public class FPSGame extends Game {
    public FPSGame() {
        this.name = "Battle Arena";
        this.genre = "FPS";
    }

    @Override
    public void start() {
        System.out.println("🔫  Cargando mapa FPS... selecciona tu arma inicial.");
    }
}
