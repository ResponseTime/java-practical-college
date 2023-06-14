class first extends Thread {
    public void start() {
        System.out.println("first thread started");
    }

    public void run() {
        System.out.println("first thread running");
    }
}

class second extends Thread {
    public void start() {
        System.out.println("second thread started");
    }

    public void run() {
        System.out.println("second thread running");
    }
}

public class java13 {
    public static void main(String[] args) {
        first f1 = new first();
        second f2 = new second();
        f1.start();
        f2.start();
        f1.run();
        f2.run();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
