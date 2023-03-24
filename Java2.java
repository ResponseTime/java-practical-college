class areaO {
    void area(int x, int y) {
        System.out.println("Area of rectangle is: " + x * y);
    }

    void area(float x, float y) {
        System.out.println("Area of triangle is: " + 0.5 * x * y);
    }

    void area(int x) {
        System.out.println("Area of square is: " + x * x);
    }
}

public class Java2 {
    public static void main(String[] args) {
        areaO a1 = new areaO();
        a1.area(10, 20);
        a1.area(10.5f, 20.5f);
        a1.area(10);
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
