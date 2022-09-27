import javax.print.DocFlavor.STRING;

//esto es un comentario 
/*
 * Todo programa en java debe tener el nombre de la clase tal cual como en archivo
 */
public class EntradaDeTexto {
    // los limites de la clase
    // toda clase debe tener un metodo principal
    /*
     * vamos a reealizar un programa por el cual podamos introducir texto a nuestra
     * conveniencia
     */
    public static void main(String[] args) {
        // tipo de dato
        String nombre;
        int edad;
        // el ; es el fin de linea

        // instancia
        System.out.println("Por favor introduce tu nombre ^_^");
        // vamos a obtener el nombre del usuario
        nombre = System.console().readLine();

        System.out.println("Por favor introduce tu edad: ");

        edad = Integer.parseInt(System.console().readLine());

        System.out.println("Hola " + nombre + " bienvenido al programa, tienes " + edad + " years ");
    }
}
