
public class getbit {
    public static void main(String [] args){
int n=3;
int pos =2;
int bitMask=1<<pos;
if((bitMask & n)==0){
System.out.print("bit was zero");
}
else{
    System.out.print("bit was one");
}



    }
    
}
