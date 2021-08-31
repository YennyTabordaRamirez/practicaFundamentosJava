package taRamYenny.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Vectors {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int option;

        int[] numbers = createVector();
        do {
            try {
                option = 0;
                System.out.println("\nMenu\n"
                        + "1. View the vector created\n"
                        + "2. Major Number\n"
                        + "3. Minor Number\n"
                        + "4. Prime numbers vector\n"
                        + "5. Pairs Numbers\n"
                        + "6. Ascending Vector\n"
                        + "7. Vector average\n"
                        + "0. Exit ");
                option = obj.nextInt();
                switch (option) {
                    case 1:
                        viewVector(numbers);
                        break;
                    case 2:
                        majorNumber(numbers);
                        break;
                    case 3:
                        minorNumber(numbers);
                        break;
                    case 4:
                        primeNumbers(numbers);
                        break;
                    case 5:
                        pairNumber(numbers);
                        break;
                    case 6:
                        ascendingVector(numbers);
                        break;
                    case 7:
                        vectorAverage(numbers);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong option. Try again\n");
                option = 1;
                obj.nextLine();
            }
        } while (option != 0);
    }

    public static int[] createVector() {
        Scanner obj = new Scanner(System.in);

        int numbers[] = new int[0];
        int vectorLenght, control, control2;

        do {
            try {
                control = 0;
                System.out.print("Type a integer number for the length of the vector: ");
                vectorLenght = obj.nextInt();
                numbers = new int[vectorLenght];

                do {
                    try {
                        control2 = 0;
                        for (int i = 0; i < numbers.length; i++) {
                            System.out.print("Type any integer number for the position " + i + ": ");
                            numbers[i] = obj.nextInt();
                        }
                    } catch (Exception e) {
                        System.out.print("Incorrect number. Try again with a integer number\n");
                        control2 = 1;
                        obj.nextLine();
                    }
                } while (control2 != 0);

            } catch (Exception e) {
                System.out.print("Incorrect number. Try again with a integer number\n");
                control = 1;
                obj.nextLine();
            }
        } while (control != 0);
        //System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    public static void viewVector(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }

    public static void majorNumber(int[] numbers) {
        int majorAux = 0;
        for (int i = 0; i < numbers.length; i++) {
            majorAux = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (majorAux < numbers[j]) {
                    majorAux = numbers[j];
                }
            }
        }
        System.out.println("The major number is " + majorAux);
    }

    public static void minorNumber(int[] numbers) {
//Mostrar en consola el número menor
        int minorAux = 0;
        for (int i = 0; i < numbers.length; i++) {
            minorAux = numbers[i];
            for (int j = 0; j < numbers.length; j++) {
                if (minorAux > numbers[j]) {
                    minorAux = numbers[j];
                }
            }
        }
        System.out.println("The minor number is " + minorAux);
    }

    public static void primeNumbers(int[] numbers) {
//Mostrar en consola todos los números primos.

        System.out.print("The prime numbers are ");
        for (int i = 0; i < numbers.length; i++) {
            int counterPrime = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    counterPrime++;
                }
            }
            if (counterPrime == 2) {
                System.out.print("[" + numbers[i] + "]");
//              System.out.println(Arrays.toString(numbers));
            }
        }
    }

    public static void pairNumber(int[] numbers) {
//Mostrar en consola todos los números pares
        System.out.print("The pair numbers are ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print("[" + numbers[i] + "]");
//              System.out.println(Arrays.toString(numbers));
            }
        }
    }

    public static void ascendingVector(int[] numbers) {
//Mostrar en consola el arreglo de forma ascendente
        int aux = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
        System.out.println("Ascending vector ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
    }

    public static void vectorAverage(int[] numbers) {
//Mostrar en consola el promedio del arreglo
        double amount = 0, average;

        for (int i = 0; i < numbers.length; i++) {
            amount = amount + numbers[i];
        }
        average = amount / numbers.length;
        System.out.printf("The vector average is (%.2f)", average);
    }
}
