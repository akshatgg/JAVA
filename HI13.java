import java.io.*;
import java.util.*;

public class HI13 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int sum=A.length()+B.length();
        System.out.println(sum);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
            
        }
        else{
        System.out.println("No");
        }
        String a=A.substring(0, 1).toUpperCase();
        String s1=a+A.substring(1,A.length());
        String b=B.substring(0, 1).toUpperCase();
        String s2=b+B.substring(1,B.length());
        System.out.println(s1+" "+s2);
        
    }
}

