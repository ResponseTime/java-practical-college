class demo {
    static int i = 0;

    void change() {
        i++;
    }

    static void display() {
        System.out.println("The value of i is " + i);
    }

    static {
        System.out.println("This is a static block and will be executed automatically");
    }
}

public class Java3 {
    public static void main(String[] args) {
        demo d = new demo();
        demo.display();
        for (int i = 0; i < 5; i++) {
            d.change();
        }
        demo.display();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}