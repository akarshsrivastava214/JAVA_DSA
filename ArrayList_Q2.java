import java.util.ArrayList;
import java.util.*;
public class ArrayList_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int i = 0; i < list.size(); i = i + 2) {
            System.out.print(list.get(i) + " ");
        }
    }
}
