package br.com.palindromo.teste;
import org.junit.Assert;
import org.junit.Test;

import br.com.palindromo.Palindromo;


public class TestePalindromo {

	@Test
	public void testeTrue() {
		Palindromo p = new Palindromo();
		String palindromo1 = "Arara arara";
		String palindromo2 = "Roma me tem amor";
		
		Assert.assertTrue(p.ehPalindromo(palindromo1));
		Assert.assertTrue(p.ehPalindromo(palindromo2));
	}
	
	@Test
	public void testeFalse() {
		Palindromo p = new Palindromo();
		String palindromo1 = "Não vai dar certo";
		String palindromo2 = "Espero nao dar certo";

		Assert.assertFalse(p.ehPalindromo(palindromo1));
		Assert.assertFalse(p.ehPalindromo(palindromo2));
		
	}
}
