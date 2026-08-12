import java.util.Scanner;

public class StrCheckEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 0) {
        System.out.println("String is empty");
    }
    else{
        System.out.println("Not Empty");
    }
    }
}