import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            list.add(sc.nextInt());
        }
        int target = sc.nextInt();
        int index = list.indexOf(target);
        System.out.println("Index of the Target Element: " + index);
    }
}
