import java.util.Scanner;

public class cumlitiveProject1
{
	{
		public static void (main String[] args);
			{
				System.out.println("What is your name?");
				Scanner userInput = new Scanner(System.in);
				String name = userInput.nextLine();
				System.out.println("Hello, "+name+" roll a number,");
				int number1 = (int)(Math.random()*6)+ 1;
				
				int number2 = (int)(Math.random()*6)+1;
				
				int diceRoll = number1 + number2;
				System.out.println("You rolled a "+ number1+" and a "+number2+" for a total of "+diceRoll+", "+name);
					switch(diceRoll)
						{
						case 2:
						case 12:
							{
							System.out.println("lose, game over.");
							break;
							}
						case 7:
						case 11:
						{
						System.out.println("You win!");
						break;
						}
						default:

				{
				boolean stillPlaying = true;
				while (stillPlaying)
				{	
					System.out.println("Second Roll, type yes to continue.");
					Scanner userInput1 = new Scanner(System.in);
					String yes = userInput1.nextLine();
					int number3 = (int)(Math.random()*6)+ 1;
					int number4 = (int)(Math.random()*6)+1;
					int diceRoll2 = number3 + number4;
					System.out.println("You got a "+number3+" and a "+number4+" for a total of "+diceRoll2+", "+name+".");
				if(diceRoll2 == 7)
				{
					System.out.println("You lose"+name+".");
					stillPlaying = false;
				}
				if(diceRoll2== diceRoll)
				{
					System.out.println("Congradulations"+name+" ! You win!");
					stillPlaying =false;
				}
				}
				}
			}
			}
		}
}
