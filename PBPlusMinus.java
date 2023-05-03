import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
   public static void plusMinus(int n,int[] A) {
        
        int count1=0,count2=0,count3=0;
    for(int i=0;i<n;i++){
        if(A[i]==0){
            count1++;
        }
       else if(A[i]>0){
            count2++;
        }
        else if(A[i]<0){
            count3++;
        }
    }
        double p= count2/A.length;     
        double N=count3/A.length;
        double z=count1/A.length;
        System.out.println(String.format("%. 6f",p));
        System.out.println(String.format("%. 6f",N));
        System.out.println(String.format("%. 6f",z));

 
    // Write your code here

    }
}
    

public class PBPlusMinus extends Result {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

       int n=sc.nextInt();
    int[] A =new int[n];
    for(int j=0;j<n;j++){
        A[j]=sc.nextInt();
    }
        // Result obj = new Result();
     Result.plusMinus(n,new int[]{A[n]});

}
}


  