package sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Alfred {
	
	
	public String basicGreeting() {
		
		return "Hello, Lovely to see you. How are you?";
	}
	
	public String guestGreeting(String name, String dayPeroidTime) {
		
		return dayPeroidTime+", "+name+" "+" Love to see you.";
		
		
	}
	
	public String dateAnnouncement() {
		
		DateTimeFormatter date=	DateTimeFormatter.ofPattern("yyyy/mm/dd HH:mm:ss");
		
		LocalDateTime now=  LocalDateTime.now();
		
		//String date =String.format(, null))
		
		return date.format(now); 
	}
	
	
	
	public String respondBeforeAlexis(String conversetion ) {
		
		if(conversetion.indexOf("Alexis") != -1) {
		
			return "Right away, sir.She certainly is not sophisticated enough for that.";
		
		} else if (conversetion.indexOf("Alefred") != -1 ){
		
			return "At your service. As you wish Naturally.";
		} else {
			
			return "Not found";
		}
	

}
	
}