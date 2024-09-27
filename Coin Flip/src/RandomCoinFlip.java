import java.util.Scanner;

public class RandomCoinFlip
	{
		public static void main(String[] args)
		{
			Scanner userIntInput = new Scanner (System.in);
			
			System.out.println("Hello! How many times do you want to flip a coin?");
			int answer = userIntInput.nextInt();
			
			int heads = 0;
			int tails = 0;
			
			for (int i = 0; i <answer; i++)
				{
					int randomNumber =(int) (Math.random() *2);
					
					if (randomNumber == 0)
						{
							heads ++;
						}
					else if (randomNumber == 1)
						{
							tails ++;
						}
					else
						{
							
						}
				}
			
			if (heads == 1 && tails == 1)
				{
					System.out.println("You flipped heads " + heads + " time and tails " + tails + " time");
				}
			
			else if (heads == 1 && tails == 0)
				{
					System.out.println("You flipped heads " + heads + " time and tails " + tails + " times");
				}
			
			else if (heads == 0 && tails == 1)
				{
					System.out.println("You flipped heads " + heads + " times and tails " + tails + " time");
				}
			
			else if (heads > 1 && tails > 1)
				{
					System.out.println("You flipped heads " + heads + " times and tails " + tails + " times");
				}
			
			else
				{
					System.out.println("You flipped heads " + heads + " times and tails " + tails + " times");
				}
		}
	}
