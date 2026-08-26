import java.util.Scanner;

public class LeftShiftByKposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0; i<len-k; i++){
            arr[i] = arr[i+k];
        }
        for(int i=len-k; i<len; i++){
            arr[i] = 0;
        }
        for(int i=0; i<len; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
// Left Shift By 1 position 
// for(int i=0; i<len-1; i++){
// arr[i] = arr[i+1];
// arr[i+1] = 0;
// for(int i=0; i<len; i++){
// System.out.print(arr[i] + " ")
// }