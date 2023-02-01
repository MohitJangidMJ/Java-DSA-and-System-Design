package String;
import java.util.Scanner;
import java.utill.*;
class Guesser
{
    int guessNum;
    guessing Number()
    {
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Gusser Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
}
class player 
{
    int guessNum;
   int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("player! Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;

    }
}
class Umpire
{
    int numFromGusser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGuesser()
    {
  Guesser g=new Guesser();
  numFromGusser=g.guessingNumber();
    }
 collectNumFromPlayers()
 {
     Player p1=new player();
     Player p2=new player();
     Player p3=new player();
     numFromPlayer1=p1.guessingNumber();
     numFromPlayer2=p2.guessingNumber();
     numFromPlayer3=p3.guessingNumber();
 }
void compare()
{
    if(numFromGusser==numFromPlayer1)
    {
        System.out.println("player1 Won the game");
    }
    else if(numFromGusser==numFromPlayer2)
    {
        System.out.println("Player2 Won the game");
    }
    else if(numFromGuesser==numFromPlayer3)
    {
        System.out.println("Player3 Won the game");
    }
     else 
     {
        System.out.println("sab ka sab ghalat hain App hargaye!!");
     }
}
}



public class launch
 {
    public static void main(string []args)
{
    System.out.println("")
}
        
    }
    

