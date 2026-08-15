import java.util.Scanner;
public class StrCountVowCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vow = 0;
        int cons = 0;
        String str = sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || ch =='O' || ch =='U'){
                vow++;
            }
            else{
                cons++;
            }
        }
        System.out.println("Vowel : " + vow);
        System.out.println("Consonant : " + cons);
    }
}
