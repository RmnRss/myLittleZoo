package Zoo;

import java.util.ArrayList;
import java.util.List;

import Animaux.Animal;
import Exception.AnimalDansMauvaisSecteurException;
import Exception.LimiteVisiteursException;

public class Zoo 
{
	private int visiteurs;
	private List<Secteur> secteursAnimaux = new ArrayList<Secteur>();
	
	// Constructeur par défaut créer un zoo avec un secteur d'ours
	public Zoo() 
	{
		this.visiteurs = 0;
		this.secteursAnimaux.add(new Secteur("Ours"));
	}
	
	public void nouveauVisiteur() throws LimiteVisiteursException
	{
		int maxVisiteurs = secteursAnimaux.size()*15;
		
		if (visiteurs >= maxVisiteurs) 
		{
			throw new LimiteVisiteursException("Plus de place dans le Zoo !");
		} 
		else 
		{
			visiteurs++;
		}
	}
	
	public int getLimiteVisiteur() 
	{
		return secteursAnimaux.size()*15;
	}
	
	public void nouvelAnimal() throws AnimalDansMauvaisSecteurException
	{
		this.secteursAnimaux.get(0).ajouterAnimal(new Animal("Michel", "Ours"));
	}
	
	public int nombreAnimaux()
	{
		int nbr_animaux = 0;
		
		for (int i = 0; i < secteursAnimaux.size(); i++)
		{
			nbr_animaux += secteursAnimaux.get(i).getNombreAnimaux();
		}
		
		return nbr_animaux;
	}
}
