import java.util.Scanner;

public class StrCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.nextLine();
        int res = str.compareTo(str1);
        if (res == 0) {
            System.out.println("Both strings are equal");
        } else if (res < 0) {
            System.out.println(str + " comes before " + str1);
        } else {
            System.out.println(str + " comes after " + str1);
        }
    }
}
