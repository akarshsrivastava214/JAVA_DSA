import java.util.Scanner;

public class StringQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if (str.charAt(i) != ' ') {
            count++;
        }
    }
    System.out.println("Length of the string: " + count);
}
}
