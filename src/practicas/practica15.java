package practicas;

import java.util.Arrays;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica15 {
    public static void main(String[] args) {
        Circunferencia[] areas = new Circunferencia[10];
        for(int i = 0; i < areas.length;i++){
            areas[i] = new Circunferencia(LIB.randomInt(1, 9));
        }
        Arrays.sort(areas, 0, areas.length, (a,b)->(a.area()>b.area())?-1:(a.area()<b.area())?1:0);       
        for(int i = 0; i < areas.length;i++){
            System.out.println("radio: " + areas[i].getRadio() +
                             " longitud: " + LIB.redon(areas[i].longitud(), 2) +
                             " Area: " + LIB.redon(areas[i].area(), 2));
        }
    }
}
