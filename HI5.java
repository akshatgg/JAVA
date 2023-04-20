import java.util.Scanner;

public class HI5 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            int count =0,k;
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
              k=x;
              count=0;
                while(x!=0)
               {
                x=x/10;
                count++;
               }
                if(count==2){
                    System.out.print(s1);
                    System.out.print("  ");
                    System.out.print("0"+k);
                }
                else  if(count==3){
                    System.out.print(s1);
                    System.out.print("  ");
                    System.out.print(k);
                }
                else{
                    System.out.print(s1+"   "+"00"+k);
                }
                System.out.println();
            }
                
                sc.close();
                
                
                //Complete this line
                System.out.println("================================");
            }

    }

