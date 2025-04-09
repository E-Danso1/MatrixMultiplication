import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of rows and columns for matrix A (n m): ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] A = new int[n][m];


        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        System.out.print("Enter number of rows and columns for matrix B (m p): ");
        int m2 = sc.nextInt();
        int p = sc.nextInt();


        if (m != m2) {
            System.out.println("Matrix multiplication is not possible. Columns of A must match rows of B.");
            return;

        }

        int[][] B = new int[m2][p];


        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < m2; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = sc.nextInt();
            }
        }


        int[][] C = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < m; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        
        System.out.println("Resulting Matrix C (A x B):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}