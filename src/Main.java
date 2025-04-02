
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      Parking class inherit
        Parking obj_1 = new Parking();
        Scanner input = new Scanner(System.in);
        DecimalFormat format_decimal = new DecimalFormat("0.00");
        int choice_1, choice_2, time, price;
//        Vehicle parking system implement interface
        vehicle_parking_implement obj_2 = new vehicle_parking_implement();
//        variable assignment value
        String type, number_2;
        int number_1;
//        Exchange currency riel to dollars
        double price_dollars = 4100;
//
//        Loop condition choice
        while (true) {
            System.out.println("\nWelcome to Parking System");
            System.out.println("1. Parking Entry");
            System.out.println("2. Parking Exit");
            System.out.println("3. Exit System");
            System.out.print("\nEnter your choice: ");
            choice_1 = input.nextInt();
//      Entry parking  of user
            if (choice_1 == 1) {
                System.out.println("\nWelcome to entry parking");
                System.out.println("1.Car Parking Entry");
                System.out.println("2.Bike Parking Entry");
                System.out.print("\nEnter your choice: ");
                choice_2 = input.nextInt();
                switch (choice_2) {
                    case 1 -> {
                        System.out.println("\nWelcome to Car parking application");
                        System.out.print("Car Model: ");
                        type = input.next();
                        System.out.print("Parking Number: ");
                        number_1 = input.nextInt();
                        System.out.print("Number: ");
                        number_2 = input.next();
                        System.out.println("\n\t\tTicket");
                        obj_2.parking(type, number_1, number_2);
                    }
                    case 2 -> {
                        System.out.println("\nWelcome to Bike parking application");
                        System.out.print("Bike Model: ");
                        type = input.next();
                        System.out.print("Parking Number: ");
                        number_1 = input.nextInt();
                        System.out.print("Number : ");
                        number_2 = input.next();
                        System.out.println("\n\t\tTicket");
                        obj_2.parking(type, number_1, number_2);
                    }
                    default -> //              Wrong choice number
                        System.out.println("Invalid choice");
                }
//               Car parking application system
//               Bike parking application system
                //      Exit parking system of user
            } else if (choice_1 == 2) {
                System.out.println("\nWelcome Exit parking");
                System.out.println("1.Car Parking Exit");
                System.out.println("2.Bike Parking Exit");
                System.out.print("\nEnter your choice: ");
                choice_2 = input.nextInt();
                switch (choice_2) {
                    case 1 -> {
                        System.out.println("\nWelcome to Car parking application");
                        System.out.print("Car Model: ");
                        type = input.next();
                        System.out.print("Parking Number: ");
                        number_1 = input.nextInt();
                        System.out.print("Number: ");
                        number_2 = input.next();
                        System.out.print("Parking Price : ");
                        price = input.nextInt();
                        System.out.print("Parking Time : ");
                        time = input.nextInt();
                        System.out.println("\n\t\tInvoice");
                        int result_1 = (int) obj_1.Car_counting(time, price);
                        double result_2 = obj_1.Car_parking(result_1, price_dollars);
//          Exchange currency riel to dollars
                        obj_2.parking(type, number_1, number_2);
                        System.out.println("Length : " + time + " hours");
                        System.out.println("Total Price : " + result_1 + " riel");
                        System.out.println("Total price : " + " $" + format_decimal.format(result_2));
                    }
                    case 2 -> {
                        price = 2000;
                        System.out.println("\nWelcome to Bike parking application");
                        System.out.print("Bike Model: ");
                        type = input.next();
                        System.out.print("Parking Number: ");
                        number_1 = input.nextInt();
                        System.out.print("Number: ");
                        number_2 = input.next();
                        System.out.println("\n\t\tInvoice");
                        int result_3 = (int) obj_1.Bike_counting(price);
                        double result_4 = obj_1.Car_parking(result_3, price_dollars);
//          Exchange currency riel to dollars
                        obj_2.parking(type, number_1, number_2);
                        System.out.println("Total Price : " + result_3 + " riel");
                        System.out.println("Total price : " + " $" + format_decimal.format(result_4));
                    }
                    default ->
                        System.out.println("Invalid choice");
                }
//         Car exit application
//          Bike Exit application
//          Wrong choice system
            } else if (choice_1 == 3) {
                System.out.println("You Exit Parking System Successfully");
                break;
            } else {
                System.out.println("Invalid choice. Please try again");
                System.out.println("You should be input value: ( 1 to 3 ) ");
            }

        }

    }
}
