import java.beans.PropertyChangeEvent;

import clases.*;


public class Tema4 {
    Persona p;
    Consumicion c;

    public Tema4(){
        p = new Persona("Pedro",10,0.5,67.0);
        c = new Consumicion(Consumicion.Articulos.pincho, 2.0,1);

        //eventos
        p.addPropertyChangeListener("edad", v->{
            Persona a = (Persona) v.getSource();
            int edadAntigua = (int) v.getOldValue();
            int edadActual = (int) v.getNewValue();

            if(edadActual > edadAntigua){
                c.setPrecio(c.getPrecio() + 1.0);
            }
        });
        p.addPropertyChangeListener("edad", v-> onChangeEdadP(v));
    }

    private void onChangeEdadP(PropertyChangeEvent v) {
            p.setAltura(p.getAltura() + 0.3);
    }

    private void inicio(){
        try(Persona j = new Persona()){
            System.out.println(j.toString());
            System.out.println(Persona.getCreados());
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Persona.getCreados());
    }

    public static void main(String[] args) throws Exception {
        Tema4 ap = new Tema4();
        ap.inicio();
    }
}