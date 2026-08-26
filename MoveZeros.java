import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
       }
       int i=0;
       for(int x: arr){
        if(x!=0){
            arr[i++] = x;
        }
        while(i<n){
            arr[i++] = 0;
        }
       }
       System.out.println(Arrays.toString(arr));
    }
}