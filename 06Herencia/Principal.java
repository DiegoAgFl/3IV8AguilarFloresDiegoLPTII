import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
    String name,raz,comida,ladrido;
    int ed, vidas, op, numVidas;
    Scanner entrada;
    entrada = new Scanner(System.in);

    System.out.println("Bienvenido, que mascota desea ingresar?");
    System.out.println("1.- Perro");
    System.out.println("2.- Gato");
    System.out.println("3.- Conejo");
    System.out.println("4.- Hamster");
    System.out.println("5.- Huron");
    op = entrada.nextInt();

    switch (op) {
        case 1:
        System.out.println("Ingrese el nombre de su perro");
        name = entrada.next();
        System.out.println("Ingrese su raza");
        raz = entrada.nextLine();
        System.out.println("Ingrese su tipo de alimento");
        comida = entrada.nextLine();
        System.out.println("Ingrese su edad");
        ed = entrada.nextInt();
        System.out.println("Ingrese su ladrido");
        ladrido = entrada.nextLine();
        Perro dog = new Perro(""+name, ""+raz, ""+comida, 0+ed, ""+ladrido);
        dog.mostrarPerro();

            break;
        case 2:
        System.out.println("Ingrese el nombre de su gato");
        name = entrada.nextLine();
        System.out.println("Ingrese su raza");
        raz = entrada.nextLine();
        System.out.println("Ingrese su tipo de alimento");
        comida = entrada.nextLine();
        System.out.println("Ingrese su edad");
        ed = entrada.nextInt();
        System.out.println("Ingrese las vidas del gato");
        numVidas = entrada.nextInt();
        Gato cat = new Gato(""+name, ""+raz, ""+comida, 0+ed, 0+numVidas);
        cat.mostrarGato();

        break;
        case 3:
        System.out.println("Ingrese el nombre de su conejo");
        name = entrada.nextLine();
        System.out.println("Ingrese su raza");
        raz = entrada.nextLine();
        System.out.println("Ingrese su tipo de alimento");
        comida = entrada.nextLine();
        System.out.println("Ingrese su edad");
        ed = entrada.nextInt();
        Conejo rabbit = new Conejo();
        rabbit.mostrarConejo();
        break;
        case 4:
        System.out.println("Ingrese el nombre de su hamster");
        name = entrada.nextLine();
        System.out.println("Ingrese su raza");
        raz = entrada.nextLine();
        System.out.println("Ingrese su tipo de alimento");
        comida = entrada.nextLine();
        System.out.println("Ingrese su edad");
        ed = entrada.nextInt();
        hamster ham = new hamster(""+name, ""+raz, ""+comida, 0+ed);
        ham.mostrarHamster();

        break;
        case 5:
        System.out.println("Ingrese el nombre de su huron");
        name = entrada.nextLine();
        System.out.println("Ingrese su raza");
        raz = entrada.nextLine();
        System.out.println("Ingrese su tipo de alimento");
        comida = entrada.nextLine();
        System.out.println("Ingrese su edad");
        ed = entrada.nextInt();
        huron h = new huron(""+name, ""+raz, ""+comida, 0+ed);
        h.mostrarHuron();
        break;
        default:
        System.out.println("Bye");
            break;
    }
    }
}
