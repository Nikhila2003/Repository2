package NumberProgramsExamples;
import java.util.Scanner;
public class Gcd {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
         int a=24;
         int b=12;
         int n=a>b?a:b;     // or for(int i=1;i<=b;i++)
         while(true) {   // or      if(a%i==0 && b%i==0){
        	 if(a%n==0 && b%n==0) break; // int gcd=i;
        	   --n;            //       sopln(gcd);
         }
         System.out.println(n);
	}

}
