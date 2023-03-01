package practicas;

import JLISV.LIB;
import clases.Persona;

public class practica13 {
    public static void main(String[] args) {
        Persona p = new Persona(LIB.lString("Nombre: "),
                                LIB.lInt("Edad: "),
                                LIB.lDouble("Altura: "),
                                LIB.lDouble("Peso: "));
        double imc = p.getPeso()/Math.pow(p.getAltura(), 2);
        imc = LIB.redon(imc, 1);
        System.out.println("IMC: " + imc);
    }
}
