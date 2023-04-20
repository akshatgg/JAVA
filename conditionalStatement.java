import java.util.*;
public class conditionalStatement
{
   public static void main(String[] args)
   {
    Scanner sc =new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int option=sc.nextInt();
    switch(option)
    {
    case 1 : float add=A+B;
System.out.println(add);
break;
case 2 : double multiply=A*B;
System.out.println(multiply);
break;
default : System.out.println("Fuck offffffff");
sc.close();
    }

   }

}