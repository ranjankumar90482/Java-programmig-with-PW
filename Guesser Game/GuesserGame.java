import java.util.*;

class Guesser {
    int guessNum;

    int guessingNum() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser! kindly Guess a number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class player {
    int guessNum;

    int guessingNum() {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly Guess a number");
        guessNum = scan.nextInt();
        return guessNum;
    }
    }

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNum();
    }

    void collectNumFromPlayer() {
        player p = new player();
        numFromPlayer1 = p.guessingNum();
        numFromPlayer2 = p.guessingNum();
        numFromPlayer3 = p.guessingNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2) {
                System.out.println("player1 and player2 are winner");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player1 and player3 are winner");
            } else {
                System.out.println("player1 is winner");
            }
        } else if (numFromGuesser == numFromPlayer2) {
            if (numFromGuesser == numFromPlayer3) {
                System.out.println("player2 and player3 are winner");
            } else {
                System.out.println("player3 is winner");
            }
        } else if (numFromGuesser == numFromPlayer3) {
            System.out.println("player3 is winner");
        } else {
            System.out.println("Dumb! all player lost the game");
        }
    }
}

public class GuesserGame{
    public static void main(String[] args){
    Umpire u=new Umpire();
    u.collectNumFromGuesser();
    u.collectNumFromPlayer();
    u.compare();

    }
}
