class Parent {
    int i;

    void display() {
        System.out.println("Parent");
    }
}

class child1 extends Parent {
    void display() {
        System.out.println("Child1");
    }
}

class child2 extends Parent {
    void display() {
        System.out.println("Child2");
    }
}

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

class C extends B {
    void display() {
        System.out.println("Class C");
    }
}

public class Java5 {
    public static void main(String[] args) {
        Parent p = new Parent();
        child1 c1 = new child1();
        child2 c2 = new child2();
        p.display();
        c1.display();
        c2.display();
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println();
        a.display();
        b.display();
        c.display();
        System.out.println("Aayush Bhattacharjee | 00190302021");
    }
}
