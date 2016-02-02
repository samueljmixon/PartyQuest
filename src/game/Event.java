
package game;

import java.util.*;

public class Event
{
	private int attack;
	private int defense;
	
	public Event()
	{
		attack = 100;
		defense = 100;
	}
	
	public Event(int anAttack, int aDefense)
	{
		attack = anAttack;
		defense = aDefense;
	}
	
	public int getAttack()
	{
		return (attack);
	}
	
	public int getDefense()
	{
		return (defense);
	}
	
	public void setDefense(int aDefense)
	{
		defense = aDefense;
	}
	
	public double launchAttack()
	{
		return (Math.random() * attack);
	}
	
	public void runEvent(Party aParty)
	{
		ArrayList<Hero> deadHeroes = new ArrayList<Hero>();
		for (Hero h : aParty.getParty())
		{
			this.setDefense((int) (this.getDefense() - h.launchAttack()));
			h.setDefense((int) (h.getDefense() - this.launchAttack()));
			if (h.getDefense() < 0)
			{
				deadHeroes.add(h);
			}
		}
		for (Hero h : deadHeroes)
		{
			aParty.remove(h);
		}
	}
	
	public String toString()
	{
		return ("Event\tatk:\t" + attack + "\tdef:\t" + defense);
	}
}
