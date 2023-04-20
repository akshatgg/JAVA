import java.util.*;
public class fibonacci{
    public static void main(String [] args) 
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int c=0,a=0,b=1,k;
        while(c<=n)
        {
            System.out.print(a);
            System.out.print(" ");
            c=a+b;
            b=a;
            k=c;
            a=k;
        }
        sc.close();

        
    }
}