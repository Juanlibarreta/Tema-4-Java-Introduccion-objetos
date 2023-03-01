package practicas;

import clases.Persona;

public class Aplicacion {
    Persona p;
    public Aplicacion(){
        p = new Persona("Juan");
    }
    public static void main(String[] args) {
        Aplicacion app = new Aplicacion();
        app.inicio();
    }

    private void inicio() {
        System.out.println(p.NOMBRE);
    }
}
