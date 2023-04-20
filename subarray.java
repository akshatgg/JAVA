import java.util.*;
public class subarray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        
       for(int j=0;j<5;j++){
          A[j]=sc.nextInt();
}
for(int sp=0;sp<5;sp++){
    for(int ep=sp;ep<5;ep++){
        for(int k=sp;k<=ep;k++){
            System.out.print(A[k]+" ");
        
        }
        System.out.println();
}
        }
        sc.close();
    }
    
}
