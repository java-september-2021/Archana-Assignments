package puzzle;

import java.util.Arrays;

public class PuzzleJavaTest {
	
	public static void main(String[] args) {
		
		PuzzleJava generator=new PuzzleJava();
		
		int randomRoll=generator.getTenRolls();
		
		System.out.println(randomRoll);
		
		
		// Generating random letter
        System.out.println("Random char: " + generator.getRandomLetter());
        // Generating password
        System.out.println("Random new Password : " + generator.generatePassword());

        // Generating new passwordset
        String[] words = generator.getNewPasswordSet(5);
        System.out.println("Random new Password Set: " + Arrays.toString(words));

    }
		
	}


