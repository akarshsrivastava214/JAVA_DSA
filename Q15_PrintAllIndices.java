import java.util.*;
public class Q15_PrintAllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();  
        }
        int target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Index : " + i);
            }
        }
    }
    
}
