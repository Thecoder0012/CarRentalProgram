import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class    Rental {

    private String fromDateAndTime;
    private String toDateAndTime;
    private int maxKm;
    private int startKm;
    public Car car;
    public Customer customer;


    public Rental(String fromDateAndTime, String toDateAndTime,
                  int maxKm, int startKm, Car car, Customer customer) {
        this.fromDateAndTime = fromDateAndTime;
        this.toDateAndTime = toDateAndTime;
        this.maxKm = maxKm;
        this.startKm = startKm;
        this.car = car;
        this.customer = customer;
    }

    public static void printContractToFile(ArrayList<Rental> rent) throws FileNotFoundException {
        File f = new File("rental.txt");
        PrintStream fileWriter = new PrintStream(f);
        for (int i = 0; i < rent.size(); i++) {
            fileWriter.println(rent.get(i));
        }

    }
    public static void printContractFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("rental.txt"));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
    }


    public static void changeRental(Scanner scanner, ArrayList<Rental> rentalList) {
        System.out.println("Do you want to change your rental contracts?");
        scanner.nextLine();
        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("What contract do you want to change? ");
            int ans1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Change from date and time? ");
            String ans3 = scanner.nextLine();
            rentalList.get(ans1).setFromDateAndTime(ans3);
            System.out.println("Change to date and time? ");
            String ans4 = scanner.nextLine();
            rentalList.get(ans1).setToDateAndTime(ans4);
            System.out.println("Change the max km");
            int ans5 = scanner.nextInt();
            rentalList.get(ans1).setMaxKm(ans5);
            System.out.println("Change start KM");
            int ans6 = scanner.nextInt();
            rentalList.get(ans1).setStartKm(ans6);
            System.out.println("Change registration number");
            String ans7 = scanner.nextLine();
            scanner.nextLine();
            //rentalList.get(ans1).setRegistrationNumber(ans7);
        }
    }



    public void setFromDateAndTime(String fromDateAndTime) {
        this.fromDateAndTime = fromDateAndTime;
    }

    public void setToDateAndTime(String toDateAndTime) {
        this.toDateAndTime = toDateAndTime;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public void setStartKm(int startKm) {
        this.startKm = startKm;
    }


    @Override
    public String toString() {
        return "\nRental{" +
                "fromDateAndTime='" + fromDateAndTime + '\n' +
                ", toDateAndTime='" + toDateAndTime + '\n' +
                ", maxKm=" + maxKm+'\n' +
                ", startKm=" + startKm +'\n' +
                ", car=\n" + car +
                ", customer=\n" + customer +
                '}';
    }
}