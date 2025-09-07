package ejercicio_01.solucion;

public abstract class GameFactory {
    public abstract Game createGame();

    public void playGame() {
        Game game = createGame();
        System.out.println("Creado -> " + game.getInfo());
        game.start();
        System.out.println("-----");
    }
}
