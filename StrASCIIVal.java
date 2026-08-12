import java.util.Scanner;

public class StringQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int [] freq = new int[26];
        for(char i : s.toCharArray()){
            freq[i - 97]++;
        }
        for(int i=0; i<26; i++){
            if(freq[i] != 0){
                System.out.println((char)(i + 97) + " = " + freq[i]);
            }
        }
    }
}

