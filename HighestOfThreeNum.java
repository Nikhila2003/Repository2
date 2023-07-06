package NumberProgramsExamples;

public class HighestOfThreeNum {

	public static void main(String[] args) {
		int a=10;
		int b=45;
		int c=234;
		int d=80;
		int e=25;
		int n=(a>b&&a>c&&a>d&&a>e)?a:(b>c&&b>d&&b>e)?b:(c>d&&c>e)?c:(d>e)?d:e;
		System.out.println(n);
	}

}
