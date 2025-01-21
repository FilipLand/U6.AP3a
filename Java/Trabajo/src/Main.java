import Utilidades.Personaje;
import Utilidades.Util;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!\n");
        System.out.println("Welcome to Java!");
            for (int i = 0; i <= 1000; i++) {
            System.out.println("i = " + i);
        }
            Personaje p1 = new Personaje("Mario", 70, "Tanque", 70, 20, 128, 80, 70, 250, 70, "Guante Magico", "Caja Loca");
            Util u1 = new Util("Citroen","C4", 5,500, 25000, true);
            System.out.println(p1.toString());
            System.out.println(u1.toString());
    }
}