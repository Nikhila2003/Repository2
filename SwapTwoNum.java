package NumberProgramsExamples;
//swap two numbers using third variable

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
			int a=scn.nextInt();
			int b=scn.nextInt();
			int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
			
		
	}

}
