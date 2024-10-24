
package com.mycompany.farmaicagui;
import java.util.ArrayList;

public class FarmaicaGUI {

    
    public static ArrayList<Paciente> paciente;
    public static ArrayList<Pomada> pomadas;
    public static ArrayList<Jarabe> jarabes;
    
    public static void main(String[] args) {
        paciente = new ArrayList<>();
        pomadas = new ArrayList<>();
        jarabes = new ArrayList<>();
        Login log = new Login();
        log.setLocationRelativeTo(null);
        log.setVisible(true);
    }
}