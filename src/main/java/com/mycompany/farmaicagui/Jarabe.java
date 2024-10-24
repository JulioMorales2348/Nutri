
package com.mycompany.farmaicagui;

public class Jarabe extends Medicamento {
    
    
    private int mll;
    private boolean vaso;

    public Jarabe() {
        mll = 0;
        vaso = true;
    }

    public Jarabe(int mll, boolean vaso, String nombre, String fabrica, int codigo, float precio) {
        super(nombre, fabrica, codigo, precio);
        this.mll = mll;
        this.vaso = vaso;
    }

    public int getMll() {
        return mll;
    }

    public void setMll(int mll) {
        this.mll = mll;
    }

    public boolean isVaso() {
        return vaso;
    }

    public void setVaso(boolean vaso) {
        this.vaso = vaso;
    }
    
}
