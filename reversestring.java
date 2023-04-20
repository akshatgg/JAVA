public class reversestring{
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder("hello");
       System.out.println(sb.length());
       System.out.println(sb.charAt(2));
       for(int i=sb.length()-1;i>=0;i--){
        int front=i;
        System.out.print(sb.charAt(front));
        }
    }
}