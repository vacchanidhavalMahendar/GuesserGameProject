import java.util.Scanner;

class Player
{
    int pguessNum;

    public int guessNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Player kindly guess the number");
        pguessNum=scan.nextInt();
        return pguessNum;
    }
}