interface in1 {
    int a = 99;

    void hello();
}

interface in2 {
    int a = 199;

    void bye();
}

class impl implements in1, in2 {
    public void hello() {
        System.out.println("Hello");
    }

    public void bye() {
        System.out.println("Bye");
    }
}

public class Java10 {
    public static void main(String[] args) {
        impl i = new impl();
        i.hello();
        i.bye();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
