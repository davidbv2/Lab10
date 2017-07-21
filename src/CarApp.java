import java.util.Scanner;

public class CarApp {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Begin to enter the information of your two cars.");
        Car userCar1 = new Car();
        Car userCar2 = new Car();

        System.out.print("The make of your car is: ");
        userCar1.setMake(scan.nextLine());

        System.out.print("The model of your car is: ");
        userCar1.setModel(scan.nextLine());

        System.out.print("The year of your car is: ");
        userCar1.setYear(scan.nextInt());

        System.out.print("The price of your car: ");
        userCar1.setPrice(scan.nextDouble());

        System.out.println("We are now storing this information about your car: " + userCar1.getYear() + " " + userCar1.getMake()
                + " " + userCar1.getModel() + " - $" + userCar1.getPrice());

        //System.out.println(userCar1.toString());

        scan.nextLine();
        System.out.println();

        System.out.print("The make of your car is: ");
        userCar2.setMake(scan.nextLine());

        System.out.print("The model of your car is: ");
        userCar2.setModel(scan.nextLine());

        System.out.print("The year of your car is: ");
        userCar2.setYear(scan.nextInt());

        System.out.print("The price of your car: ");
        userCar2.setPrice(scan.nextDouble());

        System.out.println("We are now storing this information about your car: " + userCar2.getYear() + " " + userCar2.getMake()
                + " " + userCar2.getModel() + " - $" + userCar2.getPrice());






    }
}
