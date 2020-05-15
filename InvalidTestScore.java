public class InvalidTestScore extends Exception{
    public static final String InvalidTestScore = "Scores cannot be negative or above 100";

    public String getMessage(){
        return "Scores cannot be negative or above 100";
    }
        
    
}