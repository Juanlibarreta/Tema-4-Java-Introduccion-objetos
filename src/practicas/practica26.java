package practicas;

import JLISV.LIB;
import clases.figuras.Rectangulo;

public class practica26 {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo(LIB.lInt("Ancho: "), LIB.lInt("Alto: "));
        System.out.println("Area: " + r.area() + "\n" +
                            "Perimetro: " + r.perimetro() + "\n" +
                            "Diagonal: " + r.diagonal());
    }
}
