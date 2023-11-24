import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner t = new Scanner(System.in);
        int m, n, p, q;
        double[][] A, B, C;

        System.out.println("Informe a quantidade de linhas(m) da primeira matriz(A):");
        m = t.nextInt();
        System.out.println("Informe a quantidade de clunas(n) da primeira matriz(A):");
        n = t.nextInt();
        A = new double[m][n];
        
        System.out.println("Informe a quantidade de linhas(p) da segunda matriz(B):");
        p = t.nextInt();
        System.out.println("Informe a quantidade de clunas(q) da segunda matriz(B):");
        q = t.nextInt();
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
            t.close();

            //imprime a matriz A
            System.out.println("Matiz A");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (A[i][j] == (int)A[i][j]) {// Verificando se o decimal é 0
                        System.out.print((int)A[i][j] + " "); // Removendo o 0
                    } else {
                        System.out.print(A[i][j] + " ");
                    }
                    
                }
                System.out.println();
            }

            //imprime a matriz B
            System.out.println("Matiz B");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    if (B[i][j] == (int)B[i][j]) {// Verificando se o decimal é 0
                        System.out.print((int)B[i][j] + " "); // Removendo o 0
                    } else {
                        System.out.print(B[i][j] + " ");
                    }
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
                    if (C[i][j] == (int)C[i][j]) {// Verificando se o decimal é 0
                        System.out.print((int)C[i][j] + " "); // Removendo o 0
                    } else {
                        System.out.print(C[i][j] + " ");
                    }
                }
                System.out.println();
            }

        } else {
            System.out.println("Não é possível executar a multiplicação de AB");
        }  
    }
}
