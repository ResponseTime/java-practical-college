class Parent {
    Parent(int x, int y) {
        System.out.println("The values given in parent class are " + x + " " + y);
    }
}

class Child extends Parent {
    Child(int x, int y, int z) {
        super(x, y);
        System.out.println("The value given in child class are " + z);
    }
}

public class Java6 {
    public static void main(String[] args) {
        Child ch = new Child(1, 2, 3);
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}