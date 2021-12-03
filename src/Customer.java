import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Customer {

    private String nameOfDriver;
    private String address;
    private int postNumber;
    private String city;
    private int mobilePhone;
    private int phone;
    private String email;

    public Customer(String nameOfDriver, String address, int postNumber, String city, int mobilePhone, int phone, String email) {
        this.nameOfDriver = nameOfDriver;
        this.address = address;
        this.postNumber = postNumber;
        this.city = city;
        this.mobilePhone = mobilePhone;
        this.phone = phone;
        this.email = email;
    }


    public String getNameOfDriver() {
        return nameOfDriver;
    }

    public String getAddress() {
        return address;
    }

    public int getPostNumber() {
        return postNumber;
    }

    public String getCity() {
        return city;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setNameOfDriver(String nameOfDriver) {
        this.nameOfDriver = nameOfDriver;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostNumber(int postNumber) {
        this.postNumber = postNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setMobilePhone(int mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static void printCustomerToFile(ArrayList<Customer> customer) throws FileNotFoundException {
        File f = new File("customers.txt");
        PrintStream fileWriter = new PrintStream(f);
        for (int i = 0; i < customer.size(); i++) {
            fileWriter.println(customer.get(i));
        }

    }

    public static void printCustomerFromFile() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("customers.txt"));
        String s;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
    }




    @Override
    public String toString() {
        return "Customer{" +
                "nameOfDriver='" + nameOfDriver + '\n' +
                ", address='" + address + '\n' +
                ", postNumber=" + postNumber+'\n' +
                ", city='" + city + '\n' +
                ", mobilePhone=" + mobilePhone +'\n'+
                ", phone=" + phone+'\n' +
                ", email='" + email + '\n' +
                '}';
    }


}
