package practicas;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.util.Random;

import clases.figuras.Circunferencia;
import clases.figuras.Rectangulo;

public class practica58 {
    Circunferencia c1;
    Circunferencia c2;
    Rectangulo r;

    private void inicio() {
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int ale = rd.nextInt(0,11);
            if(rd.nextBoolean()){
                c1.setRadio(ale);
            }else{
                c2.setRadio(ale);
            }
        }
    }

    public practica58(){
        c1 = new Circunferencia(1);
        c2 = new Circunferencia(2);
        r = new Rectangulo(3,5,'+',' ');

        c1.getCambiandose().addVetoableChangeListener("radio", v-> onChangingRadio(v));
        c2.getCambiandose().addVetoableChangeListener("radio", v-> onChangingRadio(v));
        c1.getCambio().addPropertyChangeListener("radio", v-> onChangeRadio(v));
        c2.getCambio().addPropertyChangeListener("radio", v-> onChangeRadio(v));
        r.getCambio().addPropertyChangeListener("cambio", v-> onChangeRect());
    }
    private void onChangeRect(){
        System.out.println(r.dibujar());
    }
    private void onChangeRadio(PropertyChangeEvent v){
        Circunferencia c = (Circunferencia) v.getSource();
        if(c.getRadio() == c1.getRadio()){
            r.setAncho(r.getAncho()+1);
        }else{
            r.setAlto(r.getAlto()+1);
        }
    }
    private void onChangingRadio(PropertyChangeEvent v) throws PropertyVetoException{
        double edadAnterior = (double) v.getOldValue();
        double edadActual = (double) v.getNewValue();
        if(edadActual < edadAnterior){
            System.out.println("Error, demasiado pequeño");
            throw new PropertyVetoException("Cancelar", v);
        }
    }
   
    public static void main(String[] args) {
        practica58 app = new practica58();
        app.inicio();
    }  
}
