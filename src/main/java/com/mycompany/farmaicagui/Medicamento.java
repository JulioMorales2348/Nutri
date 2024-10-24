
package com.mycompany.farmaicagui;


public class Medicamento {
    
    private String nombre;
    private String fabrica;
    private int codigo;
    private float precio;

    public Medicamento() {
        nombre = " ";
        fabrica = " ";
        codigo = 0;
        precio = 0;
    }

    public Medicamento(String nombre, String fabrica, int codigo, float precio) {
        this.nombre = nombre;
        this.fabrica = fabrica;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
