
import java.util.*;
import java.io.*;
public class HI8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                
            int t=sc.nextInt();
            for(int i=0;i<t;i++)
            {
                
                try{
        long n=sc.nextLong();
                if(n>=-128 && n<=127){
                     System.out.println(n+" can be fitted in:" );
                    System.out.println("* byte");
                     System.out.println("* short");
                      System.out.println("* int");
                       System.out.println("* long");
                }
                
                else if(n>=-32768 && n<=32767)
                {
                     System.out.println(n+" can be fitted in:" );
                     System.out.println("* short");
                      System.out.println("* int");
                       System.out.println("* long");
                }
                else if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE ){
                     System.out.println(n+" can be fitted in:" );
                     System.out.println("* int");
                     System.out.println("* long");

                }
                else if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){
                 System.out.println(n+" can be fitted in:" );
                 System.out.println("* long");
                }
                
    }    
      catch(Exception e)
        {
         System.out.println(sc.next()+" can't be fitted anywhere.");
        }
        // else if(n>Long.MAX_VALUE)
        // {
        //     System.out.println(n+" can't be fitted anywhere.");
        // }
            }
           
            
          
    }
}
