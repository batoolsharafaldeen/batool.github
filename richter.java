import java.util.Scanner;

/**
 * Created by Lenovo on 9/25/2021.
 */
public class richter {
    public static void main(String[] args) {
        System.out.println("enter your richter");
        Scanner richter=new Scanner(System.in);
        double r=richter.nextInt();

        if (r>=8.0){
            System.out.println("Most structurs fall");
        }
        else
            if(r>=7.0)
            {
                System.out.println("Many building destroyed");


    }
    else
        if(r>=6.0){
            System.out.println("Many buldings considerably damaged");
        }
        else
            if(r>=4.5)
            {
                System.out.println("Damage to poorly constructed buldings");

            }
            else
                System.out.println("No destruction of buildings" +
                        "");
            }
}
