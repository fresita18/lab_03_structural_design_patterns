package ejercicio_02.solucion;

public class PCSword extends Weapon {
    public PCSword() {
        this.name = "Espada";
        this.platform = "PC";
    }

    @Override
    public void use() {
        System.out.println("Espada PC con modelado 3D detallado y reflejos.");
    }
}
