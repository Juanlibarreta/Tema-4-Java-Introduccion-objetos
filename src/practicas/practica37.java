package practicas;

import JLISV.LIB;
import clases.Rebajas;

public class practica37 {
    public static void main(String[] args) {
        Rebajas r = new Rebajas(LIB.lDouble("Introducir precio rebajado: "),
                LIB.lInt("Introducir porcentaje: "));
        Rebajas r2 = r.clone();
        r2.setPrecio(r2.getPrecio()+1);
        System.out.println("Rebaja 1: ");
        System.out.println(r.toString());
        System.out.println("Rebaja clonada: ");
        System.out.println(r2.toString());
            }
}
