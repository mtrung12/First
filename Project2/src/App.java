import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String cmd = "a";
        Scanner sc = new Scanner(System.in);
        while (!cmd.equalsIgnoreCase("Stop")) {
            System.out.print("Enter the name of the coffee: ");
            String name = sc.nextLine();
            System.out.print("Enter the price of the coffee: ");
            int price = sc.nextInt();
            System.out.print("Enter the quantity of the coffee: ");
            double quantity = sc.nextDouble();
            CoffeeBill b1 = new CoffeeBill(name, price, quantity);
            b1.printBill();
            System.out.println("\nEnter the quantity you want to check: ");
            double q = sc.nextDouble();
            if (b1.CheckQuantity(q))
                System.out.println("We have enough Quantity");
            else
                System.out.println("We don't have enough Quantity");
            System.out.println("Enter the bill you want to check: ");
            double bill = sc.nextDouble();
            if (b1.CheckBill(bill))
                System.out.println("Bill exceeds " + bill + ".");
            else
                System.out.println("Bill doesn't exceed " + bill + ".");

            System.out.println("Do you want to continue? (Stop to stop)");
            String abc = sc.nextLine(); // Consume the newline character
            String c = sc.nextLine(); // Read the next line
            cmd = c;
            abc = null;
        }
        System.out.println("");
    }
}
