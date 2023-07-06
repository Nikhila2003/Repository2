package NumberProgramsExamples;
import java.util.Scanner;
public class LengthOfNum {

	public static void main(String[] args) {
          Scanner scn=new Scanner(System.in); 
             int num=scn.nextInt();
             int count=0;
             while(num>0) {
            	 int rem=num%10;
            	      count++;
            	      num=num/10;
             }
             System.out.println(count);
             
	}

}
