package Zoo;

import java.util.List;

public class Zoo 
{
	private int visiteurs;
	private List<Secteur> secteursAnimaux;
	
	public Zoo() 
	{
		this.visiteurs = 0;
	}
	
	public void nouveauVisiteur()
	{
		int maxVisiteurs = secteursAnimaux.size()*15;
		
		if (visiteurs >= maxVisiteurs) 
		{
			Exception LimiteVisiteursException;
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
	
	public void nouvelAnimal()
	{
		
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
