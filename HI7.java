import java.util.*;
public class HI7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++){
            int s=0;
            int A=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            for(int j=0;j<n;j++){
                 
     
      
      int k=(int)Math.pow(2,j)  ;  
     
                s=s+(k*b);
                 s=s+A;
               
                 System.out.print(s+" ");
                 s=s-A;
            }
       System.out.println("");
        }
        sc.close();
    }
    
}
