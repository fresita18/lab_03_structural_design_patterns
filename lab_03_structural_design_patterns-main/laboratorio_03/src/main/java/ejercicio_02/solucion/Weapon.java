package ejercicio_02.solucion;

public abstract class Weapon {
    protected String name;
    protected String platform;

    public String getInfo() {
        return "Arma: " + name + " | Plataforma: " + platform;
    }

    public abstract void use();
}
