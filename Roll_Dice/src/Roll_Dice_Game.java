import java.util.Random;
//Create a game where the user will roll 6 die.
//They win if they roll a total of 20.
//If they roll a total of something other than 20, they lose.
//Let them know what they lost by.
//We will use conditionals and loops in this example.
public class Roll_Dice_Game {
    public static void main(String[] args) {
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 6;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i = 1; i<=maxRolls; i++){
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d.", i, die));

            if(currentSpace == lastSpace){
                System.out.print(String.format(" You have Won"));
                break;
            }
            else if(currentSpace < lastSpace){
                System.out.print(String.format(" You are currently on space %d, time for your next roll", currentSpace));
            }
            else{
                System.out.print(String.format(" Uh oh, Your score is greater than 20. You Lose."));
                break;
            }
            System.out.println();
        }
    }
}