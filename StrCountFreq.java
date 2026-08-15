import java.util.Scanner;

public class StrCountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (char ch = 'a'; ch <= 'z'; ch++) {
             int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(ch + " = " + count);
            }
        }
    }
}
