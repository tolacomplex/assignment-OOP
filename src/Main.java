import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Parking obj = new Parking();
        int time;
        Scanner input = new Scanner(System.in);
        System.out.println("Parking System ");
        System.out.print("Enter Time : ");
        time = (int) input.nextDouble();
        int result = (int) obj.count(time);
        System.out.println("Total Price : " + result + " riel");
    }
}