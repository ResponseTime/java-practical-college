class bike {
    void driving() {
        System.out.println("bike");
    }

    void speed() {
        System.out.println("90mph");
    }
}

class splendor extends bike {
    void driving() {
        System.out.println("splendor bike");
    }
}

public class Java7 {
    public static void main(String[] args) {
        bike b = new splendor();
        b.driving();
        b.speed();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
