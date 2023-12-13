
package arrayvslinked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayvsLinked {

    public static void main(String[] args) {
        
        // ArrayList
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Luisina", 30));
        listaArray.add(new Persona(2, "Gabriel", 30));
        listaArray.add(new Persona(3, "Ibra", 9));
        listaArray.add(new Persona(4, "TodoCode", 2));
        
        // LinkedList
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Luisina", 30));
        listaLinked.add(new Persona(2, "Gabriel", 30));
        listaLinked.add(new Persona(3, "Ibra", 9));
        listaLinked.add(new Persona(4, "TodoCode", 2));
        
        //Remove en ArrayList
        listaArray.remove(1);
        
        //Remove en LinkedList
        String nombreBorrar = "Gabriel";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break; //corto que deje de recorrer
            }
        }
        
        System.out.println("---------------- LUEGO DE ELIMINAR ----------------");
        // recorrido por foreach
        System.out.println("---------------- ARRAYLIST ----------------");
            for (Persona persona : listaArray) {
                System.out.println("prueba: " + persona.getNombre());
            }
        
        System.out.println("---------------- LINKEDLIST ----------------");
            for (Persona persona : listaLinked) {
                System.out.println("prueba: " + persona.getNombre());
            }
        
        //tamaño lista
        System.out.println("---------------- Qué tamaño tienen las listas? ----------------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());
        
        //obtener primer objeto
        System.out.println("---------------- PRIMER Y ÚLTIMO OBJETO (solo para LINKED LIST) ----------------");
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Último de LinkedList: " + listaLinked.getLast().toString());
        
        //borrar toda la lista
        System.out.println("---------------- Borrando Listas ----------------");
        listaArray.clear();
        listaLinked.clear();
        
        //comprobar si está vacía
        System.out.println("---------------- Está vacía alguna lista? ----------------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
        
    }
    
}
