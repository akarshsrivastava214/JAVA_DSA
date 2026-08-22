import java.util.Arrays;
import java.util.Scanner;

public class Q16_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        // Reverse to get decreasing order
        // for(int i=0; i<arr.length/2; i++){
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length - 1 - i];
        //     arr[arr.length - 1 - i] = temp;
        // }


        // for(int i=arr.length-1; i>=0; i--){
        //     System.out.print(arr[i] + " ");
        // }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }   
}
