import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class    Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Car> carList = new ArrayList<>();
        ArrayList<Customer> customerList = new ArrayList<>();
        ArrayList<Rental> rentalList = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter 1 to show cars\nEnter 2 to create a new car\nEnter 3 to show customers\n" +
                    "Enter 4 to create customer\nEnter 5 to change car info\nEnter 6 to change customer" +
                    "\nEnter 7 to show contracts\nEnter 8 to change the rental list\n" +
                    "Enter 9 to create a contract between a customer and a car\nEnter 10 to leave the program");
            switch (input.nextInt()) {
                case 1:
                    Car.printCarsFromFile();
                    break;
                case 2:
                    System.out.println("Which car do you want to make?");
                    System.out.println("Enter 1 for luxury\nEnter 2 for Sport\nEnter 3 for family\nEnter 4 to go back");
                    int a = input.nextInt();
                    if (a == 1) {
                        Luxury.createLuxury(input, carList);
                    } else if (a == 2) {
                        Sport.createSport(input, carList);
                    } else if (a == 3) {
                        Family.createFamily(input, carList);
                    }
                    Car.printCarToFile(carList);
                    break;

                case 3:
                    Customer.printCustomerFromFile();
                case 4:
                    System.out.println("What customer do you want to make?");
                    System.out.println("Enter 1 for private customer\nEnter 2 for company\nEnter 3 to go back");
                    int b = input.nextInt();

                    if (b == 1) {
                        PrivateCustomer.createCustomer(input, customerList);
                    } else if (b == 2) {

                        Company.createCompany(input, customerList);
                    }
                    Customer.printCustomerToFile(customerList);

                    break;

                case 5:
                    changeCar(input, carList);
                    break;

                case 6:
                    changeCustomer(input, customerList);

                    break;


                case 7:
                    Rental.printContractFromFile();

                    break;

                case 8:
                    Rental.changeRental(input, rentalList);

                    break;

                case 9:
                    createContract(carList,customerList,rentalList,input);
                    Rental.printContractToFile(rentalList);
                    break;


                case 10:
                    check = false;
                    break;



            }
        }
    }

    public static void changeCar(Scanner scanner, ArrayList<Car> carList) {
        System.out.println("Do you want to change your car?");
        scanner.nextLine();
        String ans = scanner.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("What car do you want to change? ");
            int ans1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What brand do want to change to? ");
            String ans2 = scanner.nextLine();
            carList.get(ans1).setBrand(ans2);
            System.out.println("What model do you want to change to? ");
            String ans3 = scanner.nextLine();
            carList.get(ans1).setModel(ans3);
            System.out.println("What fueltype do you want to change to? ");
            String ans4 = scanner.nextLine();
            carList.get(ans1).setFuelType(ans4);
            System.out.println("Change registration number");
            String ans5 = scanner.nextLine();
            carList.get(ans1).setRegistrationNumber(ans5);
            System.out.println("Change year and month of registration");
            int ans6 = scanner.nextInt();
            carList.get(ans1).setRegistrationYearMonth(ans6);
            System.out.println("Change km driven");
            int ans7 = scanner.nextInt();
            carList.get(ans1).setKmDriven(ans7);
        }
    }

    public static void changeCustomer(Scanner scan, ArrayList<Customer> customerList) {
        System.out.println("Do you want to change your customer?");
        scan.nextLine();
        String ans = scan.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            System.out.println("What customer do you want to change? ");
            int ans1 = scan.nextInt();
            scan.nextLine();
            System.out.println("Change name of driver: ");
            String ans2 = scan.nextLine();
            customerList.get(ans1).setNameOfDriver(ans2);
            System.out.println("Change address: ");
            String ans3 = scan.nextLine();
            customerList.get(ans1).setAddress(ans3);
            System.out.println("Change postnumber ");
            int ans4 = scan.nextInt();
            customerList.get(ans1).setPostNumber(ans4);
            System.out.println("Change city");
            String ans5 = scan.nextLine();
            customerList.get(ans1).setCity(ans5);
            System.out.println("Change mobilephone");
            int ans6 = scan.nextInt();
            customerList.get(ans1).setMobilePhone(ans6);
            System.out.println("Change phone");
            int ans7 = scan.nextInt();
            customerList.get(ans1).setPhone(ans7);
            System.out.println("Change email");
            String ans8 = scan.nextLine();
            customerList.get(ans1).setEmail(ans8);

        }
    }

    public static void createContract(ArrayList<Car> carList, ArrayList<Customer> customerList, ArrayList<Rental> rental, Scanner scan) {

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println("(" + i + "): " + customerList.get(i));
        }
        System.out.println("Choose a customer");
        int a = scan.nextInt();
        Customer customer = customerList.get(a);

        for (int i = 0; i < carList.size(); i++) {
            System.out.println("(" + i + "): " + carList.get(i));
        }
        System.out.println("Choose a car");
        int ba = scan.nextInt();
        Car car = carList.get(ba);
        scan.nextLine();
        System.out.println("Now create the contract:\n");
        System.out.println("Choose from date and time");
        String b = scan.nextLine();
        System.out.println("Choose to date and time");
        String c = scan.nextLine();
        System.out.println("Enter max km");
        int d = scan.nextInt();
        System.out.println("Enter start km");
        int e = scan.nextInt();

        Rental newRent = new Rental(b,c,d,e,car,customer);
        System.out.println(customerList.get(a));
        System.out.println(carList.get(ba));
        System.out.println(newRent);
        rental.add(newRent);


    }

}
