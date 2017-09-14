import java.util.Scanner;
public class MySort {
    public static void main (String args[]) {
        //long[] a;
        int n,k,b,i;
        System.out.println("<<<sort rascheskoi>>>");
        System.out.println("Vvedite kolichestvo elementov");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n];
        System.out.println("Vvedite elementi massiva");
        for (i = 0; i < n; i++) {
            k = in.nextInt();
            a[i] = k;
        }
        int f = (int)Math.round(n / 1.24733);
        while(f >= 1){
            i = 0;
            while(( i + f ) < n){
                if(a[i] > a[i + f]){
                    b = a[i];
                    a[i] = a[i + f];
                    a[i + f] = b;
                }
                i += 1;
            }
            f -= 1;
        }
        for(i = 0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
