
import java.util.*;
import java.io.*;
public class HI8M2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
                
            int t=sc.nextInt();
    for(int i=0; i<t; i++)
        {
        try{
            long num = sc.nextLong();
            System.out.println(num+ " can be fitted in:");
            if(num>=-128 && num<=127)
            {
                System.out.println("* byte");
            }
            if(num>=-32768 && num<=32767)
            {
                System.out.println("* short");
            }
            if(num>=-2147483648 && num<=2147483647)
            {
                System.out.println("* int");
            }
            System.out.println("* long");
        }
        catch(Exception e)
        {
         System.out.println(sc.next()+" can't be fitted anywhere.");
        }
    }
    }
}

