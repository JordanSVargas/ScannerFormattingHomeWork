
    import java.util.Scanner;

    public class DeliveryCostCalculator {
        public static void main(String[] args) {

            // asking a user to input a product that will be input using a scanner in.
            System.out.println("Input the name of the product you wanna buy");
            Scanner scanner = new Scanner(System.in);
            String productName = scanner.nextLine();

            // returning productName and concatenating it to ask another question
            System.out.println("Input the amount of " + productName + " you wanna buy");
            int productAmount = scanner.nextInt();

            //asking a user to input the price of a product
            System.out.println("Input the price of a" + productName);
            double productPrice = scanner.nextDouble();


            // asking for user input of how far the delivery is
            System.out.println("Input how far the delivery is");
            int deliveryDistance = scanner.nextInt();
            double deliveryFee = 0;

            // creating if statements to calculate the delivery fee for each distance range
            if (deliveryDistance < 0) {
                System.out.println("Invalid Distance");
                System.exit(0);
            } else if (deliveryDistance <= 5) {
                deliveryFee = 2;
            } else if (deliveryDistance <= 15) {
                deliveryFee = 5;
            } else if (deliveryDistance <= 25) {
                deliveryFee = 10;
            } else if (deliveryDistance <= 50) {
                deliveryFee = 15;
            } else {
                deliveryFee = 20;
            }

            double total = (productAmount * productPrice) + deliveryFee;

            //google and some of my classmates helped me with this. the \t is to tab and the %.2f means that it will display 2 decimals to the right of the decimal point.
            String output = String.format("Product\tQty\tPrice\tMiles\tTotal\n%s\t%d\t%.2f\t%d\t\t%.2f", productName, productAmount, productPrice, deliveryDistance, total);
            System.out.println(output);
        }
    }
