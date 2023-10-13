public class Gato extends Animal {
    private int numVidas;

    public Gato() {

    }

    public Gato(String nombre, String raza, String tipo_Alimento, int edad, int numVidas) {
        /*
         * para poder obtener o acceder a los atributos heredados debemos hacer uso de
         * la palabra reservada super
         */

        super(nombre, raza, tipo_Alimento, edad);
        this.numVidas = numVidas;
    }

    public int getNumVidas(int numVidas) {
        this.numVidas = numVidas;
        return numVidas;
    }

    public void mostrarGato() {
        System.out.println("El nombre del michi es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"
                + "Se alimenta de: " + getTipo_Alimento() + "\n" + "Su edad es: " + getEdad() + "\n" + "Sus vidas son: "
                + numVidas + "\n");
    }
    

}
