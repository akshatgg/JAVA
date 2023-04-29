import java.util.*;
public class PBbirthdayCandlesM2{
public static int  largest(int m, int[] A){
int count1=0;
int temp;

    
    temp=A[0];
    for(int i=1;i<m;i++){
        if(temp<A[i]){
           temp=A[i];
        }
    }
    for(int i=0;i<m;i++){
        if(temp==A[i]){;
        count1++;
        }
    }
    
return count1;
}


    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
     
      int[] A=new int[n];
            for(int i=0;i<n;i++){
                A[i]=sc.nextInt();
                  }
                 System.out.println(largest(n,A));
            sc.close();

        }
    }

