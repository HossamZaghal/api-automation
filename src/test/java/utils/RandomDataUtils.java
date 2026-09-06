package utils;

import java.util.Random;

public class RandomDataUtils {
	
	 public static String randomProductName() {

	        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	        Random random = new Random();
	        String name = "";

	        for (int i = 0; i < 5; i++) {

	            int index = random.nextInt(letters.length());

	            char letter = letters.charAt(index);

	            name = name + letter;
	        }

	        return name;
	    }
}
