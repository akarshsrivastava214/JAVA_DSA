import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList_Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        list.set(1, 22);
        System.out.println("Updated : " + list);
    }
}
