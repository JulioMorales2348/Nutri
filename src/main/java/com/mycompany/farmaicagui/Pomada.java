
package com.mycompany.farmaicagui;

public class Pomada extends Medicamento{
    float gramos;

    public Pomada() {
        gramos = 0;
    }

    public Pomada(float gramos, String nombre, String fabrica, int codigo, float precio) {
        super(nombre, fabrica, codigo, precio);
        this.gramos = gramos;
    }
    
    public float getGramos() {
        return gramos;
    }

    public void setGramos(float gramos) {
        this.gramos = gramos;
    }
}
