import java.util.Random ; 
import java.util.Scanner ; 
public class Rock_Paper_Scissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int playerWins = 0;
        int computerWins = 0;
        int tie = 0;

        System.out.println(" |-|-|---ROCK---PAPER---SCISSORS---|-|-|");
        for(int i=0; i < 5; i++){
            System.out.println("1 = Rock\n2 = Paper\n3 = Scissor\nNow enter what you want to Choose");
            int a = sc.nextInt();

            if(a==1){
                System.out.println("You chose ROCK");
            }
            else if(a==2){
                System.out.println("You chose PAPER");
            }
            else if(a==3){
                System.out.println("You chose SCISSOR");
            } else {
                System.out.println("Invalid Choice, Try Again");
                i--;
                continue;
            }

            Random rand = new Random();
            int b = rand.nextInt(1,4);

            switch(b){
                case 1 -> System.out.println("Computer chose ROCK");
                case 2 -> System.out.println("Computer chose PAPER");
                case 3 -> System.out.println("Computer chose SCISSOR");
            }

            if (a == b){
                System.out.println("It's a Tie ");
                tie++;
            } else if((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)){
                System.out.println("YOU WIN this round");
                playerWins++;
            } else {
                System.out.println("YOU LOSE this round ");
                computerWins++;
            }
        }
        System.out.println("                   ");

        System.out.println("|||-------F I N A L   R E S U L T-------|||");        
        System.out.println("                   ");
        System.out.println("Player Wins: " + playerWins);
        System.out.println("Computer Wins: " + computerWins);
        System.out.println("Number of ties: " + tie );

        if (playerWins > computerWins) {
            System.out.println("CONGRATULATIONS!!!, YOU ARE THE OVERALL WINNER");
        } else if (playerWins < computerWins){
            System.out.println("OOPSS!! COMPUTER IS THE OVERALL WINNER");
        } else {
            System.out.println("OVERALL, IT'S A TIE");
        }
    }
}    

