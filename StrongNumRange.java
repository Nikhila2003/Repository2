package NumberProgramsExamples;
import java.util.Scanner;
public class StrongNumRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("enter the numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
				for(int i=a;i<=b;i++) {
					isStrong(i);
				}
	}
     public static void isStrong(int n) {
         	int temp=n;
			int sum=0;
			
	           while(n>0) 
	           {
				 int rem=n%10;
				int fact=1;
				for(int i=1;i<=rem;i++) 
				{
					fact=fact*i;
				}
				 sum+=fact;
				 n=n/10;
		       }
			  if(temp==sum)System.out.println(sum);
	}

}
