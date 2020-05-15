/**
* TestScoresDemo Class
* This class demonstrates the usage of the TestScores class by allowing
* A user to input 5 test grades and calculating the average
* An IllegalArgumentException is thrown if any of the scores are greater than 100 or negative.
*
*@author Justin Delgado
*/

import java.util.Scanner;

public class TestScoresDemo{
    public static void main(String [] args){

TestScores test = new TestScores();

Scanner keyboard = new Scanner(System.in);

int[] scores = new int[5];

System.out.println("Enter 5 grades:");
for(int i = 0; i < scores.length; i++)
{
	scores[i] = keyboard.nextInt();
}

test.average(scores);

    }//end main
}//end class