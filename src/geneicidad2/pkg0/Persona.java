/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geneicidad2.pkg0;

import java.time.LocalDate;

/**
 *
 * @author 57316
 */
 class Persona {
    private Pair<String, Integer> datosPersonales;
    private Pair<String, LocalDate> datosSalud;

    public Persona(String nombre, int edad, String eps, LocalDate fechaNacimiento) {
        this.datosPersonales = new Pair<>(nombre, edad);
        this.datosSalud = new Pair<>(eps, fechaNacimiento);
    }

    public String getNombre() {
        return datosPersonales.getFirst();
    }

  public int getEdad() {
        return datosPersonales.getSecond();
    }

    public String getEps() {
        return datosSalud.getFirst();
    }

    public LocalDate getFechaNacimiento() {
        return datosSalud.getSecond();
    }

    @Override
    public String toString() {
        return "Persona1" +
               "nombre=" + getNombre() +
               ", edad=" + getEdad() +
               ", EPS=" + getEps() +
               ", fechaNacimiento=" + getFechaNacimiento() +
               '}';
    }
 }
