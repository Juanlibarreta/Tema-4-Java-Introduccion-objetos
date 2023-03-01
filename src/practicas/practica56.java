package practicas;

import JLISV.LIB;
import clases.Placa;
import clases.enumerados.Materiales;

public class practica56 {
    public static void main(String[] args){
        try(Placa p = new Placa(LIB.lLinea("Inscripcion: "), LIB.lInt("Alto: "),  LIB.lInt("Ancho: "), Materiales.valueOf("Material: "))){
            try(Placa c = new Placa(LIB.lLinea("Inscripcion: "), LIB.lInt("Alto: "),  LIB.lInt("Ancho: "), Materiales.valueOf("Material: "))){
                System.out.println(p.compareTo(c));
                System.out.println(p.toString());
                System.out.println(c.toString());
            }
        }
    }
}
