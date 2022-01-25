import java.util.Scanner;

/**
 * Created by Lenovo on 9/25/2021.
 */
public class inputPrice {
    public static void main(String[] args) {
        System.out.println("enter your price");
        Scanner price=new Scanner(System.in);
        int p=price.nextInt();
        double dis;

        if(p<128)
        {
        dis=.08;

    }
    else
        dis=.16;
        System.out.println(p*dis);
    }}

