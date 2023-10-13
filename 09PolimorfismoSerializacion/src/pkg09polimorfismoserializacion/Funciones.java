/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09polimorfismoserializacion;

/**
 *
 * @author alumno
 */
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Funciones {

    // poder guardar diferentes barbies a crear
    ArrayList<Barbie> listadebarbies = new ArrayList<Barbie>();

    String rep = "si";
    String nombre = "";
    String animal = "";
    String lentes = "";
    String fullStack = "";
    int edad, cedulaprofesional;

    // se lo que quieras ser

    // aplicar polimorfismo

    Barbie programadora = new Programadora();
    Barbie veterinaria = new Veterinaria();

    void menu() {
        while (true) {
            while (rep.equalsIgnoreCase("si")) {
                try {
                    String var = JOptionPane.showInputDialog("Ingresa la opcion deseada" + "\n"
                            + "1.- Registrar nueva barbie programadora" + "\n" + "2.-Registrar veterinaria" + "\n"
                            + "3.-Consultar las barbies. \n" + "4.- Buscar barbie \n" + "Se lo que tu quieras ser \n");
                    if (var == null) {
                        System.exit(0);
                    }
                    int opcion = Integer.parseInt(var);
                    switch (opcion) {
                        case 1:
                            // metodo de pedir datos
                            pedirdatosProgramadora();
                            // asignar datos
                            programadora = new Programadora(nombre, edad, fullStack, lentes);
                            // guardar
                            guardarProgramadora();
                            break;

                        case 2:
                            // metodo de pedir datos
                            pedirdatosVeterinaria();
                            // asignar datos
                            programadora = new Veterinaria(nombre, edad, animal, cedulaprofesional);
                            // guardar
                            guardarVeterinaria();
                            break;
                        case 3:
                            leerBarbie();
                            break;

                        case 4:
                            // tarea junto con el crud
                            break;
                        default:
                            System.out.println("Opcion no valida");

                    }
                    rep = JOptionPane.showInputDialog("Desea repetir?");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            }
        }

    }

    private void pedirdatosProgramadora() {
        // primero se obtienen todos los datos de la programadora
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la barbie programadora");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la programadora"));
        fullStack = JOptionPane.showInputDialog("Ingresa que lenguajes domina la barbie programadora");
        lentes = JOptionPane.showInputDialog("Ingresa el tipo de lentes de la barbie programadora");
    }

    private void guardarProgramadora() throws IOException {
        // para guardar se ocupa el arraylist
        listadebarbies.add(programadora);
        guardar();

    }

    private void pedirdatosVeterinaria() {
        cedulaprofesional = Integer
                .parseInt(JOptionPane.showInputDialog("Ingresa que lenguajes domina la barbie programadora"));
        animal = JOptionPane.showInputDialog("Ingresa el tipo de mascota que cuida la barbie veterinaria");
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la barbie programadora");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la programadora"));

    }

    private void guardarVeterinaria() throws IOException {
        listadebarbies.add(veterinaria);
        guardar();
    }

    // los archivos serializables

    private void leerBarbie() throws FileNotFoundException, IOException, ClassNotFoundException {
        /*
         * aqui es donde se va a aplicar la serializacion de archivos para guardar la
         * lista de barbies y re3cuperarla, para eso se ocupan el flujo de escritura y
         * lectura de archivos
         */
        FileInputStream archivo = new FileInputStream("archivo.dat");

        ObjectInputStream entrada = new ObjectInputStream(archivo);
        /* transformar los bytes del archivo en objetos del array */

        listadebarbies = (ArrayList) entrada.readObject();

        // recorrer el array
        for (int i = 0; i < listadebarbies.size(); i++) {
            // como se va a recorrer la lista se va mostrando :v
            Programadora fullstack = (Programadora) listadebarbies.get(i);

            // imprimir datos
            JOptionPane.showMessageDialog(null,
                    "\n" + "Nombre de la programadora: " + fullstack.getNombre() + "\n" + "Edad de la programadora: "
                            + fullstack.getEdad() + "\n" + "Lenguajes que domina: " + fullstack.getFullStack() + "\n"
                            + "Tipo de lentes de la programadora: " + fullstack.getLentes() + "\n"
                            + "El tipo de barbie es: " + fullstack.tipoBarbie());
        }
        /*
         * for (int i = 0; i < listadebarbies.size(); i++) {
         * // como se va a recorrer la lista se va mostrando :v
         * Veterinaria vet = (Veterinaria) listadebarbies.get(i);
         * 
         * // imprimir datos
         * JOptionPane.showMessageDialog(null,
         * "\n" + "Nombre de la veterinaria: " + vet.getNombre() + "\n" +
         * "Edad de la veterinaria: "
         * + vet.getEdad() + "\n" + "Cedula de la barbie: " +vet.getCedulaprofesional()
         * + "\n"
         * + "Animalito de la veterinaria: " + vet.getAnimalito() + "\n"
         * + "El tipo de barbie es: " + vet.tipoBarbie());
         * }
         */
    }

    private void guardar() throws FileNotFoundException, IOException {
        // escribir una salida
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
        // escribir datos del array
        try ( // definir buffer
                ObjectOutputStream salida = new ObjectOutputStream(archivo)) {
            // escribir datos del array
            salida.writeObject(listadebarbies);
        }

    }

}
