package practicas;

import java.util.ArrayList;
import java.util.Collections;

import JLISV.LIB;
import clases.Persona;

public class practica16 {
    public static void main(String[] args) {
        ArrayList<Persona> p = new ArrayList<Persona>();
        int v = 0;
        while(v!= 3){
            System.out.println(
                """
                OPCION  DESCRIPCION
                ------  --------------------
                   1.   Añadir Personas
                   2.   Elegir orden mostrar 
                   3.   Salir menu
                ----------------------------    
                    """);
                v = LIB.lInt("Introducir num: ");
            switch(v){
                case 1:
                    p.add(new Persona(LIB.lString("Nombre: "),
                                        LIB.lInt("Edad: "),
                                        LIB.lDouble("Altura: "),
                                        LIB.lDouble("Peso: ")
                                    ));
                    LIB.detener();
                    break;
                case 2:
                    LIB.cln();
                    System.out.println("""
                        OPCION  DESCRIPCION
                        ------  --------------------
                           1.   Edad descendente
                           2.   Altura ascendente
                        ----------------------------
                            """);
                    int j = LIB.lInt();
                    if(j == 1){
                        Collections.sort(p, (a,b)->(a.getEdad()>b.getEdad())?-1:(a.getEdad()<b.getEdad())?1:0);
                    }else if( j == 2){
                        Collections.sort(p, (a,b)->(a.getAltura()>b.getAltura())?1:(a.getAltura()<b.getAltura())?-1:0);
                    }else{
                        System.out.println("Opcion no valida, saliendo...");
                        break;
                    }
                    for(int i =0; i <p.size();i++){
                        System.out.println("Nombre: " + p.get(i).NOMBRE +
                                           " Edad: " + p.get(i).getEdad() + 
                                           " Altura: " + p.get(i).getAltura() +
                                           " Peso " + p.get(i).getPeso());
                    }
                    LIB.detener();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion no soportada");
                    LIB.detener();
                    break;
            }
            LIB.cln();
        }
    }
}
