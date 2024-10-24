
package com.mycompany.farmaicagui;


public class Paciente extends Medicamento {
    
     private int tabletas;
    private int mlg;

    public Paciente() {
        tabletas = 0;
        mlg = 0;
    }

    public Paciente(String nombre,String fabrica,int codigo,float precio,int tabletas, int mlg) {
        super(nombre, fabrica, codigo, precio);
        this.tabletas = tabletas;
        this.mlg = mlg;
    }
    
    public int getTabletas() {
        return tabletas;
    }

    public void setTabletas(int tabletas) {
        this.tabletas = tabletas;
    }

    public int getMlg() {
        return mlg;
    }

    public void setMlg(int mlg) {
        this.mlg = mlg;
    }
    
}
