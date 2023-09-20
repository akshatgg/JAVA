
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HITagExtracter{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
			char[] c=line.toCharArray();
           int i=0;
           char[] ch=new char[100];
           int j=0;
            while(i<line.length()){
                if(c[i]=='<'){
                while(c[i]!='>'){

                    i++;
                }
                i++;
                
                if(i>line.length()){
                    break;
                }
                }
           ch[j]=c[i];
           j++;
           i++;
            }
            
          	//Write your code here
			
			testCases--;
		}
	}
}





