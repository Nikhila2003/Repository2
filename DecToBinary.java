package NumberProgramsExamples;

public class DecToBinary {
  public static void main(String[] args) {
	  int dec=12;
	  int bin=0;
	  int i=1;
	  while(dec>0) {
		  int bit=dec%2;
		  bin+=bit*i;
		  i=i*10;
		  dec=dec/2;
	  }
		  System.out.println(bin);
	  }
  
}
