package taRamYenny.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[][] matrix = createMatrix();

        int option;
        do {
            try {
                option = 0;
                System.out.println("\nMenu\n"
                        + "1.  Average of the matrix\n"
                        + "0. Exit\t");
                option = obj.nextInt();
                switch (option) {
                    case 1:
                        averageMatrix(matrix);
                        break;                       
                    case 2:
                        averageScore();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Wrong type. Please, try again\n");
                option = 1;
                obj.nextInt();
            }
        } while (option != 0);
    }

    public static int[][] createMatrix() {
//Crear un matriz de 5 x 5. Llenar la matriz con números aleatorios
        int matrix[][] = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        return matrix;
    }

    public static void viewMatrix(int[][] matrix) {
//        System.out.println(Arrays.deepToString(matrix));
//        System.out.println(Arrays.toString(matrix));
    }

    public static void averageMatrix(int[][] matrix) {
//Mostrar en consola el promedio de la matriz
        double average, amount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                amount += matrix[i][j];
            }
        }
        average = amount / (matrix.length * matrix.length);
        System.out.printf("The matrix average is %.2f", average);
    }

    public static void averageScore() {
//Arreglo de 5x6. 5 primeras con notas aprobatorias entre 6-10, el 6t0 = 0
//promedio de los 5 primeros y asignarlo al 6to
//promedio de c/fila
Scanner obj = new Scanner(System.in);
        float score[][] = new float[5][6];
        
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
                System.out.print("Please, type your 5 scores: ");
                score [i][j] = obj.nextFloat(); 
                if(score.length <= 6)
                    score[i][j] = 0;
            }            
        }
        
        float sum = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
               sum += score[i][j];     
               if (score[i][j] <= 6)
                   score[i][j] = sum;
            }
        }
                
        float average = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score.length; j++) {
               average += score[i][j];                
            }
            System.out.println("The average for the row" + i+" it's " + average / 6);            
        }     
    }
}
