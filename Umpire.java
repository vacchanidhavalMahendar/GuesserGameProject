class Umpire<numFromGuesser>
{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    int numFromPlayer4;
    int numFromPlayer5;
    int numFromPlayer6;
    int numFromPlayer7;


    public void collectNumFromGuesser()
    {
        Guesser g=new Guesser();
        numFromGuesser=g.guessNumber();

    }


    public void collectNumFromPlayer()
    {
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        Player p4=new Player();
        Player p5=new Player();
        Player p6=new Player();
        Player p7=new Player();

        numFromPlayer1=p1.guessNumber();
        numFromPlayer2=p2.guessNumber();
        numFromPlayer3=p3.guessNumber();
        numFromPlayer4=p4.guessNumber();
        numFromPlayer5=p5.guessNumber();
        numFromPlayer6=p6.guessNumber();
        numFromPlayer7=p7.guessNumber();
    }

    void compare() {

        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("Game tied all three players guessed correctly");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("Player 1 and Player2 won the game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 1 and Player3 won ");
            } else {

                System.out.println("Player 1 won the game");
            }
        }

        else if (numFromGuesser == numFromPlayer2) {

            if (numFromGuesser == numFromPlayer3) {
                System.out.println("Player 2 and Player3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }
        }

        else if (numFromGuesser == numFromPlayer3) {
            System.out.println("Player 3 won the game");
        } else {
            System.out.println("Game lost! try again");
        }


          if(numFromGuesser==numFromPlayer4)
    {
        if (numFromGuesser == numFromPlayer5 && numFromGuesser == numFromPlayer6) {
            System.out.println("Game tied all three players guessed correctly");
        } else if (numFromGuesser == numFromPlayer5) {
            System.out.println("Player 5 and Player6 won the game");
        } else if (numFromGuesser == numFromPlayer6) {
            System.out.println("Player 4 and Player5 won ");
        } else {

            System.out.println("Player 4 won the game");
        }
    }
        if(numFromGuesser==numFromPlayer5)
        {
            if (numFromGuesser == numFromPlayer6 && numFromGuesser == numFromPlayer7) {
                System.out.println("Game tied all three players guessed correctly");
            } else if (numFromGuesser == numFromPlayer6) {
                System.out.println("Player 6 and Player7 won the game");
            } else if (numFromGuesser == numFromPlayer6) {
                System.out.println("Player 5 and Player7 won ");
            } else {

                System.out.println("Player 5 won the game");
            }
        }


    }

}