import java.util.Scanner;

public class Q9_CountFrqEchChr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == i){
                int count = 0;
                for(int k=0; k<str.length(); k++){
                    if(str.charAt(k) == ch){
                        count++;
                    }
                }
                System.out.println(ch + " : " + count);
            }
        }
        sc.close();
    }
}
