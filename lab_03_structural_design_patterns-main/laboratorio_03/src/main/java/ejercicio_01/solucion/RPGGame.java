package ejercicio_01.solucion;

public class RPGGame extends Game {
    public RPGGame() {
        this.name = "Epic Quest";
        this.genre = "RPG";
    }

    @Override
    public void start() {
        System.out.println("⚔️  Iniciando aventura RPG... elige tu clase y comienza la misión.");
    }
}
