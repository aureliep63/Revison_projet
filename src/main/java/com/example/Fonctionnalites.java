package com.example;

public class Fonctionnalites {
	
		    public static int wordsCount(String phrase) {
		        if (phrase == null || phrase.isEmpty()) {
		            return 0;
		        }
		        String[] nbMot = phrase.trim().split("\\s+");
		        return nbMot.length;
		    }
		

	 public static String reverser(String motInverse) {
		    if (motInverse == null) {
		        return "";
		    }
		    return new StringBuilder(motInverse).reverse().toString();
		}

	 public static boolean palindromic(String mot) {
		    if (mot == null) {
		        return false;
		    }
		    String palindrome = reverser(mot);
		    return mot.equalsIgnoreCase(palindrome);
		}

}
