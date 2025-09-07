package ejercicio_02.solucion;

public class ClienteAbstractFactory {
    public static void main(String[] args) {

        GameElementFactory pcFactory = new PCFactory();
        Character pcWarrior = pcFactory.createWarrior();
        Weapon pcSword = pcFactory.createSword();

        System.out.println(pcWarrior.getInfo());
        pcWarrior.attack();
        System.out.println(pcSword.getInfo());
        pcSword.use();
        System.out.println("-----");

        GameElementFactory mobileFactory = new MobileFactory();
        Character mobileWarrior = mobileFactory.createWarrior();
        Weapon mobileSword = mobileFactory.createSword();

        System.out.println(mobileWarrior.getInfo());
        mobileWarrior.attack();
        System.out.println(mobileSword.getInfo());
        mobileSword.use();
        System.out.println("-----");
    }
}
