package test;

import org.junit.Test;

import Exception.AnimalDansMauvaisSecteurException;
import Zoo.Zoo;

public class TestTypeAnimal 
{

	@Test(expected = AnimalDansMauvaisSecteurException.class)
	public void testLimiteAnimalDansMauvaisSecteur() throws AnimalDansMauvaisSecteurException
	{
		Zoo testZoo = new Zoo();
		
		testZoo.nouvelAnimal("Le Papa","Pingouin");
	}
}
