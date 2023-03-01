package practicas;

import java.util.ArrayList;
import java.util.Collections;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica17 {
    public static void main(String[] args) {
        int entrada = -1;
        ArrayList<Circunferencia> c = new ArrayList<Circunferencia>();
        while(entrada != 0){
            System.out.println("""
                    OPCION  DESCRIPCION
                    ------  ------------------------------
                       1.   Añadir circunferencia
                       2.   Eliminar ultima circunferencia
                       3.   Ordenar ascendente
                       4.   Ordenar descendente
                       5.   Mostrar circunferencias
                       0.   Salir Programa
                    """);
            entrada = LIB.lInt("Introducir Opcion: ");
            switch(entrada){
                case 1:
                    c.add(new Circunferencia(LIB.lInt("Introduir radio: ")));
                    LIB.detener();
                    break;
                case 2:
                    if(c.isEmpty()){
                        System.out.println("No hay nada que borrar");
                    }else{
                        c.remove(c.size()-1);
                    }
                    LIB.detener();
                    break;
                case 3:
                    Collections.sort(c,(a,b)->(a.getRadio()>b.getRadio())?-1:(a.getRadio()<b.getRadio())?1:0);
                    LIB.detener();
                    break;
                case 4:
                    Collections.sort(c,(a,b)->(a.getRadio()>b.getRadio())?1:(a.getRadio()<b.getRadio())?-1:0);
                    LIB.detener();
                    break;
                case 5:
                    for(Circunferencia i: c){
                        System.out.println("Radio: " + i.getRadio());
                    }
                    LIB.detener();
                    break;
                default:
                    break;
            }
            LIB.cln();
        }
    }
}
