package practicas;

import JLISV.LIB;
import clases.Consumicion;
import clases.Consumicion.Articulos;

public class practica33 {
    public static void main(String[] args) {
        Consumicion c[] = new Consumicion [10];
        for(int i = 0; i < c.length;i++){
            c[i] = new Consumicion();
            c[i].setProducto(Articulos.values()[LIB.randomInt(0, 5)]);
            c[i].setPrecio(LIB.redon(LIB.randomDouble(0.01, 10.00),2));
            c[i].setNumArticulos(LIB.randomInt(1, 20));
        }
        for(int i = 0; i < c.length;i++){
            LIB.cln();
            System.out.println("Articulo: " + c[i].getProducto());
            System.out.println("Precio: " + c[i].getPrecio());
            System.out.println("Numero de Aticulos: " + c[i].getNumArticulos());
            System.out.println("---------------------------");
            System.out.println("Total: " + c[i].coste());
            LIB.detener();
        }
    }
}
