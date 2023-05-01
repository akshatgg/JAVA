import java.util.*;
public class PBGradingStudent{
 
public  static void gradingStudent(int m, int[] A){
int i;
    for( i=0;i<m;i++){
        if(A[i]>=38){
    if(A[i]%10==1 || A[i]%10==6){
        int sum=A[i];
        A[i]=A[i]+4;
        int sub=A[i]-sum;
        if(sub<3){
           System.out.println(A[i]);
        }
      else if(sub==3){
        System.out.println(sum);
       }
       else{
        System.out.println(sum);
       }

        }
    
    else if(A[i]%10==2 || A[i]%10==7){
        int sum=A[i];
        A[i]=A[i]+3;
        int sub=A[i]-sum;
        if(sub<3){
            System.out.println(A[i]);
        }
      else if(sub==3){
        System.out.println(sum);

       }
       else{
        System.out.println(sum);
       }
    }
    else if(A[i]%10==3 || A[i]%10==8){
        int sum=A[i];
        A[i]=A[i]+2;
        int sub=A[i]-sum;
        if(sub<3){
            System.out.println(A[i]);
        }
      else if(sub==3){
        System.out.println(sum);
    }
    else{
        System.out.println(sum);
       }
    }
    else if(A[i]%10==9 ||A[i]%10==4){
        int sum=A[i];
        A[i]=A[i]+1;
        int sub=A[i]-sum;
        if(sub<3){
            System.out.println(A[i]);
        }
      else if(sub==3){
       System.out.println(sum);
       }
       else{
        System.out.println(sum);
       }
    }
     
    else if(A[i]%5==0){
       System.out.println(A[i]);
   }
    }
    else{
        System.out.println(A[i]);
    }
}

}

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
   int m=sc.nextInt();
   int[] A=new int[m];
   for(int j=0;j<m;j++){
    A[j]=sc.nextInt(); 
   }
   gradingStudent(m,A);

}
}

