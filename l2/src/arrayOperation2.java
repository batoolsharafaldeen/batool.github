import org.omg.DynamicAny.DynArrayOperations;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lenovo on 1/16/2022.
 */
public class arrayOperation2 {
    int x[];
    int numOfElements;

  public arrayOperation2(){
      x=new int[5];
      numOfElements=0;
  }
  public   int addElement(int e){
     if(numOfElements<x.length){
         x[numOfElements]=e;
         numOfElements++;
         return 0;
     }
     return -1;
  }
  public static void main(String[]agrs){
      arrayOperation2 test=new arrayOperation2();
      Scanner in=new Scanner(System.in);
      System.out.println("input elements");
      for(int i=0;i<7;i++){
          if(test.addElement(in.nextInt())==0)
              System.out.println("added sucessfully");
          else
              System.out.println("array is full");
          System.out.println(Arrays.toString(test.x));
      }
  }
}
