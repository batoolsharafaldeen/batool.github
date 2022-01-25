import java.util.Scanner;

/**
 * Created by Lenovo on 9/25/2021.
 */
public class inputnuber {
    public static void main(String[] args) {
        System.out.println("enter the floor");
        Scanner input = new Scanner(System.in);
        int floor = input.nextInt();
        int act;

        act=floor;
        act=(floor>13)?floor-1:floor;
        System.out.println(act);


    }

}