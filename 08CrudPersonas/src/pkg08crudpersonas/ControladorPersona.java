/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08crudpersonas;

/**
 * register, consult, update, delete
 * registrar nueva persona 
 * consultar a las personas
 * actualizar datos de persona
 * eliminar persona
 * buscar por id una persona
 * @author alumno
 */
import java.util.ArrayList;

public class ControladorPersona {
    
    /*
    Vamos a ocupar un tipo de dato especial que sea capaz de alamacenar diferentes tipos de datos y objetos 
    porque necesitamos una lista de personas que puedan ingresar sesion, registrarse, actualizar datos y/o consultar y
    buscar los diferentes registros.
    
    Para ello tenemos que ocupar ArrayList*/
    
    //lo primero es crear el objeto
    public static ArrayList<Persona> listadepersonas = new ArrayList <Persona>();
    
    //el metodo para mostrar a todas las personas
    public ArrayList<Persona> mostrarPersonas(){
        return listadepersonas;
        
    }
    //metodo de registro
    public void registrarPersona(Persona p){
        listadepersonas.add(p);
    }
    //buscar persona por id
    
    public Persona buscarPersona(int id){
        //objeto para almacenar a la persona
        Persona encontrada = new Persona();
        
        //recorrer lista de personas
        for(Persona p : listadepersonas ){
            if (id == p.getId()){
            //persona encontrada
            encontrada = p;
            }else{
            System.out.println("Persona no encontrada");
            }
        }
        return encontrada;
    }
    //Actualizar datos
    public void actualizarPersona(Persona personaActualiza){
        /*
        Buscar persona
        Obtener datos persona
        Cambiarlos
        Enviarlos
        */
        
        Persona personaaActualizar = buscarPersona(personaActualiza.getId());
        
        listadepersonas.remove(personaaActualizar);
        listadepersonas.add(personaActualiza);
    }
    
    //el mmetodo mas facil
    public void eliminarPersona(Persona personaEliminar){
        listadepersonas.remove(personaEliminar);
    }
}
