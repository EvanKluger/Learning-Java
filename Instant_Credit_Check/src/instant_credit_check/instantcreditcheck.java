package instant_credit_check;

import java.util.Scanner;

public class instantcreditcheck{
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        boolean qualified = isUserQualified(creditScore, salary);
        notifyUser(qualified);
    }
    public static boolean isUserQualified(int creditScore,
                                          double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(creditScore>=requiredCreditScore &&
                salary >= requiredSalary){
            return true;
        }
        else {
            return false;
        }
    }
    public static void notifyUser(boolean isQualified) {
        if(isQualified){
            System.out.println("Congrats, you've qualified!");
        }
        else {
            System.out.println("Sorry, declined!");
        }
    }
}