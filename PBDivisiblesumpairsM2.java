import java.util.*;
public class PBDivisiblesumpairsM2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int i=j+1;i<n;i++){  
        if( (a[j]+a[i])%k==0){
            count++;
        }
        }
    }
    System.out.println(count);
    sc.close();
    }
}
