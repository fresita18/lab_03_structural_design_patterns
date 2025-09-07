package ejercicio_02.solucion;

public class MobileSword extends Weapon {
    public MobileSword() {
        this.name = "Espada";
        this.platform = "Mobile";
    }

    @Override
    public void use() {
        System.out.println("Espada Mobile con sprites ligeros y animación fluida.");
    }
}
