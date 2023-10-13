public class Conejo extends Animal{

    public Conejo(){

    }
    public Conejo(String nombre, int edad, String raza, String tipo_Alimento){

        super(nombre, raza, tipo_Alimento, edad);
    }
    public void mostrarConejo() {
        System.out.println("El nombre del conejito es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n"+ "Se alimenta de: " + getTipo_Alimento() + "\n" + "Su edad es: " + getEdad());
    }
    
}
