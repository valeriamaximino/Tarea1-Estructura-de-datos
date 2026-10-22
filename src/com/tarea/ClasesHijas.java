package com.tarea;

// Clase hija 1: Auto que hereda de Vehiculo
class Auto extends Vehiculo {
    public Auto(String marca, double precio, int anio) {
        super(marca, precio, anio); // Llama al constructor padre
    }

    @Override // Polimorfismo: reinterpreta el método del padre
    public void mostrarDetalles() {
        System.out.println("Auto -> Marca: " + marca + ", Año: " + anio + ", Precio: $" + getPrecio());
    }
}

// Clase hija 2: Moto que hereda de Vehiculo
class Moto extends Vehiculo {
    public Moto(String marca, double precio, int anio) {
        super(marca, precio, anio);
    }

    @Override // Polimorfismo: reinterpreta el método del padre
    public void mostrarDetalles() {
        System.out.println("Moto -> Marca: " + marca + ", Año: " + anio + ", Precio: $" + getPrecio());
    }
}

// Clase hija 3: Camion que hereda de Vehiculo
class Camion extends Vehiculo {
    public Camion(String marca, double precio, int anio) {
        super(marca, precio, anio);
    }

    @Override // Polimorfismo: reinterpreta el método del padre
    public void mostrarDetalles() {
        System.out.println("Camión -> Marca: " + marca + ", Año: " + anio + ", Precio: $" + getPrecio());
    }
}
