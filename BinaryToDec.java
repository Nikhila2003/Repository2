package NumberProgramsExamples;

public class BinaryToDec {

	public static void main(String[] args) {
		int bin=11011;
		int dec=0;
		int i=1;
		while(bin>0) {
			 dec=dec+(bin%10)*i;
			i*=2;
			bin=bin/10;
		}
		System.out.println(dec);
	}

}
