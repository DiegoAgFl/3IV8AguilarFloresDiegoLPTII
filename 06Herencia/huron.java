public class huron extends Animal{
    public huron() {

    }
    public huron(String nombre, String raza, String tipo_Alimento, int edad) {
        super(nombre, raza, tipo_Alimento, edad);
    }
    public void mostrarHuron() {
        System.out.println("El nombre del huron es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_Alimento() + "\n" + "Su edad es: " + getEdad());
    }
}

