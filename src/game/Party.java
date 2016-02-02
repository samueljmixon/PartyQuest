
package game;

import java.util.*;

public class Party
{
	private ArrayList<Hero> myParty;
	private String name;
	
	public Party()
	{
		name = "unnamed party";
		myParty = new ArrayList<Hero>();
	}
	
	public Party(String aName)
	{
		name = aName;
		myParty = new ArrayList<Hero>();
	}
	
	public String getName()
	{
		return (name);
	}
	
	public String toString()
	{
		String toReturn = "Party: " + name;
		for (Hero h : myParty)
		{
			toReturn += "\n\t" + h.toString();
		}
		return (toReturn);
	}
	
	public void add(Hero aHero)
	{
		myParty.add(aHero);
	}
	
	public void remove(Hero aHero)
	{
		myParty.remove(aHero);
	}
	
	public ArrayList<Hero> getParty()
	{
		return (myParty);
	}
}
