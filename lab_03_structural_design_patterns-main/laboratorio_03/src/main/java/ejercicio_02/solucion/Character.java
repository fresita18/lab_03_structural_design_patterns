package ejercicio_02.solucion;

public abstract class Character {
    protected String name;
    protected String platform;

    public String getInfo() {
        return "Personaje: " + name + " | Plataforma: " + platform;
    }

    public abstract void attack();
}
