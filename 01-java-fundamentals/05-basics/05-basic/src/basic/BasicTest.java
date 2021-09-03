package basic;

public class BasicTest {
	
	public static void main(String[] args) {
		
	
	
	Basic basics=new Basic();
	
	basics.numbersFrom1to255();
	
	basics.oddNumbersFrom1to255();

	basics.evenNumbersFrom1to255();
	
	int sum=basics.sumFrom1To255();
	
	basics.iteratingArray();
	
	basics.findMaxUsingCollection();
	
	System.out.println(basics.findMax());
	
	
	basics.createArrayY();
	int [] arr= {1,2,3,6};
	
	basics.getAverage(arr);
	basics.greaterThanY();
	
	basics.squareTheValue();
	}
	
}