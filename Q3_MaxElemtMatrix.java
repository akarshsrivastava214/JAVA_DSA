import java.util.Scanner;
public class Q3_MaxElemtMatrix {
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
        int max = matrix[0][0];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
