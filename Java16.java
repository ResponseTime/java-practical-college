class Employee {
    String name;
    int age;
    String address;

    void getData(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class Java16 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.getData("Aayush", "Kolkata", 20);
        e1.showData();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
