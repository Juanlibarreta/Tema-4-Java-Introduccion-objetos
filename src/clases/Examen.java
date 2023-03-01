package clases;

import java.beans.PropertyChangeSupport;
import java.util.Comparator;

import clases.figuras.Rectangulo;

public class Examen implements Cloneable, Comparable<Examen>, AutoCloseable, Comparator<Examen>{
    private static int creados;
    private static double total_dos;
    private final PropertyChangeSupport cambiado = new PropertyChangeSupport(this);
    private int uno = 1;
    private Rectangulo r;
    private final Persona P = new Persona();
    private double dos = 2;
    static public Comparator<Examen> UNO = (a,b) -> {
        if(a == null) return -1;
        return 0;
    };
    
    public void setAltura(double v) {
         P.setAltura(v);
    }
    public void adelgazar() {
         P.adelgazar();
    }
    
    public int getCreados(){
        return creados;
    }
    public double getTotalDos(){
        return total_dos;
    }
    public int getUno() {
        return uno;
    }
    public Rectangulo getR() {
        return r;
    }
    public double getDos() {
        return dos;
    }
    public Examen setUno(int uno) {
        int antiguo = this.uno;
        this.uno = uno;
        cambiado.firePropertyChange("uno", antiguo, this.uno);
        return this;
    }
    public Examen setR(Rectangulo r) {
        this.r = r;
        return this;
    }
    public Examen setDos(double dos) {
        setTotalDos(getTotalDos()-this.dos);
        this.dos = dos;
        setTotalDos(getTotalDos()+this.dos);
        return this;
    }
    private static void setTotalDos(double d){
        Examen.total_dos = d;
    }
    private static void setCreados(int v){
        Examen.creados = v;
    }
    public Examen(){
        setCreados(getCreados()+1);
    }
    public static Examen metodo(Examen a, Examen b){
        Examen c = new Examen();
        c.setDos(2);
        return c;
    }

    @Override
    public String toString() {
        return "Uno: " + uno + "\n" + "Dos: " + dos + "\n" + "r: " + r.dimension();
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + uno;
        long temp;
        temp = Double.doubleToLongBits(dos);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Examen other = (Examen) obj;
        if (uno != other.uno)
            return false;
        if (Double.doubleToLongBits(dos) != Double.doubleToLongBits(other.dos))
            return false;
        return true;
    }
    @Override
    public Examen clone() {
        try{
            Examen e = (Examen) super.clone();
            e.setR(e.getR().clone());
            return e;
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return null;
    }
    @Override
    public int compareTo(Examen o) {
        if(getUno() < o.getUno())return -1;
        if(getUno() > o.getUno())return 1;
        return 0;
    }
    @Override
    public void close() throws Exception {
        System.out.println("Me he muerto");
        
    }
    @Override
    public int compare(Examen o1, Examen o2) {
        
        return 0;
    }
    
        
}
