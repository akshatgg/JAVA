 import java.util.*;
public class Hi3 {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      if(n%2==0)
      {
        if(n>2 && n<5)
        {
            System.out.print("Not Weird");
        }
        else if(n>6 && n<=20)
        {
            System.out.print("Weird");
        }
        else 
        {
            System.out.print("Not Weird");
        }
      }
      else
      {
        System.out.print("Weird");
      }
      sc.close();
    }
}
