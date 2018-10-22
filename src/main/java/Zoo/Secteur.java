package Zoo;
import java.util.ArrayList;
import java.util.List;

import Animaux.Animal;
import Animaux.Ours;
import Exception.AnimalDansMauvaisSecteurException;

public class Secteur 
{
	private String typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur = new ArrayList<Animal>();
	
	public Secteur(String typeAnimauxSecteur)
	{
		this.typeAnimauxDansSecteur = typeAnimauxSecteur;
		animauxDansSecteur.add(new Ours("Winny"));
	}
	
	public void ajouterAnimal(Animal new_animal) throws AnimalDansMauvaisSecteurException
	{
		if (this.obtenirType() != new_animal.getTypeAnimal()) 
		{
			throw new AnimalDansMauvaisSecteurException("Impossible ! Mauvais type d'animal.");
		}
		else
		{
			animauxDansSecteur.add(new_animal);
		}
	}
	
	public int getNombreAnimaux()
	{
		return animauxDansSecteur.size();
	}
	
	public String obtenirType()
	{
		return typeAnimauxDansSecteur;
	}
	
	public void setTypeAnimaux(String typeSecteur)
	{
		this.typeAnimauxDansSecteur = typeSecteur;
	}

}
