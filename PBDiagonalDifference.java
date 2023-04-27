import java.util.*;
public class PBDiagonalDifference{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,sum2=0;
        
        int A[][]=new int [n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                A[i][j]=sc.nextInt();
            if(i==j){
                sum=sum+A[i][j];
            }

            }
        }
        for(int i=0;i<n;i++){
sum2=sum2+A[i][n-i-1];
        }
        int subtract=0;
        subtract=sum2-sum;
        System.out.println(Math.abs(subtract));
    }
}