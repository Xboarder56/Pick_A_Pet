/**
 * Pick_A_Pet.java
 * @author Garrett J. Beasley
 * 10/01/2014
 * Draws a House Picture
 */

//Imports for the program.

import acm.program.ConsoleProgram;


public class Pick_A_Pet extends ConsoleProgram
{
	
	public void run()
	{
		/**Set the size of the applet*/
		setSize(500,400);
		
		/**Gathers the inputs from the user and stores them in a variable*/
		String name = readLine("Enter your name:");
		String gender = readLine("Enter your gender, "+name+":");
		int age = readInt("Enter your age, "+name+" "+gender+":");
		
		/**Checks the age if they are under 10 or over 80*/
		if (age <10 || age >80)
		{
			print("You should get a fish, "+name+"!");
		}
		
		/**Checks the age if they are under equal to or greater then 10 or less then or equal to 20*/
		if (age >=10 && age <=20)
		{
			if (gender.equalsIgnoreCase("male"))
			{
				print("You should get a Turtle, "+name+"!");
			}
			else if (gender.equalsIgnoreCase("female")) 
			{
				print("You should get a frog, "+name+"!");
			}
			
		}
		
		/**Checks the age if they are under equal to or greater then 21 or less then or equal to 50*/
		else if (age >=21 && age <=50)
		{
			if (gender.equalsIgnoreCase("male"))
			{
				print("You should get a bulldog, "+name+"!");
			}
			else if (gender.equalsIgnoreCase("female")) 
			{
				print("You should get a alpaca, "+name+"!");
			}
			
		}
		
		/**Checks the age if they are under equal to or greater then 51 or less then or equal to 80*/
		else if (age >=51 && age <=80)
		{
			if (gender.equalsIgnoreCase("male"))
			{
				print("You should get a iguana, "+name+"!");
			}
			else if (gender.equalsIgnoreCase("female")) 
			{
				print("You should get a lizard, "+name+"!");
			}
			
		}


		
		
		
	}

}

