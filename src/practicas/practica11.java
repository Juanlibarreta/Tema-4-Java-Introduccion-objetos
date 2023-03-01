package practicas;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica11 {

    public static void main(String[] args) {
        Circunferencia c = new Circunferencia();
        int entrada = LIB.lInt();
        while(entrada != 0){
            try{
                c.setRadio(entrada);
                System.out.println(2*c.getRadio()*Math.PI);
                entrada = LIB.lInt();
            }
            catch(Exception e){
                System.out.println("radio incorrecto");
                entrada = LIB.lInt();
            }
        }
    }
}
