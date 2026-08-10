import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int countVow = 0;
        int countCon = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    countVow++;
                }
                else{
                    countCon++;
                }
            }
        }
        System.out.println("Vowel Count : " + countVow);
        System.out.println("Consonant Count : " + countCon);
    }
}
