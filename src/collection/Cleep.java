package collection;

public class Cleep {
    private  String name;
    private  int phoneNumber;

    public Cleep(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                " phoneNumber=" + phoneNumber ;
    }
}
