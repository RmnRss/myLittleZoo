package test;

import org.junit.Test;

import Exception.LimiteVisiteursException;
import Zoo.Zoo;

public class TestNombreVisiteur 
{

	@Test(expected = LimiteVisiteursException.class)
	public void testLimiteException() throws LimiteVisiteursException
	{
		Zoo testZoo = new Zoo();
		
		for (int i = 0; i < 25 ; i++) 
		{
			testZoo.nouveauVisiteur();
		}
	}
}
