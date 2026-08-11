import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();  
        }
        int k = sc.nextInt();
        for(int i=0; i<k; i++){
            int temp = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];  
            }
            arr[arr.length-1] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    
}
