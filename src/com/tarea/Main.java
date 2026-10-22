package com.tarea;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        // --- REQUISITO: Variables tipo ArrayList, LinkedList, HashSet y HashMap ---
        ArrayList<Vehiculo> listaArray = new ArrayList<>();
        LinkedList<Vehiculo> listaLinked = new LinkedList<>();
        HashSet<Vehiculo> conjuntoHash = new HashSet<>();
        HashMap<Integer, Vehiculo> mapaHash = new HashMap<>();

        // --- REQUISITO: Al menos 7 tipos de datos distintos intercalados (Primitivo y Objeto Wrapper) ---
        int edad_primitiva = 5;                        // 1. int (Primitivo)
        Integer edad_objeto = 5;                       // 2. Integer (No primitivo)
        double km_primitivo = 1500.50;                 // 3. double (Primitivo)
        Double km_objeto = 1500.50;                     // 4. Double (No primitivo)
        boolean esNuevo_primitivo = true;              // 5. boolean (Primitivo)
        Boolean esNuevo_objeto = Boolean.TRUE;         // 6. Boolean (No primitivo)
        char categoria_primitivo = 'A';                // 7. char (Primitivo)
        String descripcion_objeto = "Activo";          // Extra: String (No primitivo)

        // --- REQUISITO: Polimorfismo (Objetos usando clase padre y constructor de hijas) ---
        Vehiculo miAuto = new Auto("Toyota", 22000.0, 2023);
        Vehiculo miMoto = new Moto("Yamaha", 7500.0, 2024);
        Vehiculo miCamion = new Camion("Scania", 110000.0, 2021);

        // Guardamos los objetos en la lista para recorrerlos
        listaArray.add(miAuto);
        listaArray.add(miMoto);
        listaArray.add(miCamion);

        // --- REQUISITO: Ciclo For que ejecuta el método en todos los objetos ---
        System.out.println("=== Ejecutando métodos polimórficos desde el ciclo for ===");
        for (Vehiculo v : listaArray) {
            v.mostrarDetalles(); // Cada objeto responde según su propia clase hija
        }
    }
}
