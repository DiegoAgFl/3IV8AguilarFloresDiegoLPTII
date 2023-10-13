/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09polimorfismoserializacion;

import javax.swing.ProgressMonitor;

/**
 *
 * @author alumno
 */
public class Programadora extends Barbie {

    private String fullStack;
    private String lentes;

    public Programadora() {

    }

    public Programadora(String nombre, String fullStack, int edad, String lentes) {
        super(nombre, edad);
        this.fullStack = fullStack;
        this.lentes = lentes;
    }

    public Programadora(String fullStack, String lentes, String nombre, int edad) {
        super(nombre, edad);
        this.fullStack = fullStack;
        this.lentes = lentes;
    }

    Programadora(String nombre, int edad, String fullStack, String gafas) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public String getFullStack() {
        return fullStack;
    }

    public void setFullStack(String fullStack) {
        this.fullStack = fullStack;
    }

    public String getLentes() {
        return lentes;
    }

    public void setLentes(String lentes) {
        this.lentes = lentes;
    }

    @Override
    String tipoBarbie() {
        return ("Programadora");
    }
}
