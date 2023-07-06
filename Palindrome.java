package NumberProgramsExamples;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=121;
		int temp=num;
		int rev=0,rem;
		while(num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(temp==rev) {
			System.out.println("palindrome");
			
		}else {
	
		System.out.println("not palindrome");
	}

}
}