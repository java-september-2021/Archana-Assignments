package sample;

public class AlfredTest {

	public static void main(String[] args) {
		
		Alfred af= new Alfred();
		System.out.println(af.guestGreeting("Archana", "Good Morning"));
		
		System.out.println(af.dateAnnouncement());
		
		String AlexisTest =af.respondBeforeAlexis("Alexis play some low fi beam");
		
		//System.out.println( AlexisTest);	
		String AlefedTest =af.respondBeforeAlexis(" I Can't find yo- yo. May be Alfed may know about it.");
		
		String notRelaventTest =af.respondBeforeAlexis("May be thats what Batman is all about.Nothing winning but Failing.");
	
	
	
	System.out.println();
	System.out.println(AlexisTest);
	System.out.println(notRelaventTest);
	System.out.println(AlefedTest);
	System.out.println();
	
	
	
	}

	
	
	
}
