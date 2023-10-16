import java.util.Scanner;
public class InterestApp{
    public static void main(String args[]){
        //Declare variables
        int numMonth;
        double numMoney, interest, total;

        //Declare objects
        Scanner keyboard;

        //Create objects
        keyboard = new Scanner(System.in);

        //Input
        System.out.print("Number of months: ");
        numMonth = keyboard.nextInt();
        System.out.print("The amount of money borrowed: ");
        numMoney = keyboard.nextDouble();

        //Process
        interest = (numMonth*numMoney*5)/100;
        total = interest+numMoney;

        //Output
        System.out.println(interest);
        System.out.println(total);
    }
 }