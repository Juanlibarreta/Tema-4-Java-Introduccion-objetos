package practicas;

import JLISV.LIB;
import clases.Repostar;
import clases.enumerados.Semana;

public class practica32 {
    public static void main(String[] args) {
        Repostar r = new Repostar(LIB.lDouble("Cantidad: "),
                                 LIB.lDouble("precio: "),
                                 Semana.valueOf(LIB.lString("Dia de la semana: ")));
        System.out.println("Dia: " + r.getDia() + " Coste: " + r.coste(2));
    }
}
