package practicas;
import clases.enumerados.*;
import JLISV.*;

public class practica31 {
    public static void main(String[] args) {
        Mes s = Mes.values()[LIB.lInt("Introducir num mes: ", v -> v >= 1 && v <= 12) - 1];
        System.out.println(s.name().toUpperCase());
    }
}
