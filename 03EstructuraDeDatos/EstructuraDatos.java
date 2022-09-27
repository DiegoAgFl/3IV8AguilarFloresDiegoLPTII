/*
 * VAMOS A REALIZAR UN PROGRAMA QUE SE ENCARGUE DE REALIZAR LAS SIGUIENTES
 * OPERACIONES
 * 
 * 1 DESCUENTO POR EDAD
 * 2 CONVERTIR DECIMALES A BINARIOS
 * 3 CONVERTIR TEMPERATURAS: CELCIUS, KELVINE Y RANKINE
 * 4 NUMERO DE POSITIVOS Y NEGATIVOS SEGUN UNA LISTA
 * 5 TIENDITA
 * 6 area y perimetro de figuras
 * 7 TABLA 
 * 8 FACTORIAL
 * 9 DIBUJITO
 * 10 FIGURAS HUECAS DE CODIGO
 * 11 PATRONES
 * 12 DIAMANTE
 * 13 CALCULADORA
 * 14 SALIR */

import java.util.Scanner;

class EstructuraDatos {
    // Programa 1
    public static void main(String[] args) {
        // declaro objeto
        Scanner entrada = new Scanner(System.in);

        // VARIABLES
        int edad, opcion, socio, numbinario, total, numerototal, n, a, b;
        int positivos = 0;
        int negativos = 0;
        double precios, bono;
        char letras, operacion;
        float precio = 0;
        float resultado = 0;
        int cantidad = 0;
        String binario = "";
        // bucle para que se repita
        do {
            // vamos a hacer el menu
            System.out.println("Bienvenido a la tareita que tenian que hacer n_n/");
            System.out.println("Por favor elija la opcion deseada:");
            System.out.println("1.- Descuento por edad");
            System.out.println("2.- Convertir numero decimal a binario");
            System.out.println("3.- Conversores de tempertatura");
            System.out.println("4.- Numeros positivos y negativos ");
            System.out.println("5.- Tiendita");
            System.out.println("6.- Area y perimetro");
            System.out.println("7.- Tabla");
            System.out.println("8.- Factorial");
            System.out.println("9.- Dibujitos");
            System.out.println("10.- Figura hueca");
            System.out.println("11.- Patrones");
            System.out.println("12.- Diamante");
            System.out.println("13.- Calculadora");
            System.out.println("14.- Salir");

            opcion = entrada.nextInt();

            // switch
            switch (opcion) {
                case 1: // ahi lo hacen
                    break;
                case 2:
                    System.out.println("Ingrese el numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();
                    binario = "";

                    /* Tengo que comprobar que sea entero positivo */
                    if (numbinario > 0) {
                        // aplicar algoritmo
                        while (numbinario > 0) {
                            if (numbinario % 2 == 0) {
                                binario = "0" + binario;
                            } else {
                                binario = "1" + binario;
                            }
                            numbinario = (int) numbinario / 2;
                        }
                    } else if (numbinario == 0) {
                        binario = "0";
                    } else {
                        binario = "\n No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero binario es: " + binario);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    // vamos a ver un FOR
                    for (n = 1; n <= 10; n++) {
                        System.out.println(n + " " + (n * 10) + " " + (n * 1000) + " " + (n * 10000));
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Cuadrado magico y hueco como tu alma");
                    System.out.println("Inserta el numero de unidades entre 1 y 20");
                    n = entrada.nextInt();
                    // linea superior
                    if (n >= 1 && n <= 20) {
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                        // cuadrado interno
                        for (int j = 0; j < n - 2; j++) {
                            // fila
                            System.out.print(" * ");

                            for (int k = 0; k < n - 2; k++) {
                                // columna
                                System.out.print("   ");
                            }
                            System.out.println(" * ");
                        }
                        // linea inferior
                        for (int i = 0; i < n; i++) {
                            System.out.print(" * ");
                        }
                    } else {
                        System.out.println("ERROR SOLO ENTRE 1 Y 20 BRO");
                    }
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    // calcu
                    System.out.println("Bienvenido a la calculadora");
                    System.out.println("Ingresa el primer numero");
                    a = entrada.nextInt();
                    System.out.println("Ingresa el segundo numero");
                    b = entrada.nextInt();
                    System.out.println("Ingresa el tipo de operacioan (+ - /)");
                    char ope = entrada.next().charAt(0);
                    switch (ope) {
                        case '+':
                            resultado = a + b;
                            System.out.println("La suma es: " + resultado);
                            break;
                        case '-':
                            resultado = a - b;
                            System.out.println("La resta es: " + resultado);
                            break;
                        case '*':
                            resultado = a * b;
                            System.out.println("La multiplicacion es: " + resultado);
                            break;
                        case '/':
                            if (b != 0) {
                                resultado = a / b;
                                System.out.println("La division es: " + resultado);
                            } else {
                                System.out.println("ERROR");
                            }
                            break;
                        default:
                            System.out.println("Operacion invalida");
                    }
                default:
                    System.out.println("Operacion no admitida 7_7");

                case 14:
                    break;

            }
            // Debo preguntar si desea repetir

            System.out.println("¿Desea repetir el programa? Si lo desea escriba s");

            letras = entrada.next().charAt(0);
        } while (letras == 's' || letras == 'S');

    }
}