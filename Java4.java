class student {
    int id;
    String name;

    student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Id: " + id + " Name: " + name);
    }
}

public class Java4 {
    public static void main(String[] args) {
        student s1 = new student(1, "John");
        student s2 = new student(2, "Maya");
        s1.display();
        s2.display();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
