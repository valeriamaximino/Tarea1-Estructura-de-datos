package com.tarea;

// Clase padre que demuestra la cualidad de herencia entre las clases hijas y padre
public class Vehiculo {
    // Encapsulamiento: atributos protegidos, privados y públicos
    protected String marca;      // Protegido: accesible por clases hijas
    private double precio;        // Privado: solo accesible mediante getters/setters
    public int anio;              // Público: accesible desde cualquier clase

    // Constructor de la clase padre
    public Vehiculo(String marca, double precio, int anio) {
        this.marca = marca;
        this.precio = precio;
        this.anio = anio;
    }

    // Polimorfismo: método que será reinterpretado por las clases hijas
    public void mostrarDetalles() {
        System.out.println("Vehículo genérico");
    }

    // Encapsulamiento: métodos Getter y Setter para el atributo privado
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
