import java.util.Scanner;

public class Q14_FrequecyOfElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        boolean[] counted = new boolean[arr.length];
        for(int i=0; i<arr.length; i++){
            if(!counted[i]){
                int count = 1;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] == arr[j]){
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times");
            }
        }
        sc.close();
    }
    
}
