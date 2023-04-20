import java.util.*;
public class Function{
    public static double mySum(double a,double b){
        return a + b;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
double b=sc.nextDouble();
double sum1 = mySum(a,b);
System.out.println(sum1);
sc.close();
    }
}