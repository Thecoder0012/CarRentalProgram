import java.util.ArrayList;
import java.util.Scanner;

public class Sport extends Car {

    private boolean manualGear;
    private boolean over200HP;

    public Sport(String brand, String model, String fuelType, String registrationNumber, int registrationYearMonth, int kmDriven, boolean manualgear, boolean over200HP) {
        super(brand, model, fuelType, registrationNumber, registrationYearMonth, kmDriven);
        this.manualGear = manualgear;
        this.over200HP = over200HP;
    }

    public static void createSport(Scanner scanner, ArrayList<Car> car) {
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
        System.out.println("Is the car manual gear?  ");
        boolean manual = scan.nextBoolean();
        System.out.println("Does the car have over 200 Horse power?");
        boolean HP = scan.nextBoolean();

        Sport newSport = new Sport(brand, model, fuelType, registrationNumber, yearMonth, km, manual, HP);
        System.out.println(newSport);
        car.add(newSport);

    }

    @Override
    public String toString() {
        return "Sport" + super.toString()+'\n' +
                "manualGear=" + manualGear+'\n' +
                "over200HP=" + over200HP +'\n'+
                '}';
    }


    public void setManualGear(boolean manualGear) {
        this.manualGear = manualGear;
    }

    public void setOver200HP(boolean over200HP) {
        this.over200HP = over200HP;
    }
}
