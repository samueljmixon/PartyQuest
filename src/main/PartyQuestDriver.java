
package main;

import game.*;

public class PartyQuestDriver
{
	public static void main(String[] args)
	{
		Party ourParty = new Party("Fueders");
		ourParty.add(new Hero("Knight  ", 150, 50));
		ourParty.add(new Hero("Witch   ", 50, 150));
		ourParty.add(new Hero("Princess", 100, 100));
		System.out.println(ourParty);
		Event event1 = new Event(100, 150);
		System.out.println("\n" + event1);
		while (ourParty.getParty().size() > 0 && event1.getDefense() > 0)
		{
			System.out.println("\n...running event1...\n");
			event1.runEvent(ourParty);
			System.out.println(ourParty);
			System.out.println("\n" + event1);
		}
		if (ourParty.getParty().size() > 0)
		{
			System.out.println("Heroes win!");
		}
		else
		{
			System.out.println("Heroes lose :(");
		}
	}
}
