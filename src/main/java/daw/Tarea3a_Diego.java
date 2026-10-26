/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Tarea3a_Diego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solicitar si la hora es valida
        int opcion = 0;
        int hora = 1;
        int min = 0;
        int seg = 0;
        String texto = """
                Menu:
                ¿Que opcion desea?
                opcion 1
                opcion 2
                opcion 3
                opcion 4
                opcion 5
                salir 6
                """;
        do {
            System.out.println(texto);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    do {
                        System.out.println("Introduzca la hora que desee");

                        try {
                            hora = sc.nextInt();
                        } catch (Exception e) {
                        }

                    } while (hora < 0 || hora > 24);
                    do {
                        System.out.println("Introduzca los minutos que desee");

                        try {
                            min = sc.nextInt();
                        } catch (Exception e) {
                        }

                    } while (hora < 0 || hora > 60);
                    do {
                        System.out.println("Introduzca los segundos que desee");

                        try {
                            seg = sc.nextInt();
                        } catch (Exception e) {
                        }

                    } while (hora < 0 || hora > 60);
                    break;
                case 2:
                    // Solicitar un numero entre 1 y 7 y el programa muestra el dia
                    sc.nextLine();
                    int semana = 0;
                    System.out.println("Solicita un numero de la semana: ");
                    do {
                        try {
                            semana = sc.nextInt();
                        } catch (Exception e) {
                        }
                    } while (semana < 1 || semana > 7);
                    System.out.println("El dia escogido de la semana es: ");

                    switch (semana) {
                        case 1:
                            System.out.println("Lunes");
                            break;
                        case 2:
                            System.out.println("Martes");
                            break;
                        case 3:
                            System.out.println("Miercoles");
                            break;
                        case 4:
                            System.out.println("Jueves");
                            break;
                        case 5:
                            System.out.println("Viernes");
                            break;
                        case 6:
                            System.out.println("Sabado");
                            break;
                        case 7:
                            System.out.println("Domingo");
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 3:
                    // Pedir un numero y comprobar si es primo
                    sc.nextLine();

                    System.out.println("Introduzca un numero");
                    int numero = sc.nextInt();
                    if (numero % 1 == 0 && numero % numero == 0) {
                        System.out.println("El numero es primo.");
                    }
                    break;
                case 4:
                    // solicitar un nombre y mostrar cuantos caracteres tiene
                    System.out.println("Que nombre desea?");
                    String nombre = sc.toString();
                    int contador = 0;
                    for (int i = 0; i < nombre.length(); i++) {
                        contador++;
                    }
                    System.out.println("El nombre tiene " + contador + " caracteres");
                    break;
                case 5:
                    // Solicitar una frase y mostrar el numero de vocales consonantes y espacios que
                    // tiene:
                    /*
                     * Hacer con un char y ver los valores de las vocales
                     * con una condicion
                     */
                    System.out.println("Itroduzca la frase: ");
                    // char frase = sc.next();
                    break;
                case 6:
                    System.out.println("Adios");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 6);
    }
}
