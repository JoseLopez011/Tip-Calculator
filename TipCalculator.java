
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
    
public class TipCalculator {
    public static void main(String[] args) {
        //Introduce the program
        System.out.println("Tip calculator  ");
         System.out.println();
         
        Scanner sc = new Scanner(System.in);
        
        //Perform Tip calculations choice is "y" or "Y"
        String choice = "y";
        double tip,tip2,tip3;
        double tipPercentage = 15;
        double tipPercentage2 = 20;
        double tipPercentage3 = 25;
        double total,total2,total3;

        while (choice.equalsIgnoreCase("y")){
            //get cost of meal from user
            System.out.println("Cost of Meal: ");
            double cost = sc.nextDouble();
            //get tip amount for 15% and total amount plus tip
            String message = "15%";
            System.out.print(message);
            System.out.println();
            tip = cost * (tipPercentage/100);
            tip = new BigDecimal(tip).setScale(2,RoundingMode.HALF_UP).doubleValue();
            total = cost + tip;
            total = new BigDecimal(total).setScale(2,RoundingMode.HALF_UP).doubleValue();
            System.out.println("Tip amount: $" + tip);
            System.out.println("Total amount: $" + total);
            //get tip amount for 20% and get total amount with the tip
            String message2 = "20%";
            System.out.print(message2);
            System.out.println();
            tip2 = cost * (tipPercentage2/100);
            tip2 = new BigDecimal(tip2).setScale(2,RoundingMode.HALF_UP).doubleValue();
            total2 = cost + tip2;
            total2 = new BigDecimal(total2).setScale(2,RoundingMode.HALF_UP).doubleValue();
            System.out.println("Tip amount: $" + tip2);
            System.out.println("Total amount $" + total2);
            //Get tip amount for 25% and get total amount with the tip
            String message3 = "25%";
            System.out.print(message3);
            System.out.println();
            tip3 = cost * (tipPercentage3/100);
            tip3 = new BigDecimal(tip3).setScale(2,RoundingMode.HALF_UP).doubleValue();
            total3 = cost + tip3;
            total3 = new BigDecimal(total3).setScale(2,RoundingMode.HALF_UP).doubleValue();
            System.out.println("Tip amount: $" + tip3);
            System.out.println("Total amount $" + total3);
            //see if user wants to continue
            System.out.print("Continue? (y/n):");
            System.out.println();
            choice = sc.next();
                                
                    
           
         }
        }
}