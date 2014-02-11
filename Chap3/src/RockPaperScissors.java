
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int computerPlayer = (int) (Math.random() * 3);

        Scanner player1 = new Scanner(System.in);
        System.out.println("Choose: Scissor(0), Rock (1), Paper (2): ");
        int playerChoice; playerChoice = player1.nextInt();

     /*   if (playerChoice > 2 || playerChoice < 0);{
        System.out.println("Please choose a valid choice.");
        }
     */ 
        
      //=====================================================
        String C1 = "The computer is rock. ";
        String C2 = "The computer is paper. ";
        String C0 = "The computer is scissors. ";

        String Y1 = "You are rock. ";
        String Y2 = "You are paper. ";
        String Y0 = "You are scissors. ";

        String D = "It is a draw. ";
        String W = "You won. ";
        String L = "You lost. ";
      //=====================================================   
       /* if (computerPlayer == playerChoice) {
            System.out.println("It is a draw.");
        } */       
     //======================================================   
        
        if (computerPlayer == 0 && playerChoice == 0) {
            System.out.println(C0 + Y0 + D);
        }        
        else if (computerPlayer == 0 && playerChoice == 1) {
            System.out.println(C0 + Y1 + W);
        }
        else if (computerPlayer == 0 && playerChoice == 2) {
            System.out.println(C0 + Y2 + L);
     //-------------------------------------------------------       
        }
        else if (computerPlayer == 1 && playerChoice == 0) {
            System.out.println(C1 + Y0 + L);
        }
        else if (computerPlayer == 1 && playerChoice == 1) {
            System.out.println(C1 + Y1 + D);
        }
        else if (computerPlayer == 1 && playerChoice == 2) {
            System.out.println(C1 + Y2 + W);
        }
     //--------------------------------------------------------
        else if (computerPlayer == 2 && playerChoice == 0) {
            System.out.println(C2 + Y0 + W);
        }
        else if (computerPlayer == 2 && playerChoice == 1) {
            System.out.println(C2 + Y1 + L);
        }
        else if (computerPlayer == 2 && playerChoice == 2) {
            System.out.println(C2 + Y2 + D);
        }
        else{
            System.out.println("Please enter a valid choice");
        }
            
    } // end of the main method
}
