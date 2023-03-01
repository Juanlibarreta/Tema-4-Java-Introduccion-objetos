package practicas;

import JLISV.LIB;
import clases.Persona;

public class practica25 {
    public static void main(String[] args) {
        Persona p = new Persona(LIB.lString("NOMBRE: "),
        LIB.lInt("Edad: "),
        LIB.lDouble("Peso: "));
        p.cumplir();
        p.cumplir();
        p.cumplir();
        p.engordar(10);

        if(p.serInfantil()){
        System.out.println("Es Infantil");
        }else if(p.serNino()){
        System.out.println("Es Niño");
        }else if(p.serAdolescente()){
        System.out.println("Es Adolescente");
        }else if(p.serJoven()){
        System.out.println("Es Joven");
        }else if(p.serAdulto()){
        System.out.println("Es Adulto");
        }else{
        System.out.println("Es anciano");
        }
        System.out.println("IMC: " + p.imc());
            }
}
