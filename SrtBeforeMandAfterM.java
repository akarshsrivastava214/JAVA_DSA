import java.util.Scanner;

public class SrtBeforeMandAfterM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int before = 0;
        int after = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='m'){
                before++;
            }
            else if(ch>='m' && ch<='z'){
                after++;
            }
        }
        System.out.println("Before : " + before);
        System.out.println("After : " + after);
        sc.close();
    }
    
}
