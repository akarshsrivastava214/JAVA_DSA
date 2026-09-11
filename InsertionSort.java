import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1, 9};
        System.out.println(Arrays.toString(a));
        for(int i=1; i<a.length; i++){
            int var = a[i], j=i-1;
            while(j>=0 && a[j]>var){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = var;
        }
        System.out.println(Arrays.toString(a));
    }
}