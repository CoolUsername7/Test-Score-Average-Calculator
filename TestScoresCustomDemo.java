/**
* TestScoresCustomDemo Class
* This class demonstrates the usage of the TestScoresCustom class by allowing
* A user to input 5 test grades and calculating the average
* A custom InvalidTestScore exception is thrown if any of the scores are greater than 100 or negative.
*
*@author Justin Delgado
*/

import java.util.Scanner;

public class TestScoresCustomDemo{
    public static void main(String [] args){

TestScoresCustom test = new TestScoresCustom();

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