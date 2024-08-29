/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geneicidad2.pkg0;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class Main {
    public static void main(String[] args) {
        // Crear una persona con todos sus datos
         Persona persona = new Persona("Jose", 24, "EPS Salud", LocalDate.of(2000, 5, 15));
        
        // Imprimir los datos de la persona
        System.out.println(persona);

        // Demostrar el uso de un Map para almacenar múltiples personas
        Map<String, Persona> personas = new LinkedHashMap<>();
        personas.put("Persona1", persona);
        personas.put("Persona2", new Persona("Liliana", 20, "EPS compensar", LocalDate.of(2003, 9, 18)));

        // Imprimir todas las personas
        for (Map.Entry<String, Persona> entry : personas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

