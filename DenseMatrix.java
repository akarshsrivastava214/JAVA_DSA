import java.util.Scanner;

public class DenseMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        int zero = 0, nonZero = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (nonZero > zero)
            System.out.println("Dense Matrix");
        else
            System.out.println("Not Dense Matrix");
    }
}

    
