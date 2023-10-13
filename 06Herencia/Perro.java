public class Perro extends Animal {
    // palabra reservada extends para heredar
    private String ladrido;

    public Perro() {

    }

    public Perro(String nombre, String raza, String tipo_Alimento, int edad, String ladrido) {
        /*
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */

        super(nombre, raza, tipo_Alimento, edad);
        this.ladrido = ladrido;
    }

    public String getLadrido(String ladrido) {
        this.ladrido = ladrido;
        return ladrido;
    }

    public void mostrarPerro() {
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de:" + getTipo_Alimento() + "\n" + "Su edad es: " + getEdad() + "\n" + "Su ladrido es: "
                + ladrido + "\n");
    }
}
