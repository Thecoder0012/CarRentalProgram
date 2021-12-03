import java.util.ArrayList;
import java.util.Scanner;

public class Company extends Customer{


    private String companyName;
    private String companyAddress;
    private int companyPhoneNumber;
    private int crn;

    public Company(String nameOfDriver, String address, int postNumber, String city, int mobilePhone, int phone, String email, String companyName, String companyAddress, int comepanyPhoneNumber, int crn) {
        super(nameOfDriver,address,postNumber,city,mobilePhone,phone,email);
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companyPhoneNumber = companyPhoneNumber;
        this.crn = crn;
    }

    public static void createCompany(Scanner scanner, ArrayList<Customer> customer) {
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
        System.out.println("Enter company name");
        String comp = scan.nextLine();
        System.out.println("Enter company address");
        String compAddress = scan.nextLine();
        System.out.println("Enter company's phone number");
        int compNumber = scan.nextInt();
        System.out.println("Enter crn");
        int cr = scan.nextInt();

        Company newCustomer = new Company(name, address, postnumber, city, mobilePhone, phone, email,comp,compAddress,compNumber,cr);
        System.out.println(newCustomer);
        customer.add(newCustomer);

    }

    @Override
    public String toString() {
        return "Company" + super.toString() + "Company{" +
                "companyName='" + companyName + '\n' +
                ", companyAddress='" + companyAddress + '\n' +
                ", companyPhoneNumber=" + companyPhoneNumber +'\n'+
                ", crn=" + crn + '\n'+
                '}';
    }
}
