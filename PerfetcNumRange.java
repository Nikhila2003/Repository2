package NumberProgramsExamples;

public class PerfetcNumRange {

	public static void main(String[] args) {
		int a=1;
		int b=100;
		for(int i=a;i<=b;i++) {
			isPerfect(i);
		}
	}
		
		public static void isPerfect(int num) {
			int n=num;
			int sum=0;
			for(int i=1;i<=n/2;i++) {
				if(n%i==0) {
					sum=sum+i;
					
				}
				if(n==sum) {
					System.out.println(sum);
					return;
				}
			}
		}
	}

	

