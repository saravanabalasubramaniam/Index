import java.io.*;
import java.util.*;
public class Index
{

    public static void main(String[] args)
     {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int a = input.nextInt();
       int[] num = new int[a];
	 ArrayList<String> al = new ArrayList<String>();
       for (int i = 0; i < a; i++)
          {
              System.out.print("");
              num[i] = input.nextInt();
            
          }
        for(int j=0;j<a;j++){
            System.out.println(num[j]+"  index:"+j);
            System.out.println();
        }
}
}
