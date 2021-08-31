package taramYenny.holamundo;

import java.util.Scanner;

public class CodigoFacilitoPractice {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int option;

        do {
            try {
                option = 0;
                System.out.print("Menu:\n"
                        + "1. Score\n"
                        + "2. Descendant number\n"
                        + "3. Nine table\n"
                        + "4. Asterisk\n"
                        + "5. asteriskTree\n"
                        + "6. fibonacci\n"
                        + "7. primeNumber\n"
                        + "8. twoMultiple\n"
                        + "9. factorialNumber\n"
                        + "0. Exit: ");
                option = obj.nextInt();
                switch (option) {
                    case 1:
                        score();
                        break;
                    case 2:
                        majorNumber();
                        break;
                    case 3:
                        tablaNine();
                        break;
                    case 4:
                        asterisk();
                        break;
                    case 5:
                        asteriskTree();
                        break;
                    case 6:
                        fibonacci();
                        break;
                    case 7:
                        primeNumber();
                        break;
                    case 8:
                        twoMultiple();
                        break;
                    case 9:
                        factorialNumber();
                        break;
                }
            } catch (Exception e) {
                System.out.println("It's no valid, try again\n");
                option = 1;
                obj.nextLine();
            }
        } while (option != 0);
    }

    public static void score() {
//Mostrar en consola el mensaje de "Aprobado" en caso la calificación 
//de un alumno sea mayor igual a 70, en caso contrario mostrar 
//el mensaje "Reprobado".
        Scanner obj = new Scanner(System.in);
        float score;
        int control;
        do {
            try {
                control = 0;
                System.out.print("Please, type your score: ");
                score = obj.nextFloat();

                if (score >= 70) {
                    System.out.println("Approved");
                } else {
                    System.out.println("Reprobate");
                }

            } catch (Exception e) {
                System.out.println("It's no valid, try again ");
                control = 1;
                obj.nextLine();
            }

        } while (control != 0);

    }

    public static void majorNumber() {
//Dado 3 números enteros, mostrar en consola los números de forma descendente, 
//de mayor a menor
        Scanner obj = new Scanner(System.in);
        int number1, number2, number3;
        int control;

        do {
            try {
                control = 0;
                System.out.print("Please, type any number for number one: ");
                number1 = obj.nextInt();
                System.out.print("Please, type any number for number two: ");
                number2 = obj.nextInt();
                System.out.print("Please, type any number for number three: ");
                number3 = obj.nextInt();

                if (number1 > number2 && number1 > number2 && number2 > number3) {
                    System.out.println(number1 + " " + number2 + " " + number3);
                } else {
                    if (number1 > number2 && number1 > number3 && number3 > number2) {
                        System.out.println(number1 + " " + number3 + " " + number2);
                    } else {
                        if (number2 > number1 && number2 > number3 && number1 > number3) {
                            System.out.println(number2 + " " + number1 + " " + number3);
                        } else {
                            if (number2 > number1 && number2 > number3 && number3 > number1) {
                                System.out.println(number2 + " " + number3 + " " + number1);
                            } else {
                                if (number3 > number1 && number3 > number2 && number1 > number3) {
                                    System.out.println(number3 + " " + number1 + " " + number2);
                                } else {
                                    System.out.println(number3 + " " + number2 + " " + number1);
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("It's no valid, try again");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
    }

    public static void tablaNine() {
//Imprimir en consola la tabla de multiplicar del número 9

        int i, resultado = 0;

        for (i = 0; i < 11; i++) {
            resultado = 9 * i;
            System.out.println("9 x " + i + " = " + resultado);
        }
    }

    public static void asterisk() {
//Replicar la siguiente salida en consola
//*
//**
//***
//****
//*****
//******
        Scanner obj = new Scanner(System.in);

        int i, lines;
        String asterisk = "";
        int control;
        do {
            try {
                control = 0;
                System.out.print("Type how many lines you want: ");
                lines = obj.nextInt();

                for (i = 0; i < lines; i++) {
                    asterisk = asterisk + "*";
                    System.out.println(asterisk + "\n");
                }

            } catch (Exception e) {
                System.out.println("It's no valid, try again with a integer number");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);

    }

    public static void asteriskTree() {
//Replicar la siguiente salida en consola
//     *
//    ***
//   *****
//  *******
// *********
        Scanner obj = new Scanner(System.in);
        int lines;
        String asterisk = "";
        int control;

        do {
            try {
                control = 0;
                System.out.print("Type how many lines you want to see in your tree: ");
                lines = obj.nextInt();

                for (int i = 0; i < lines; i++) {
                    for (int j = 0; j < lines - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (2 * i + 1); k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

            } catch (Exception e) {
                System.out.println("It's no valid, try again with a integer number");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
    }

    public static void fibonacci() {
//Imprimir en consola los primero diez números de la serie Fibonacci
        Scanner obj = new Scanner(System.in);
        int limit, control;
        int amount = 0, number1 = 0, number2 = 1;

        do {
            try {
                control = 0;
                System.out.print("Please, type the limit of the fibonacci serie: ");
                limit = obj.nextInt();

                while (number1 + number2 <= limit) {
                    amount = number1;
                    number1 = number2;
                    number2 = amount + number1;
                    System.out.println(number2);
                }
            } catch (Exception e) {
                System.out.println("It's no valid, try again with a integer number");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
    }

    public static void primeNumber() {
//Dado un número saber si este es primo o no
        Scanner obj = new Scanner(System.in);

        int i, number, control, counter = 0;

        do {
            try {
                control = 0;
                System.out.print("Type any integer number: ");
                number = obj.nextInt();

                for (i = 1; i <= number; i++) {
                    if (number % i == 0) {
                        counter++;
                    }
                }
                if (counter <= 2) {
                    System.out.println(number + " is a prime number\n");
                } else {
                    System.out.println(number + " isn't a prime number\n");
                }

            } catch (Exception e) {
                System.out.println(" It isn't a integer number. Please"
                        + " tray again with a integer number\n");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
    }

    public static void twoMultiple() {
//Imprimir en consola todos los números múltiplos de 2. El ciclo finalizará 
//cuando el último múltiplo sea menor a 4570
        int i;

        for (i = 0; i < 4570; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public static void factorialNumber() {
//Dado un número entero obtener su factorial
        Scanner obj = new Scanner(System.in);

        int i, factorial = 1, number, control;

        do {
            try {
                control = 0;
                System.out.print("Type any number that you want the factorial: ");
                number = obj.nextInt();

                for (i = 2; i <= number; i++) {
                    factorial = factorial * i;
                }
                System.out.print("The factorial of " +number+ " is " +factorial+ "\n\n");

            } catch (Exception e) {
                System.out.println(" It isn't a integer number. Please"
                        + " tray again with a integer number\n");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
    }
}
