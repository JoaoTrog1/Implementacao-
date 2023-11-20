import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int m, n, p, q;
        double[][] A, B, C;

        System.out.println("Informe a quantidade de linhas(m) da primeira matriz(A):");
        m = (int)t.nextDouble();
        System.out.println("Informe a quantidade de clunas(n) da primeira matriz(A):");
        n = (int)t.nextDouble();
        A = new double[m][n];
        
        System.out.println("Informe a quantidade de linhas(p) da segunda matriz(B):");
        p = (int)t.nextDouble();
        System.out.println("Informe a quantidade de clunas(q) da segunda matriz(B):");
        q = (int)t.nextDouble();
        B = new double[p][q];

        if (n == p) {
            C = new double[m][q];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.println("Informe um valor para A" + i + "x" + j);
                    A[i][j] = t.nextDouble();
                }
            }

            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.println("Informe um valor para B" + i + "x" + j);
                    B[i][j] = t.nextDouble();
                }
            }

            //imprime a matriz A
            System.out.println("Matiz A");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
            }

            //imprime a matriz B
            System.out.println("Matiz B");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }

            //caucula e imprime a matriz C = A*B
            System.out.println("Matiz C");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    for (int k = 0; k < n; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                    System.out.print(C[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Não é possível executar a multiplicação de AB");
        }  
    }
}
