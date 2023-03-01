package practicas;

import JLISV.LIB;
import clases.figuras.Circunferencia;

public class practica38 {
    public static void main(String[] args) {
        Circunferencia[] c = new Circunferencia[10];
        for(int i = 0; i < c.length; i++){
            c[i] = new Circunferencia(LIB.randomInt(1, 10));
        }
        for(Circunferencia c2: c){
            System.out.println("Circunferencia de radio: " + c2.getRadio());
        }
        Circunferencia[] c1 = new Circunferencia[10];
        for(int i = 0; i <c.length;i++){
            c1[i] = c[i].clone();
        }
        c1[0].setRadio(20);
        for(int i = 1; i < c1.length; i++){
            if(i != c1.length-1){
                c[i].setRadio(c[i].getRadio() + c1[i].getRadio());
            }else{
                c[i].setRadio(c[i].getRadio() + c1[0].getRadio());
            }
        }
        System.out.println("ARRAY ORIGINAL");
        for(Circunferencia c2: c){
            System.out.println("Circunferencia de radio: " + c2.getRadio());
        }
        System.out.println("ARRAY CLONADO");
        for(Circunferencia c2: c1){
            System.out.println("Circunferencia de radio: " + c2.getRadio());
        }
    }
}
