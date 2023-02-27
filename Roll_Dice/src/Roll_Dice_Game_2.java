//Create a game where the user will roll 4 die.
//They win if they all are the same.
//They lose if not
import java.util.Random;
public class Roll_Dice_Game_2 {
    public static void main(String[] args) {
        Random random2 = new Random();
        double win = 0D;
        double lose = 0D;
        double total_games = 1000D;
        for(int i =0; i<total_games; i++) {
            int firstDie = random2.nextInt(6) + 1;
            int secondDie = random2.nextInt(6) + 1;
            int thirdDie = random2.nextInt(6) + 1;
            int fourthDie = random2.nextInt(6) + 1;
            //System.out.println("You got:");
            //System.out.print(String.format("First roll: #%d: %n", firstDie));
            //System.out.print(String.format("Second roll: #%d: %n", secondDie));
            //System.out.print(String.format("Third roll: #%d: %n", thirdDie));
            //System.out.print(String.format("Fourth roll: #%d: %n", fourthDie));

            if ((firstDie == secondDie) && (secondDie == thirdDie) && (thirdDie == fourthDie)) {
                //System.out.print(String.format("You Win %n"));
                win = win + 1;
            }
            else {
                //System.out.print(String.format("You Lose %n"));
                lose = lose + 1;
            }
            double win_percentage = win/total_games;
            System.out.println("Stats:");
            System.out.print(String.format("Wins: %f: %n", win));
            System.out.print(String.format("Loses: %f: %n", lose));
            System.out.print(String.format("Win Percentage: #%f: %n", win_percentage));


        }

    }
}
