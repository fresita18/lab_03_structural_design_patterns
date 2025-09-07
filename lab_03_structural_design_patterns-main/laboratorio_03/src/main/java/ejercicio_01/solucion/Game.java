package ejercicio_01.solucion;

public abstract class Game {
    protected String name;
    protected String genre;

    public String getInfo() {
        return "Juego: " + name + " | Género: " + genre;
    }

    public abstract void start();
}
