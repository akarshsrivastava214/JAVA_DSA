import java.util.Scanner;

public class Q2_RowWiseSumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();    
            }
        }
        // Calculate and print row-wise sum
        for(int i=0; i<row; i++){
            int sum = 0;
            for(int j=0; j<col; j++){
                sum += matrix[i][j];
            }
            System.out.print(sum + " ");
        }
    }
}
