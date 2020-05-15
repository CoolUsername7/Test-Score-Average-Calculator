/**
TestScores Class
* This class takes an integer array of test scores
* as its argument and determines their average
* If any of the scores are negative or greater than 100
* an IllegalArgumentException will be thrown

@author Justin Delgado
*/

public class TestScores{
   public static int sum = 0;

      public void TestScores()
      {

      }

 /**@param scores The array of test scores */
      public void TestScores(int [] scores)
      {

      }
 /**@param scores The array of test scores
   *This method calculates the average of all test scores in the array by taking
   *the sum of all scores and dividing it by the total number of scores.
   *
   *If any score in the array is greater than 100 or a negative number, an IllegalArgumentException will be thrown
 */
      public void average (int [] scores)
      {
          for(int i = 0; i < scores.length; i++)
          {
              sum+= scores[i];

              try{

                  if(scores[i] > 100 || scores[i] < 0)
                  {
                      throw new IllegalArgumentException();
                  }

              }

              catch(IllegalArgumentException e)
              {
                  System.out.println("Scores cannot be negative or above 100");
                  System.exit(0);
              }
          }
  		System.out.println("Average:" + sum/scores.length);
      }
}