import java.util.Scanner;

public class StrCountDigLetSpecChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int digit = 0;
        int letter = 0;
        int speclChr = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit++;
            }
            else if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
                letter++;
            }
            else {
                speclChr++;
            }
        }
        System.out.println("Digits : " + digit);
        System.out.println("Letters : " + letter);
        System.out.println("Special Characters : " + speclChr);
    }
}
