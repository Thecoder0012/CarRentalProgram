import java.util.ArrayList;
import java.util.Scanner;

public class PrivateCustomer extends Customer {

    private String driverLicenceNumber;
    private String driverSinceDate;

    public PrivateCustomer(String nameOfDriver, String address, int postNumber, String city, int mobilePhone, int phone, String email, String driverLicenceNumber, String driverSinceDate) {
        super(nameOfDriver, address, postNumber, city, mobilePhone, phone, email);
        this.driverLicenceNumber = driverLicenceNumber;
        this.driverSinceDate = driverSinceDate;
    }


    public static void createCustomer(Scanner scanner, ArrayList<Customer> customer) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make new customer:\n ");

        System.out.println("Enter name: ");
        String name = scan.nextLine();
        System.out.println("Enter address: ");
        String address = scan.nextLine();
        System.out.println("Enter postnumber: ");
        int postnumber = scan.nextInt();
        System.out.println("Enter city: ");
        scan.nextLine();
        String city = scan.nextLine();
        System.out.println("Mobilephone: ");
        int mobilePhone = scan.nextInt();
        System.out.println("Enter phone: ");
        int phone = scan.nextInt();
        System.out.println("Enter email: ");
        scan.nextLine();
        String email = scan.nextLine();
        System.out.println("Enter drivers licence number");
        String licenceNum = scan.nextLine();
        System.out.println("Enter driver since when?");
        String driveDate = scan.nextLine();

        PrivateCustomer newCustomer = new PrivateCustomer(name, address, postnumber, city, mobilePhone, phone, email, licenceNum, driveDate);

        System.out.println(newCustomer);
        customer.add(newCustomer);

    }




    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public void setDriverSinceDate(String driverSinceDate) {
        this.driverSinceDate = driverSinceDate;
    }

    @Override
    public String toString() {
        return "Private" + super.toString() + "PrivateCustomer{" +
                "driverLicenceNumber='" + driverLicenceNumber + '\n' +
                ", driverSinceDate='" + driverSinceDate + '\n' +
                '}';
    }
}
