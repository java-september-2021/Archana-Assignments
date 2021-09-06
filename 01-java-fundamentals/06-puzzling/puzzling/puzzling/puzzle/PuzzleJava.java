package puzzle;

import java.util.Random;

public class PuzzleJava {
	
	
Random randMachine = new Random();
	
int randomNum;
	public int getTenRolls() {
		
		for (int i=1;i<10;i++) {
			
		 randomNum = randMachine.nextInt(20);
			
		}
		
		return randomNum;
	}
	
	


    public char getRandomLetter() {
        Random randomChar = new Random();
        char c = (char) (97 + randomChar.nextInt(26));
        return c;
    }

    public String generatePassword() {
        String returnStr = "";
        for (int i = 0; i < 8; i++) {
            returnStr += Character.toString(getRandomLetter());
        }
        return returnStr;
    }

    public String[] getNewPasswordSet(int n) {
        String[] newArr = new String[n];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = generatePassword();
        }
        return newArr;
    }

}
