import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the first matrix SizeA_Row=");
        int SizeARow = scanner.nextInt();
        System.out.println("Enter size of the first matrix SizeA_Column=");
        int SizeAColumn = scanner.nextInt();
        // Создаем двумерный массив
        int[][] A = new int[SizeARow][SizeAColumn];
        for (int i = 0; i < SizeARow; i++) {
            for (int j = 0; j < SizeAColumn; j++) {
                System.out.println("Enter  matrix element");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter size of the first matrix SizeB_Row=");
        int SizeBRow = scanner.nextInt();
        System.out.println("Enter size of the first matrix SizeB_Column=");
        int SizeBColumn = scanner.nextInt();
        // Создаем двумерный массив
        int[][] B = new int[SizeBRow][SizeBColumn];
        for (int i = 0; i < SizeBRow; i++) {
            for (int j = 0; j < SizeBColumn; j++) {
                System.out.println("Enter  matrix element");
                B[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix A");// Теперь выводим массив на экран
        for (int i = 0; i < SizeARow; i++) {
            for (int j = 0; j < SizeAColumn; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B");
        // Теперь выводим массив на экран
        for (int i = 0; i < SizeBRow; i++) {
            for (int j = 0; j < SizeBColumn; j++) {
                System.out.print(B[i][j]);
            }
            System.out.println();
        }
        // New part of code (test)
        final int aRowNumber = A.length;
        final int aColumnNumber = A[0].length;
        final int cRowNumber = aRowNumber;
        final int cColumnNumber = aColumnNumber;
        int[][] C = new int[cRowNumber][cColumnNumber];
        for (int i = 0; i < cRowNumber; i++) {
            for (int j = 0; j < cColumnNumber; j++) {
                C[i][j] = A[i][j] + B[i][j];

            }
        }
        System.out.println("Matrix C");// Теперь выводим массив на экран
        for (int i = 0; i < cRowNumber; i++) {
            for (int j = 0; j < cColumnNumber; j++) {
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // Sum
        int SumMin = 0;
        long min;
        for (int j = 0; j < C[0].length; j++) {
            min = C[0][j];
            for (int i = 1; i < C.length; i++) {
                if (min > C[i][j]) {
                    min = C[i][j];
                }
            }
            SumMin += min;
        }

        System.out.println(SumMin);
    }
}


