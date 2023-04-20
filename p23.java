import java.util.Scanner;

public class p23{
    public static String getSmallestAndLargest(String s, int k) {
        String smallest ;
        String largest ;
        int i;
        String A[]=new String[(10000)];
        for( i=0;i<(s.length()-k);i++){
            String B=s.substring(i,k+i);
            A[i]=B;
        }
        A[i]=s.substring(s.length()-k);
        
        
        // for(int u=0;u<=(s.length()-(k));u++){
        //     System.out.println(A[u]);
        // }
        int n=i+1;
        
        String temp;
        for(int j=0;j<(n-1);++j){
            for(int l=j+1;l<n;++l){
                if(A[j].compareTo(A[l])>0){
                    temp = A[j];
                    A[j] = A[l];
                    A[l] = temp;
                    
                    
                }
            }
        }
        smallest=A[0];
        largest=A[s.length()-k];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
       
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}