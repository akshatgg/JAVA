import java.util.*;
public class PBBigSum {
    public static void main(String[] args){
        long A[]=new long[100];
        int n;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            A[i]=sc.nextLong();
        }
        long sum=0;
        for(int j=0;j<n;j++){
            sum=sum + A[j];
        }
        sc.close();
        System.out.println(sum);




    }
    
}
