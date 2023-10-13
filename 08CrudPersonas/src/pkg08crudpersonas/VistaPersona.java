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
import java.util.*;
public class VistaPersona {
    
    Scanner entrada = new Scanner(System.in);
    int option;
    ControladorPersona crud = new ControladorPersona();
    
    public void Principal(){
        do{
            System.out.println("Bienvenido al sistema CRUD de dormiditos");
            System.out.println("Elija una opcion: " + "\n"+ "");
            
            option = Integer.parseInt(entrada.nextLine());
            
            switch(option){
                case 1:
                    
                    ArrayList<Persona> listadormiditos = crud.mostrarPersonas();
            
                    
                    for(Persona p : listadormiditos){
                        System.out.println("El id del dormidito es " + p.getId() + "\n" + "El nombre del dormidito es " + p.getNombre() + "\n" + "La edad del dormidito es " + p.getEdad()+ "\n");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese el id del dormidito: ");
                    int iddormidito = Integer.parseInt(entrada.nextLine());
                    System.out.println("Ingrese el nombre del dormidito");
                    String nombredormidito = entrada.nextLine();
                    System.out.println("Ingrese edad del dormidito");
                    int edaddormidito = Integer.parseInt(entrada.nextLine());
                    
                    //nueva persona
                    Persona nuevodormidito = new Persona(iddormidito, nombredormidito, edaddormidito);
                    
                    crud.registrarPersona(nuevodormidito);
            
                    break;
                case 3:
                    //edit
                System.out.println("Ingrese el id del dormidito a buscar");
                iddormidito = entrada.nextInt();
                
                Persona personaSeleccionada = crud.buscarPersona(iddormidito);
                
                System.out.println("La info del dormidito es " + "\n ID:" + personaSeleccionada.getId()+ "\n Nombre:" + personaSeleccionada.getNombre() + "\n Edad:" + personaSeleccionada.getEdad());
                
                System.out.println("Ingrese el nuevo nombre del dormidito");
                String nuevonombre = entrada.nextLine();
                System.out.println("Ingrese nueva edad del dormidito");
                int nuevaEdad = entrada.nextInt();
                
                personaSeleccionada.setNombre(nuevonombre);
                personaSeleccionada.setEdad(nuevaEdad);
                
                crud.actualizarPersona(personaSeleccionada);
                break;
                case 4:
                    //despertar borrar
                System.out.println("Ingrese el id del dormidito a despertar");
                int despertar = entrada.nextInt();
                
                Persona despertado = crud.buscarPersona(despertar);
                
                crud.eliminarPersona(despertado);
                
                System.out.println("Ya se despertó");
                    break;
                default:
                    System.out.println("Ingrese algo valido");
            }
        }while(option != 5);
    }
}
