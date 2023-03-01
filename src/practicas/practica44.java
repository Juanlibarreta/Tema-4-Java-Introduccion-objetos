package practicas;

import clases.Mascota;
import clases.Mascota.Animal;
import clases.Persona;

public class practica44 {
    public static void main(String[] args) {
        Mascota m = new Mascota("Ati", Animal.tortuga);
        Persona p1 = new Persona("Carlos", m);
        Persona p2 = p1.clone();
        System.out.println(m.compareTo(p1.getMascota()));
        p1.setMascota(p1.getMascota().setNombre("Atila"));
        System.out.println(m.compareTo(p2.getMascota()));
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
