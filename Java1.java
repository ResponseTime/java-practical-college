class rectangle {
    int length;
    int width;

    void input(int x, int y) {
        length = x;
        width = y;
    }

    int calcArea() {
        return length * width;
    }

    void output() {
        System.out.println("Area of rectangle is: " + calcArea());
    }
}

public class Java1 {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.input(10, 20);
        r1.output();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}