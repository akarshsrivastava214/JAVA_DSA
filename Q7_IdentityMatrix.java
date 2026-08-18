import java.util.Scanner;

public class Q7_IdentityMatrix {
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
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if((i==j && matrix[i][j] != 1) || (i!=j && matrix[i][j] != 0)){
                    System.out.println("Not Identity Matrix");
                    return;
                }
            }
        }
        System.out.println("Identity Matrix");
    }   
}
