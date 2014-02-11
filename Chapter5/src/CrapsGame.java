
import java.util.Random;

// Tyler Coatsworth 11/3/2013

public class CrapsGame {
    public static void main(String[] args) {
        int die1 = rollDie();
        int die2 = rollDie();
        int dieSum = die1 + die2;
        
        if (dieSum == 2 || dieSum == 3 || dieSum == 12)
            System.out.println("You rolled craps: " + die1 + " + " + die2 + " = " + dieSum + "   You have lost...");
        else if (dieSum == 7 || dieSum == 11)
                System.out.println("You rolled natural: " + die1 + " + " + die2 + " = " + dieSum + "   You have won!");
        else{
            System.out.println("You have rolled: " + die1 + " + " + die2 + " = " + dieSum);
            int point = dieSum;
            System.out.println("Point set to: " + point);
            int newDie1;
            int newDie2;
            int newDieSum;
            System.out.println("*Rerolling*");
    do {
       newDie1 = rollDie();
         newDie2 = rollDie();
           newDieSum = newDie1 + newDie2;
            System.out.println("(" + newDie1 + " + " + newDie2 + " = " + newDieSum + ") ");
            if(newDieSum != 7 && newDieSum != point){
                System.out.print("*Rerolling*");}
    } while (newDieSum != 7 && newDieSum != point);
            
            if (newDieSum == 7)
                System.out.println("Point: " + point + " This roll: " + newDie1 + " + " + newDie2 + " = " + newDieSum + "   You Lose...");
            else if (newDieSum == point)
                System.out.println("Point: " + point + " This roll: " + newDie1 + " + " + newDie2 + " = " + newDieSum + "   You're a winner!");
            else 
                System.out.println("Something tells me you shouldn't be seeing this; Whoops! Unfortunately an unexpected error has occured :( ");                 
                }
        
            }  // end of the main method
        
    public static int rollDie(){
   Random roll = new Random();
       int dice = 1 + roll.nextInt ( 6 );
            return dice;
    }
    
}