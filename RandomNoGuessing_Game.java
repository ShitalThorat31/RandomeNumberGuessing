package DatabaseConnectivity;

import java.util.Random;
import java.util.Scanner;

public class RandomNoGuess 
{

	public static void main(String[] args) 
	{
		int userNo, randomNo;
		int count = 4;

		//get input from user
	 
		Random rmd_No = new Random();
		randomNo = rmd_No.nextInt(5);
		System.out.println("Random Number: " +randomNo);

		while (count>1) 
		{
			 
				Scanner sc = new Scanner(System.in);
				System.out.println("\n\nEnter your guess");
				userNo = sc.nextInt();
	
				if (randomNo == userNo) 
			   {
					System.out.println("Congratulations..No is correct!!!!");
					System.exit(0);
				}
	
				else if (randomNo > userNo) 
				{
					System.out.println("U R almost there...Please enter higher than previous ");
	
				} 
				//else if(randomNo <userNo)  
				else
				{
					System.out.println("U R almost there...Please enter lower than previous ");	 
				}
			count--;
		}
		if(count>0)
		{
			System.out.println("\n\nSorry....No more chance..count exceeded");
			System.exit(0);
		}

	}

}
