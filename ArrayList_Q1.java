import java.util.ArrayList;
import java.util.*;
public class ArrayList_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
}
/*
    marks.add(18);
    marks.add(22);
    marks.add(24);
    marks.add(25);
    marks.add(19);
    marks.add(20);
    marks.add(23);
    marks.add(29);
    marks.add(30);
    marks.add(27);
    System.out.println(marks);
*/