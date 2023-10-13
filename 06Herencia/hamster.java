public class hamster extends Animal {
    public hamster() {

    }

    public hamster(String nombre, String raza, String tipo_Alimento, int edad) {
        super(nombre, raza, tipo_Alimento, edad);
    }
    public void mostrarHamster() {
        System.out.println("El nombre del hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_Alimento() + "\n" + "Su edad es: " + getEdad());
    }
}
