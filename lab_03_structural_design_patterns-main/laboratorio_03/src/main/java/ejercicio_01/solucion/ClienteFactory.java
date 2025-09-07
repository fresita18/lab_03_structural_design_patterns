package ejercicio_01.solucion;

import java.util.List;

public class ClienteFactory {
    public static void main(String[] args) {
        List<GameFactory> factories = List.of(
                new RPGFactory(),
                new FPSFactory(),
                new PuzzleFactory()  
        );

        factories.forEach(GameFactory::playGame);
    }
}
