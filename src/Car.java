import java.io.*;
import java.util.ArrayList;

public abstract class Car {

    private String brand;
    private String model;
    private String fuelType;
    private String registrationNumber;
    private int registrationYearMonth;
    private int kmDriven;

    public Car(String brand, String model, String fuelType, String registrationNumber, int registrationYearMonth, int kmDriven) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.registrationNumber = registrationNumber;
        this.registrationYearMonth = registrationYearMonth;
        this.kmDriven = kmDriven;
    }


    public static void printCarToFile(ArrayList<Car> car) throws FileNotFoundException {
        File f = new File("cars.txt");
        PrintStream fileWriter = new PrintStream(f);
        for (int i = 0; i < car.size(); i++) {
            fileWriter.println(car.get(i)); // printsToFile

        }

    }

    public static void printCarsFromFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("cars.txt"));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
    }


    @Override
    public String toString() {
        return "Car{" + '\n' +
                "brand='" + brand + '\n' +
                "model='" + model +
                "fuelType='" + fuelType + '\n' +
                "registrationNumber='" + registrationNumber + '\n' +
                "registrationYearMonth=" + registrationYearMonth+'\n' +
                "kmDriven=" + kmDriven+'\n' +
                "*********************************************";
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getRegistrationYearMonth() {
        return registrationYearMonth;
    }

    public void setRegistrationYearMonth(int registrationYearMonth) {
        this.registrationYearMonth = registrationYearMonth;
    }

    public int getKmDriven() {
        return kmDriven;
    }

    public void setKmDriven(int kmDriven) {
        this.kmDriven = kmDriven;
    }

}
