import java.util.Scanner;

public class StrCntUprNLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(ch>='a' && ch<='z'){
            lower++;
        }
        else if (ch >= 'A' && ch <= 'Z'){
            upper++;
        }
        }
    System.out.println(upper);
    System.out.println(lower);
    }
}

