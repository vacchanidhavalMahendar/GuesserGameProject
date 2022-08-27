import java.util.Scanner;

class Guesser
{
    int guessNum;

    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);


        System.out.println("Guesser kindly guess the number");
        guessNum=scan.nextInt();
        return guessNum;

    }


}








