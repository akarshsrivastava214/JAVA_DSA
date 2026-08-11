import java.util.Scanner;

public class Array_FindAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        int sum = 0;
        for(int i=0; i<num; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        double avg = (double) sum / num;
        System.out.println("Average : " + avg);
    }
}
