import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to the game lobby\nplease choose game(1-3).");
            System.out.println("1.RPS");
            System.out.println("2.Under Construction");
            System.out.println("3.Under Construction");
            int userChoice = scan.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("Welcome to RPS");
                    boolean inRPS = true;
                    while(inRPS) {
                        RPSLogic game = new RPSLogic();
                        System.out.println("Please choose either \"rock\", \"paper\", or \"scissors\".");
                        System.out.println("Enter \"exit\" to return to lobby.");
                        String rpsChoice = scan.next();

                        if(rpsChoice.equals("exit")){break;}
                        else {System.out.println(game.playGame(rpsChoice)+ "\n");}
                    }
                    break;
                case 2:
                    System.out.println("Under Construction... returning to lobby\n");
                    break;
                case 3:
                    System.out.println("Under Construction... returning to lobby\n");
                    break;

            }
        }





    }
}
