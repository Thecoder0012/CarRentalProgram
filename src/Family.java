import java.util.ArrayList;
import java.util.Scanner;

public class Family extends Car {

    boolean manualGear;
    boolean airCondtion;
    boolean someWithCruiseControl;
    boolean sevenSeatsOrMore;

    public Family(String brand, String model, String fuelType, String registrationNumber, int registrationYearMonth, int kmDriven, boolean manualGear, boolean airCondtion, boolean someWithCruiseControl, boolean sevenSeatsOrMore) {
        super(brand, model, fuelType,registrationNumber,registrationYearMonth,kmDriven);
        this.manualGear = manualGear;
        this.airCondtion = airCondtion;
        this.someWithCruiseControl = someWithCruiseControl;
        this.sevenSeatsOrMore = sevenSeatsOrMore;
    }

    public static void createFamily(Scanner scanner, ArrayList<Car> car) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make new car:\n "); // Skal man kunne lave en luxury, sport eller family. Hvis ja, skal jeg så lave parameter luxury, sport og family eller en methode for hver?

        System.out.println("Enter brand: ");
        String brand = scan.nextLine();
        System.out.println("Enter model: ");
        String model = scan.nextLine();
        System.out.println("Enter fueltype: ");
        String fuelType = scan.nextLine();
        System.out.println("Enter registration number: ");
        String registrationNumber = scan.nextLine();
        System.out.println("Enter registration year and month: ");
        int yearMonth = scan.nextInt();
        System.out.println("Enter car km: ");
        int km = scan.nextInt();
        System.out.println("Is the car manual gear? ");
        boolean gear = scan.nextBoolean();
        System.out.println("Does the car have aircondition?");
        boolean air = scan.nextBoolean();
        System.out.println("Does the car have cruise control? ");
        boolean cruise = scan.nextBoolean();
        System.out.println("Does the car have seven seats or more?");
        boolean seat = scan.nextBoolean();


        Family newFamily = new Family(brand, model, fuelType, registrationNumber, yearMonth, km,gear,air,cruise,seat);
        System.out.println(newFamily);
        car.add(newFamily);

    }

    @Override
    public String toString() {
        return "Familiy" + super.toString()+'\n' +
                "manualGear=" + manualGear +'\n'+
                "airCondtion=" + airCondtion+'\n' +
                "someWithCruiseControl=" + someWithCruiseControl+'\n' +
                "sevenSeatsOrMore=" + sevenSeatsOrMore+'\n' +
                '}';
    }
}

