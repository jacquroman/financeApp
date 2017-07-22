import java.util.Scanner;

public class MoneyCalculator {

    public static void main(String[] args) {

        //money rule 50% to
        Scanner in = new Scanner(System.in);
        // TODO Auto-generated method stub
        System.out.println("Please enter your hourly wage");
        String hourWage = in.nextLine();
        double dollar = Double.parseDouble(hourWage);
        generalCalc(dollar, 9);

//        System.out.println(
//                "Would you like a general calculation (40 hr/week) or personalized?");
//        System.out.println("A) general");
//        System.out.println("B) general");
//        String choice = in.nextLine();

    }

//    //Checks if selection is valid based on question number
//    public static boolean validChoice(String choice, String questionNum) {
//        boolean valid = true;
//
//        return true;
//    }

    //calculates income based on general tax rules and 40 hr work week with an hourly wage
    public static double generalCalc(double dollar, int numOfWeeks) {
        double hours = dollar * 40.0 * numOfWeeks;
        double afterTaxes = hours * .7;
        save(afterTaxes);
        necessities(afterTaxes);
        fun(afterTaxes);

        return dollar;
    }

    //Returns dollar value of income needed to save based on 20% rule
    public static void save(double dollar) {
        dollar *= (.2);
        invest(dollar);
        System.out.print("Amount to save ");
        System.out.printf("%.2f", dollar);
        System.out.println();
    }

    //Returns dollar value of recommended amount to invest based on 20% saved
    public static void invest(double dollar) {
        System.out.print("Amount to invest ");
        System.out.printf("%.2f", dollar * (.5));
        System.out.println();
    }

    //Returns dollar value of money that goes towards necessity spending (ie) rent) 50% of original income
    public static void necessities(double dollar) {
        System.out.print("Amount for necessities ");
        System.out.printf("%.2f", dollar * (.5));
        System.out.println();
    }

    //Returns dollar value of money that can be used for fun activities (30% of original income)
    public static void fun(double dollar) {
        System.out.print("Amount for fun ");
        System.out.printf("%.2f", dollar * (.3));
        System.out.println();
    }

}
