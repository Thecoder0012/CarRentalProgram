import java.util.ArrayList;
import java.util.Scanner;

public class Luxury extends Car {

    private int threeThousandCCM;
    private boolean automaticGear;
    private boolean airCondition;
    private boolean cruiseControl;
    private boolean leatherSeats;

    public Luxury(String brand, String model, String fuelType, String registrationNumber, int registrationYearMonth, int kmDriven, int threeThousandCCM, boolean automaticGear, boolean airCondition, boolean cruiseControl, boolean leatherSeats) {
        super(brand, model, fuelType, registrationNumber, registrationYearMonth, kmDriven);
        this.threeThousandCCM = threeThousandCCM;
        this.automaticGear = automaticGear;
        this.airCondition = airCondition;
        this.cruiseControl = cruiseControl;
        this.leatherSeats = leatherSeats;
    }


    public static void createLuxury(Scanner scanner, ArrayList<Car> car) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make new car:\n ");

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
        scan.nextLine();
        int km = scan.nextInt();
        System.out.println("How many CCM does the car have? ");
        int cmm = scan.nextInt();
        System.out.println("Is the car automatic-gear?");
        boolean gear = scan.nextBoolean();
        System.out.println("Does the car have aircondtion? ");
        boolean air = scan.nextBoolean();
        System.out.println("Does the car have cruisecontrol?");
        boolean cruise = scan.nextBoolean();
        System.out.println("Does the car have leather seats? ");
        boolean leather = scan.nextBoolean();

        Luxury newLuxury = new Luxury(brand, model, fuelType, registrationNumber,
                yearMonth, km, cmm, gear, air, cruise, leather);
        System.out.println(newLuxury);
        car.add(newLuxury);


    }

    @Override
    public String toString() {
        return "luxury"+'\n' + super.toString()+'\n' +
                "threeThousandCCM=" + threeThousandCCM+'\n'+
                "automaticGear=" + automaticGear+'\n' +
                "airCondition=" + airCondition+'\n' +
                "cruiseControl=" + cruiseControl+'\n' +
                "leatherSeats=" + leatherSeats+'\n' +
                '}';
    }
}
