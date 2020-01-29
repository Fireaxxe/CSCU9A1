import java.util.Scanner;
/**
 * The next project is based on the childhood game “Rock, Paper, Scissors”. In case you are not
familiar with this game, it is a two-player game in which each person simultaneously chooses
one of “rock”, “paper”, or “scissors”. Rock beats scissors but loses to paper, paper beats rock
but loses to scissors, and scissors beats paper but loses to rock.
 * 
 * @author Constantinos constantinou 
 * @version 04/11/2016)
 */

public class RockPaperScissors
{

    public static void main(String[] args) 

    {
        Scanner scanner = new Scanner(System.in);
        String player1Choice; //there is player 1
        String player2Choice; //there is player 2
        System.out.println("Enter move (Rock, Paper, Scissors)");
        player1Choice = scanner.next().toLowerCase();; //player 1 must chose rock, paper or scissors
        player2Choice = scanner.next().toLowerCase();; //player 2 must chose rock, paper or scissors

        if((player1Choice.equals("rock") || player1Choice.equals("paper") || player1Choice.equals("scissors")) && (player2Choice.equals("rock") || player2Choice.equals("paper") || player2Choice.equals("scissors")))
        {
            if(player1Choice.equals(player2Choice)) //if player1 chose the same with player 2 is a tie

            {
                System.out.println("It's a tie");
            }
            else
            {

                if(player2Choice.equals("rock") && player1Choice.equals("paper")) //if player 2 chose rock and player 1 chose paper then player 1 wins
                {
                    System.out.println("Player1 chose paper; Player2 chose rock");
                    System.out.println("Player 1 wins!");
                }

                if(player2Choice.equals("rock") && player1Choice.equals("scissors"))//if player 2 chose rock and player 1 chose scissors then player 2 wins

                {
                    System.out.println("Player1 chose scissors; Player2 chose rock");
                    System.out.println("Player 2 wins!");
                }

                if(player2Choice.equals("scissors") && player1Choice.equals("paper")) //if player 2 chose scissors and player 1 chose paper then player 2 wins
                {
                    System.out.println("Player1 chose paper; Player2 chose scissors");
                    System.out.println("Player 2 wins!");
                }
                if(player2Choice.equals("scissors") && player1Choice.equals("rock")) //if player 2 chose scissors and player 1 chose rock then player 1 wins
                {
                    System.out.println("Player1 chose rock; Player2 chose scissors");
                    System.out.println("Player 1 wins!");
                }
                if(player2Choice.equals("paper") && player1Choice.equals("rock")) //if player 2 chose paper and player 1 chose rock then player 2 wins
                {
                    System.out.println("Player1 chose rock; Player2 chose paper");
                    System.out.println("Player 2 wins!");
                }
                if(player2Choice.equals("paper") && player1Choice.equals("scissors")) //if player 2 chose paperrock and player 1 chose scissors then player 1 wins
                {
                    System.out.println("Player1 chose scissors; Player2 chose paper");
                    System.out.println("Player 1 wins!");
                }
            }
         
       }
         else 
            System.out.println("Please input a valid move"); //that means players insert a word exept "rock, paper or scissors" ex. chair


    }
}
