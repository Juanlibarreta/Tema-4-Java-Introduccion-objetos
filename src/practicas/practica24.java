package practicas;

import java.util.ArrayList;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica24 {
    public static void main(String[] args) {
        ArrayList<Circunferencia> c = new ArrayList<>();
        int entrada;
        do{
            entrada =LIB.lInt("Introducir radio (1 para salir): ");
            if(entrada != 1){
                c.add(new Circunferencia(entrada));
            }
        }while(entrada != 1);
        for(Circunferencia c1: c){
            System.out.println(c1.toString(3));
        }
    }
}
