import java.util.Scanner;
public class FillInBlanks {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lets Play a Game");
        System.out.println("Enter A Color");
        String color = scanner.next();

        System.out.println("Enter a Sport");
        String sport = scanner.next();

        System.out.println("Enter a whole number less than 10");
        int number = scanner.nextInt();

        scanner.close();

        System.out.println("You have won " + number + " " + color + " " + sport
                + " jerseys");
    }
}
