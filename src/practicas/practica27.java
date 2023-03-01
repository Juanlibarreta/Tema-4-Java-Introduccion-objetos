package practicas;
import clases.figuras.*;
import JLISV.*;

public class practica27 {
    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.setAncho(LIB.lInt("Ancho: "));
        r.setAlto(LIB.lInt("Alto: "));
        System.out.println(r.dibujar());
        r.invertir();
        System.out.println(r.dibujar());
        r.plus();
        System.out.println(r.dibujar());
        if(r.esCuadrado()){
            System.out.println("Es cuadrada");
        }else{
            System.out.println("No es cuadrada");
        }
    }
}
