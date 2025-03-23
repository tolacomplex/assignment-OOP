import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//      Parking class inherit
        Parking obj_1 = new Parking();
        Scanner input = new Scanner(System.in);
        int choice_1, choice_2, time, price;
//        Vehicle parking system implement interface
        vehicle_parking_implement obj_2 = new vehicle_parking_implement();
        String type;
        int number;
//        Loop condition choice
        while(true) {
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
//               Car parking application system
                    case 1:
                        System.out.println("\nWelcome to Car parking application");
                        System.out.print("Car Model: ");
                        type = input.next();
                        System.out.print("Number of slot: ");
                        number = input.nextInt();
                        System.out.print("Parking Price : ");
                        price = input.nextInt();
                        break;
//               Bike parking application system
                     case 2:
                         System.out.println("\nWelcome to Bike parking application");
                         System.out.print("Bike Model: ");
                         type = input.next();
                         System.out.print("Number of slot: ");
                         number = input.nextInt();
                         System.out.print("Parking Price : ");
                         price = input.nextInt();
                         obj_1.Bike_counting(price);
                         obj_2.parking(type, number);
                         break;
                    default:
//              Wrong choice number
                        System.out.println("Invalid choice");
                        break;
                }
//      Exit parking system of user
            } else if (choice_1 == 2) {
                System.out.println("\nWelcome Exit parking");
                System.out.println("1.Car Parking Exit");
                System.out.println("2.Bike Parking Exit");
                System.out.print("\nEnter your choice: ");
                choice_2 = input.nextInt();
                switch (choice_2) {
//         Car exit application
                    case 1:
                        System.out.println("\nWelcome to Car parking application");
                        System.out.print("Parking Price : ");
                        price = input.nextInt();
                        System.out.print("Parking Time : ");
                        time = input.nextInt();
                        System.out.print("Car Model: ");
                        type = input.next();
                        System.out.print("Number of slot: ");
                        number = input.nextInt();
                        int result_1 = (int) obj_1.Car_counting(time, price);
                        System.out.println("Time + " + time + " hours");
                        System.out.println("Total Price : " + result_1 + " riel");
                        obj_2.parking(type, number);
                        break;
//          Bike Exit application
                    case 2:
                        price = 2000;
                        System.out.println("\nWelcome to Bike parking application");
                        System.out.print("Bike Model: ");
                        type = input.next();
                        System.out.print("Number of slot: ");
                        number = input.nextInt();
                        int result_2= (int) obj_1.Bike_counting(price);
                        System.out.println("Total Price : " + result_2 + " riel");
                        obj_2.parking(type, number);
                        break;
//          Wrong choice system
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } else if (choice_1 == 3) {
                System.out.println("You Exit Parking System Successfully");
                break;
            }  else {
                System.out.println("Invalid choice");
            }

        }


    }
}