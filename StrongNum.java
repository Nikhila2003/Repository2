package NumberProgramsExamples;

public class StrongNum {

	public static void main(String[] args) {
		int num=143;
		int rem, temp=num;
		while(num>0) {
			rem=num%10;
			for(int i=0;i<=rem;i++) {
				num=num*i;
				num=num/10;
			}
			if(temp==rem) {
				System.out.println("strong number");
			}
			else {
				System.out.println("not a strong number");
			}
		}

	}

}
