package Animaux;

public class Animal 
{
	private String nomAnimal;
	private String typeAnimal;
	
	public Animal(String nom, String type) 
	{
		this.nomAnimal = nom;
		this.typeAnimal = type;
	}
	
	public String getNomAnimal() 
	{
		return nomAnimal;
	}
	
	public String getTypeAnimal() 
	{
		return typeAnimal;
	}

}
