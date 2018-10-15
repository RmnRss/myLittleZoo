package Zoo;

import java.util.List;

public class Zoo 
{
	private int visiteurs;
	
	private List<Secteur> secteursAnimaux;
	
	public Zoo() 
	{
		
	}
	
	public void nouveauVisiteur()
	{
		visiteurs++;
	}
	
	public int getLimiteVisiteur() 
	{
		return 50;
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
