import java.util.ArrayList;
import java.util.List;

public class Users {
    int id;
    String mobileNumber;
    int pin;
    String name;
    String address;
    double balance;

    // team panda: generate constructors and getters+setters
    public Users(int id, String mobileNumber, int pin, String name, String address, double balance) {
        this.id = id;
        this.mobileNumber = mobileNumber;
        this.pin = pin;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // team panda eof

}

// pata team : generate login
class Login {

    public static boolean isValidUser(String mobileNumber, int pin, ArrayList<Users> usersList) {
        boolean isValid = usersList.stream()
                .anyMatch(user -> user.getMobileNumber().equals(mobileNumber) && user.getPin() == pin);
        return isValid;
    }

}

// public static void main(String[] args) {
// List<Users> usersList = List.of(
// new Users(1, "1234567890", 1234, "John Doe", "123 Main St", 1000.0),
// new Users(2, "0987654321", 5678, "Jane Smith", "456 Elm St", 2000.0),
// new Users(3, "5555555555", 9012, "Alice Johnson", "789 Oak St", 1500.0)

// );
// String mobileNumber = "1234567890";
// int pin = 1254;

// boolean isValid = Login.isValidUser(mobileNumber, pin, new
// ArrayList<>(usersList));
// if (isValid) {
// System.out.println("Login successful!");
// } else {
// System.out.println("Invalid mobile number or PIN.");
// }
// }

// pata team eof

// team psvm
// team psvm eof