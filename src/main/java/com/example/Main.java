package com.example;

public class Main {
	  public static void main(String[] args) {
		  // afficher une phrase avec le nb de lettre dans cette phrase
	        System.out.println("La fonctionnalité 'wordsCount' compte: " + Fonctionnalites.wordsCount("As you walk on the way, the way appears") + " mots"); 
	        // afficher le mot à l'envers
	        System.out.println("La fonctionnalité 'reverser' permet d'obtenir " + Fonctionnalites.reverser("hello")); 
	       // afficher si palindrome vrai ou pas
	        System.out.println("La fonctionnalité 'palindromic' est " + Fonctionnalites.palindromic("radar"));
	    }
	 
}
	
