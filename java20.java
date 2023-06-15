class name implements Runnable {
    public void run() {
        System.out.println("My name is XYZ");
    }
}

class hello implements Runnable {
    public void run() {
        System.out.println("HELLO JAVA");
    }
}

public class java20 {
    public static void main(String[] args) {
        name n = new name();
        hello h = new hello();
        Thread t = new Thread(n);
        Thread t1 = new Thread(h);
        t.run();
        t1.run();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
