package practicas;

import JLISV.LIB;
import clases.Rebajas;

/**
 * practica18
 */
public class practica18 {
    public static void main(String[] args) {
        Rebajas r = new Rebajas();
        int menu = -1;
        while(menu != 0){
            System.out.println("""
                    OPCION  DESCRIPCION
                    ------  ------------------------------
                       1.   Añadir precio rebajado
                       2.   Añadir porcentaje
                       3.   Obtener precio inicial
                       0.   Salir Programa
                    """);
            menu = LIB.lInt("Introducir Opcion: ");
            switch(menu){
                case 1:
                    r.setPrecio(LIB.lDouble("Introducir precio rebajado: "));
                    LIB.detener();
                    break;
                case 2:
                    r.setPorcentaje(LIB.lInt("Introducir porcentaje: "));
                    LIB.detener();
                    break;
                case 3:
                    mostrarPrecio(r);
                    LIB.detener();
                    break;
                default:
                    break;
            }
            LIB.cln();
        }
    }
    public static void mostrarPrecio(Rebajas r){
        System.out.println("Precio Rebajado: " + r.getPrecio());
        System.out.println("Porcentaje: " + r.getPorcentaje());
        System.out.println("Precio Original: " + r.precioInicial());
    }
    
}
