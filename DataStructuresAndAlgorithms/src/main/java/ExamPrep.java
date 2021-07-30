class Sample {
    static int instance = 10;

    Sample() {
        this(100, 420);
    }
    Sample(int constVar, int prVar) {
        this.constVar = constVar;
        this.prVar = 420;
    }

    static int getInstance() { return instance; }

    public final int constVar ;
    void print() {
        System.out.println ("Sample.print  " + this.constVar);
        this.prVar = 100;
    }
    private int prVar;
}

class Sample1 extends Sample {
    Sample1() {
        super (100, 200);
    }
    Sample1(int constVar) {
        super(constVar, 200);
    }

    @Override
    void print() {
        super.print ();
        this.instance = 420;
        System.out.println ("Sample1.print " + this.instance);

    }
}

abstract class Base {
    void display() {
        System.out.println ("B");
    }
}

class D1 extends Base {
    void display() {
        System.out.println ("D1");
    }
}

class D2 extends Base {
    void display() {
        System.out.println ("D2");
    }
}

interface Vehicle {
    void display() ;
    int a =100 ;

}

class Car implements Vehicle {
    @Override
    public void display() {
        System.out.println ("Car " + a);
    }
}

class Truck implements Vehicle {
    public void display() {
        System.out.println ("Truck " + Vehicle.a);
    }
}

interface ElectricVehicle extends Vehicle {
    void displayElectricParams();
    void playAudio();
    interface AudioSystem {
        void play();
    }
}

class Reva implements ElectricVehicle {

    AudioSystem au ;

    Reva() {
        au = new BoseAudio ();
    }

    @Override
    public void displayElectricParams() {
        System.out.println ("Reva.displayElectricParams");
    }
    public void display() {
        System.out.println ("Reva.display");
    }

    public void playAudio() {
        au.play ();
    }

    class BoseAudio implements AudioSystem {
        public void play() {
            System.out.println ("BoseAudio.play");
        }
    }

}

class MyAudio implements ElectricVehicle.AudioSystem {
    public void play() {
        System.out.println ("MyAudio.play");
    }
}

interface A {
    int x = 100;
}

interface B {
    int x = 200;
}

public class ExamPrep {
    public static void main(String[] args) {
//        System.out.println (Sample1.getInstance ());
//        Sample1 s1 = new Sample1 (150);
//        s1.print();
//        System.out.println (s1.instance);
//        Sample1 s2 = new Sample1 (150);
//        System.out.println (s2.instance);
//
//        Sample s = new Sample ();
//        s.print ();

        Base b = new D1();
        b.display ();

        b = new D2();
        b.display ();

//        b = new Base ();
//        b.display ();

        Vehicle c = new Vehicle () {
            @Override
            public void display() {
                System.out.println ("Vehicle display");
            }
        };
        c.display ();
        Vehicle ca = new Car();
        ca.display ();
        System.out.println (Vehicle.a);
        Vehicle tr = new Truck ();
        tr.display ();
        System.out.println (Truck.a);
        System.out.println (Car.a);
        System.out.println (ElectricVehicle.a);

        ElectricVehicle r = new Reva ();
        r.display ();
        r.displayElectricParams ();

        r.playAudio ();
        System.out.println (A.x);
        System.out.println (B.x);
    }
}
