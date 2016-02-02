
package game;

public class Hero
{
	private String name;
	private int attack;
	private int defense;
	
	public Hero()
	{
		name = "unnamed";
		attack = 100;
		defense = 100;
	}
	
	public Hero(String aName, int anAttack, int aDefense)
	{
		name = aName;
		attack = anAttack;
		defense = aDefense;
	}
	
	public String getName()
	{
		return (name);
	}
	
	public int getAttack()
	{
		return (attack);
	}
	
	public int getDefense()
	{
		return (defense);
	}
	
	public void setName(String aName)
	{
		name = aName;
	}
	
	public void setAttack(int anAttack)
	{
		attack = anAttack;
	}
	
	public void setDefense(int aDefense)
	{
		defense = aDefense;
	}
	
	public double launchAttack()
	{
		return (Math.random() * attack);
	}
	
	public String toString()
	{
		return (name + "\tatk:\t" + attack + "\tdef:\t" + defense);
	}
}
