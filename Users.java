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
// pata team : generate login to
// pata team eof

// team psvm
// team psvm eof
