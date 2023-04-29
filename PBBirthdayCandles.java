import java.util.*;
import java.util.Vector;
public class PBBirthdayCandles{
    public static int maximum(int m,Vector<Integer> v){
        int count1=0;
        int temp;
        
            
            temp=v.firstElement();
            for(int i=1;i<m;i++){
                if(temp<v.get(i)){
                   temp=v.get(i);
                }
            }
            for(int i=0;i<m;i++){
                if(temp==v.get(i)){;
                count1++;
                }
            }
            
        return count1;
        }
        
    
public static void main(String[] args){
    Vector<Integer> v = new Vector<>(); 
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
int input=sc.nextInt();  
   v.add(input);      
   System.out.println(maximum(n, v));
    }
sc.close();


}
}