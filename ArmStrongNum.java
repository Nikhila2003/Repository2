package NumberProgramsExamples;
import java.util.Scanner;
public class ArmStrongNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int num=scn.nextInt();
		int temp=num;
		int count=0;
		while(num>0) {count++;
		num=num/10;
	
		}
		System.out.println("len="+count);
		num+=temp;
		int sum=0;
		while(num>0) { 
			int digit=num%10;
			int product=1;
			for(int i=1;i<=count;i++) {
				product=product*digit;
			}
			sum=sum+product;
			System.out.println(digit+"power"+count+ "pos");
			num=num/10;
			System.out.println("sum="+sum);
			if(sum==temp) {
				System.out.println("armstrong");
			}
			else {
				System.out.println("not an armstrong number");
			}
			
		}
	}
}
		
	


