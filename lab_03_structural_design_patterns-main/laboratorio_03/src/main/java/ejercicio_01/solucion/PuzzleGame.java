package ejercicio_01.solucion;

public class PuzzleGame extends Game {
    public PuzzleGame() {
        this.name = "Mind Blocks";
        this.genre = "Puzzle";
    }

    @Override
    public void start() {
        System.out.println("🧩  Iniciando rompecabezas... resuelve el nivel 1.");
    }
}
