import java.util.Random;

public class RPSLogic {

    private String CPUChoice(){
        String[] choices = {"rock", "paper", "scissors"};
        Random randNum = new Random();
        return choices[randNum.nextInt(3)];
    }

    public String playGame(String playerChoice){

        playerChoice = playerChoice.toLowerCase();
        String cpuChoice = CPUChoice();
        String result = "";

        if (cpuChoice.equals("rock")) {
            if (playerChoice.equals("rock")) {
                result = "You both chose rock, it's a draw.";
            } else if (playerChoice.equals("paper")) {
                result = "You win, paper beats rock";
            } else {
                result = "You lose, scissors beats rock";
            }
        }
        else if (cpuChoice.equals("paper")) {
            if (playerChoice.equals("paper")) {
                result = "You both chose paper, it's a draw.";
            } else if (playerChoice.equals("scissors")) {
                result = "You win, scissors beats paper";
            } else {
                result = "You lose, paper beats rock";
            }
        }
        else if (cpuChoice.equals("scissors")) {
            if (playerChoice.equals("scissors")) {
                result = "You both chose scissors, it's a draw.";
            } else if (playerChoice.equals("rock")) {
                System.out.printf("You win, rock beats scissors");
            } else {
                result = "You lose, scissors beats paper";
            }
        }
        return result;
    }
}
