import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Grand Circus Student on 7/21/2017.
 */
public class CarApp2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /* Set counting integer & user input variables. Create an ArrayList called 'inventoryList' and set its data type to the class "Car"
        which is our reference data type. This will allow us to store class 'Car' & 'Used Car'
        objects*/

        ArrayList <Car> inventoryList = new ArrayList<Car>();
        int i;
        int userInput = 0;
        String userAnswer = "";

        //Create new objects of each class and set their values

        Car newCar1 = new Car("Telsa","Model S",2017,60000);
        Car newCar2 = new Car("Ford","Fusion",2016,50000);
        Car newCar3 = new Car("Chrysler","Pacifica",2015, 40000);
        UsedCar usedCar1 = new UsedCar("GM"," Volt (Used)",2014, 30000, 10000);
        UsedCar usedCar2 = new UsedCar("Honda","Acord (Used)", 2013, 20000, 50000);
        UsedCar usedCar3 = new UsedCar("Nissan","Sentra (Used)", 2012, 10000,100000);

        //add each object to the ArrayList

        inventoryList.add(newCar1);
        inventoryList.add(newCar2);
        inventoryList.add(newCar3);
        inventoryList.add(usedCar1);
        inventoryList.add(usedCar2);
        inventoryList.add(usedCar3);

        //Print out all the elements in the ArrayList

        for (i = 0; i < inventoryList.size(); i++){
            System.out.println(i + 1 + "." + "\t" + inventoryList.get(i));
        }

        System.out.println();

        do {

        System.out.print("Which car interests you (Select the # of the car): ");
        userInput = scan.nextInt();
        scan.nextLine();

        System.out.println("You selected: " + userInput + ". " + "The car details are as follows: "
                + inventoryList.get(userInput-1));

            System.out.println();


            System.out.print("Would you like to buy this car? (Enter 'yes' or 'no'): ");
            userAnswer = scan.nextLine();

            if (userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Excellent! Our finance team will be in touch shortly.");
                inventoryList.remove(userInput - 1);

                for (i = 0; i < inventoryList.size(); i++) {
                    System.out.println(i + 1 + "." + "\t" + inventoryList.get(i));
                }

                System.out.println();

            } else if (userAnswer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for visiting us today!");
            }

        } while (userAnswer.equalsIgnoreCase("yes"));





























    }
}
