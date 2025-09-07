package ejercicio_02.solucion;

public class PCFactory implements GameElementFactory {
    @Override
    public Character createWarrior() { return new PCWarrior(); }

    @Override
    public Weapon createSword() { return new PCSword(); }
}
