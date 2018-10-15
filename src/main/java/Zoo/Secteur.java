package Zoo;
import java.util.List;

import Animaux.Animal;

public class Secteur 
{
	private String typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur; 
	
	public Secteur()
	{
		
	}
	
	public void ajouterAnimal(Animal new_animal)
	{
		animauxDansSecteur.add(new_animal);
	}
	
	public int getNombreAnimaux()
	{
		return animauxDansSecteur.size();
	}
	
	public String obtenirType()
	{
		return typeAnimauxDansSecteur;
	}

}
