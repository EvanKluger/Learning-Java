import java.util.Scanner;
public class FillInBlanks2 {
    public static void main(String[] args){
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Ready for Some Riddles. Answer one word answers for all");

        System.out.println("What is there one of in every corner and two of in every room");
        String answer_1 = scanner2.next();
        System.out.println("What is it that given one, you’ll have either two or none");
        String answer_2 = scanner2.next();
        System.out.println("What is stronger than steel but can’t handle the sun");
        String answer_3 = scanner2.next();

        scanner2.close();
        String answer_1_c = "O";
        String answer_2_c = "Choice";
        String answer_3_c = "Ice";

        if(answer_1.equals(answer_1_c)){
            System.out.println("First Riddle: Correct");
        }
        if(answer_2.equals(answer_2_c)){
            System.out.println("Second Riddle: Correct");
        }
        if(answer_3.equals(answer_3_c)){
            System.out.println("Third Riddle: Correct");
        }
    }
}
