import java.util.Random;
import java.util.*;
class GGame{
    int random;
    int userInput;
    int noOfGuesses=0;
    
    public int getNoOfGuesses() {
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses) {
    	this.noOfGuesses=noOfGuesses;
    }
    GGame(){
        Random rand=new Random();
         this.random=rand.nextInt(100);
        }
     void takeUserInput(){
    	 System.out.println("Guess the number ");
    	 Scanner sc=new Scanner(System.in);
            userInput=sc.nextInt();

    }
   
     boolean isCorrectNumber(){
         noOfGuesses++;
        if(userInput==random){
        System.out.format("YOU ARE CORRECT,It was %d \n you guessed in %d attempts. ",random, noOfGuesses);
        return true;   
    }
       
        else if(userInput<random){
            System.out.println("This is too small. ");
        }
        else if(userInput>random)
        {
            System.out.println("This is too big. ");
        }
        return false;
    }
    void played(){
if(noOfGuesses==1){
    System.out.println("Welldone.");
}
else if (noOfGuesses>1&&noOfGuesses<4){
    System.out.println("Well Played ");
}
else{
    System.out.println("Could have done better, Keep trying ");
}
    }

}
public class GuessTheNumber{
    public static void main(String[] args) {
        GGame guess=new GGame();
        boolean b=false;
        while(!b){
        guess.takeUserInput();
       b= guess.isCorrectNumber();
        }
        System.out.println();
        guess.played();
        
       
    
    }

}