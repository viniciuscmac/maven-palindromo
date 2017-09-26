package br.com.palindromo;

public class Palindromo {
	  public boolean ehPalindromo(String frase) {
	    String fraseFiltrada;
	    fraseFiltrada = frase.toUpperCase().replace(" ", "").replace("-", "");
	    for(int i = 0; i < fraseFiltrada.length()/2; i++) {
	    	
	      if(fraseFiltrada.charAt(i) != fraseFiltrada.charAt((fraseFiltrada.length() -1 ) - i)) {
	        return false;
	      }
	      
	    }
	    return true;
	  }
	}