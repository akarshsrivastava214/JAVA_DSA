import java.util.Scanner;

public class Q8_CountDigAlbSpChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = 0, d = 0, sp = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                a++;
            }
            else if (ch >= '0' && ch <= '9') {
                d++;
            }
            else if (ch != ' ') {
                sp++;
            }
        }

        System.out.println(a);
        System.out.println(d);
        System.out.println(sp);
        sc.close();
    }
}
