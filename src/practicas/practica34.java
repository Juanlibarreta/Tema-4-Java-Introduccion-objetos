package practicas;

import java.util.ArrayList;

import JLISV.LIB;
import clases.Repostar;
import clases.enumerados.Semana;

public class practica34 {
    public static void main(String[] args) {
        ArrayList<Repostar> r = new ArrayList<>();
        int menu = -1;
        while(menu != 0){
            System.out.println("""
                    OPCION  DESCRIPCION
                    ------  ------------------
                       1.   Repostar
                       2.   Mostrar Repostajes
                       0.   Salir
                    """);
            menu = LIB.lInt("Introducir opcion: ");
            switch(menu){
                case 1:
                    r.add(new Repostar(Semana.valueOf(LIB.lString("dia:")),
                                        LIB.lDouble("Cantidad de gasolina: "),
                                        LIB.lDouble("Precio gasolina: ")));
                    LIB.detener();
                    break;
                case 2:
                    if(r.isEmpty()){
                        System.out.println("No se ha repostado");
                    }else{
                        mostrar(r);
                    }
                    LIB.detener();
                    break;
                default:
                    break;
            }
            LIB.cln();
        }
    }

    public static void mostrar(ArrayList<Repostar> v){
        for(Repostar c: v){
            System.out.println("El dia " + c.getDia() +
                                " Reposto " + c.getCantidad() + " de gasolina, el lito estaba a " + c.getPrecio()+ " €/L" + "\n"+
                                "Coste total: " + c.coste(2));
        }
    }
}
