import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class HIJavaSTringreverse  {

    public static void main(String[] args) {
        int i;
        int j;
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
         String rev="";
        // String chr[]=new String[100];
        // StringTokenizer b =new StringTokenizer(A);
        // for( i=0;b.hasMoreElements();i++){
            
        //  chr[i]=b.nextToken();
         
        // }
        for(j=A.length()-1;j>=0;j--){
      rev=rev+A.charAt(j);
        }
        System.out.print(rev);
        if(rev.equals(A))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        // chr[j]=A.substring(A.length());
        // // System.out.print(chr[4]);
        // for(int u=A.length()-1;u>=0;j--){
        //      U=U+chr[u];
        // }
        // System.out.print(U);
        
   


        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




