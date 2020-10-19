
import java.util.Scanner;
import acm.program.*;
import java.util.*;

public class uniqueNames extends ConsoleProgram {
	
	public void run()
	{
		//create hashmap to hold names and the counts of them
		HashMap<String, Integer> nameCount = new HashMap<String, Integer>();
		countNames(nameCount);
	}
	
	static void countNames(Map<String,Integer> map)
	{
		//scanner to get input
		Scanner input = new Scanner(System.in);
		Integer count;
		//loops until nothing is given as an input
		while (true)
		{
			System.out.println("Enter name: ");
			String nameInput = input.nextLine();
			if(nameInput.isEmpty())
			{
				break;
			}
			//checks if our map has any instances of the name. if not, sets it equal to 1. if it does, increases count.
			count = map.get(nameInput);
			if(count == null) 
			{
				count = 1;
			}
			else
			{
				count++;
			}
			map.put(nameInput, count);
		}
		//iterator to go through our hashmap abstractly by the string values, in our case names
		Iterator<String> i = map.keySet().iterator();
		while(i.hasNext())
		{
			//gets the names and the counts of them
			String name = i.next();
			int nameCount = map.get(name);
			System.out.println("Entry [" + name + "] has count " + nameCount);
		}
	}
}
