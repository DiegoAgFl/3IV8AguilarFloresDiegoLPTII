
public class Animal {
    /*
     * Es poder restringir el acceso a los tipos de datos.
     * Vamos a poder agrupar en una clase el acceso a los diferentes
     * metodos u objetos de clase para que no puedan ser modificados
     */

    private String nombre, raza, tipo_Alimento;
    private int edad;
    // Definir constructor
    /*
     * Sirve para declarar la existencia de unaclase, inicializar variablesd y poder
     * instanciar objetos
     */

    public Animal() {
        // vacio
    }

    // sobrecarga de metodo
    public Animal(String nombre, String raza, String tipo_Alimento, int edad) {
        /* Para definir parametros de accesos a las variables */
        this.nombre = nombre;
        this.raza = raza;
        this.tipo_Alimento = tipo_Alimento;
        this.edad = edad;
    }

    // Flata poder enviar y obtener valores correspondientes de las variables
    /*
     * Getter y Setter
     * get -> obtener -> recibir
     * set -> asignar -> enviar
     */
    public String getNombre() {
        return nombre;
    }

    // Set
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    // Set
    public void SetRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo_Alimento() {
        return tipo_Alimento;
    }

    // Set
    public void SetTipo_Alimento(String tipo_Alimento) {
        this.tipo_Alimento = tipo_Alimento;
    }

    // Set
    public void SetEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
}
