/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 *
 * @author alumno
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    public double totalfin;

    public Persona(){}
    
    public Persona(int id, String nombre, int edad, double totalfin) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.totalfin = totalfin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    
    
    
}
