package practicas;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica12 {
    public static void main(String[] args) {
        Circunferencia c = new Circunferencia(LIB.randomInt(2, 5));
        double longi = 2*c.getRadio()*Math.PI;
        double area = Math.pow(c.getRadio(), 2)*Math.PI;
        area = LIB.redon(area, 3);
        longi = LIB.redon(longi, 3);
        System.out.println("Longitud: " + longi);
        System.out.println("Area : " + area);
    }
}
