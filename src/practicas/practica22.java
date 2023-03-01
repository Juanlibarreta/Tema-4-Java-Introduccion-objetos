package practicas;

import JLISV.LIB;
import clases.figuras.Rectangulo;

public class practica22 {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(LIB.lInt("alto: "),
                                      LIB.lInt("ancho: "),
                                      LIB.lChar("borde: "),
                                      LIB.lChar("relleno: "));
        System.out.println("");
        System.out.println("Rectangulo insertado: ");
        System.out.println(r.toString());
    }
}
