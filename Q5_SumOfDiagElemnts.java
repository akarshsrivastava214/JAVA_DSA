import java.util.Scanner;
public class Q5_SumOfDiagElemnts {
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
        int sumPrincipalDiag = 0;
        for(int i=0; i<row && i<col; i++){
            sumPrincipalDiag += matrix[i][i];
        }
        System.out.println("Sum of principal diagonal: " + sumPrincipalDiag);
    }
    
}
