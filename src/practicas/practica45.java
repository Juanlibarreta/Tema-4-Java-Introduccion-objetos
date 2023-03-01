package practicas;

import java.util.ArrayList;

import JLISV.LIB;
import clases.Alumnos;

public class practica45 {
    public static void main(String[] args) {
        ArrayList<Alumnos> alumnos = new ArrayList<>();
        int menu = -1;
        while(menu != 0){
            menu = menuSelect();
            switch(menu){
                case 1:
                    anadir(alumnos);
                    break;
                case 2:
                    anadirNota(alumnos);
                    break;
                case 3:
                    modNota(alumnos);
                    break;
                case 4:
                    eliNotaIndex(alumnos);
                    break;
                case 5:
                    cloneFirst(alumnos);
                    break;
                case 6:
                    mostrarTodo(alumnos);
                    break;
                case 7:
                    mostrarMedia(alumnos);
                    break;
                case 8:
                    mostrarNotaAlumno(alumnos);
                    break;
                default:
                    break;
            }
            LIB.detener();
            LIB.cln();
        }
    }

    public static int menuSelect(){
        String c = """
                OPCION  DESCRIPCION
                ------  ------------------------------
                   1.   Añadir alummno(no repetidos)
                   2.   Añadir nota a alumno
                   3.   Modificar nota
                   4.   Eliminar nota posicion
                   5.   Clonar, modificar nombre y añadir alumno
                   6.   Mostrar informe todas las notas
                   7.   Mostrar notas medias, sobresalientes y supensos
                   8.   Mostrar notas alumno
                   0.   Salir Programa
                    """;
        System.out.println(c);
        int v = LIB.lInt("OPCION: ");
        return v;
    }

    public static void anadir(ArrayList<Alumnos> alumnos){
        String nombre = LIB.lString("Insertar nombre: ");
            for(int i = 0; i< alumnos.size();i++){
                if(alumnos.get(i).getNombre().contains(nombre)){
                System.out.println("Nombre ya introducido");
                return;
                }
            }
         alumnos.add(new Alumnos(nombre));
    }
    public static void anadirNota(ArrayList<Alumnos> alumnos){
        if(alumnos.isEmpty()){
            System.out.println("Lista vacia, introduzca alumno primero");
        }else{
            String busca = LIB.lString("Nombre del alumno a introducir nota: ");
            for(int i = 0; i < alumnos.size();i++){
                if(alumnos.get(i).getNombre().equals(busca)){
                    alumnos.get(i).setNotas(LIB.lInt("Introducir nota: "));
                    break;
                }
                if(i == alumnos.size()-1){
                    System.out.println("Alumno no encontrado");
                }
            }
        }
    }
    public static void modNota(ArrayList<Alumnos> alumnos){
        if(alumnos.isEmpty()){
            System.out.println("Lista vacia, añada alumno");
        }else{
            String busca1 = LIB.lString("Nombre del alumno a introducir nota: ");
            for(int i = 0; i < alumnos.size();i++){
                if(alumnos.get(i).getNombre().equals(busca1)){
                    int mod = LIB.lInt("Introduzca nota a modificar: ");
                    for(int j = 0; j < alumnos.get(i).getListaNotas().size();j++){
                        if(alumnos.get(i).getListaNotas().get(j) == mod){
                            int change = LIB.lInt("Introduzca la nueva nota: ");
                            alumnos.get(i).getListaNotas().set(j, change);
                            break;
                        }else if(j == alumnos.get(i).getListaNotas().size()-1){
                            System.out.println("Nota no encontrada");
                        }
                    }
                }
            }
        }
    }
    
    public static void eliNotaIndex(ArrayList<Alumnos> alumnos){
        if(alumnos.isEmpty()){
            System.out.println("Lista vacia, añada alumno");
        }else{
            String nombreNota = LIB.lString("Introducir alumno a modificar");
            for(int i = 0; i < alumnos.size();i++){
                if(alumnos.get(i).getNombre().contains(nombreNota)){
                    int pos = LIB.lInt("Introducir posicion: ");
                    while(pos >= alumnos.get(i).getListaNotas().size() || pos < 0){
                        System.out.println("Posicion fuera de rango");
                        pos = LIB.lInt("Introducir posicion: ");
                    }
                    alumnos.get(i).getListaNotas().remove(i);
                    return;
                }
            }
            System.out.println("Alumno no encontrado");
        }
    }

    public static void cloneFirst(ArrayList<Alumnos> alumnos){
        Alumnos p = alumnos.get(0).clone();
        String nombre = LIB.lString("Introducir nombre: ");
        for(int i = 0; i < alumnos.size();i++){
            if(alumnos.get(i).getNombre().contains(nombre)){
                System.out.println("Nombre ya usado, elija otro");
                nombre = LIB.lString("Introducir nombre: ");
                i = 0;
            }
        }
        p.setNombre(nombre);
        alumnos.add(p);
    }

    public static void mostrarTodo(ArrayList<Alumnos> alumnos){
        String v = "";
        for (Alumnos a2 : alumnos) {
           v += a2.toString();
        }
        System.out.println(v);
    }
    public static void mostrarMedia(ArrayList<Alumnos> alumnos){
        String p = "-------------------------------------------\n";
        for(int i = 0; i < alumnos.size(); i++){
            p += "Nombre: " + alumnos.get(i).getNombre() + "\n";
            p += "Media: " + alumnos.get(i).media() + "\n";
            p += "Nº Suspensos: " + alumnos.get(i).suspensos() + "\n";
            p += "Nº Sobresalientes: " + alumnos.get(i).sobresalientes() + "\n";
            p += "-------------------------------------------\n";
        }
        System.out.println(p);
    }
    public static void mostrarNotaAlumno(ArrayList<Alumnos> alumnos){
        String nombre = LIB.lString("Introducir nombre: ");
        int i = 0;
        String s = "";
        while(i < alumnos.size()){
            if(alumnos.get(i).getNombre().equals(nombre)){
                s = "Nombre: " + alumnos.get(i).getNombre() + "\n";
                if(alumnos.get(i).getListaNotas().isEmpty()){
                    s += "No tiene ninguna nota";
                }else{
                    s += alumnos.get(i).toString();
                }
            }
            i++;
        }
        System.out.println(s);
    }
}
