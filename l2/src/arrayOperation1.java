import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Lenovo on 1/16/2022.
 */
public class arrayOperation1 {
    public static void main(String[] args) {
        int a[]={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        System.out.println("after reverse");
        System.out.println(Arrays.toString(reverse(a)));

    }
    public static int[]reverse(int[]x){
        int n=x.length-1;
        for (int i = 0; i < x.length/2; i++) {
            int t = x[i];
            x[i] = x[n];
            x[n] = t;
            n--;

        }
        return x;
    }
}
