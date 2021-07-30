package JavaProgMasterClass;

class Person {
    String name;
    int    age;

    static void staticMethodExample() {
        System.out.println ("print from static method from parent class");
    }

    Person() {
        this("", 0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    protected void display() {
        System.out.println ("display without params in parent class");
    }
    public void display(String age) {
        System.out.println ("Display with string arg.");
    }
}

class Employee extends Person {

    public Employee(String name, int age, int employeeId) {
        super (name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    int employeeId;
    public Employee() {
        super();
        this.employeeId = 0;
    }
    @Override
    public void display() {
        System.out.println ("Display without arg. in derived class");
    }
    static void staticprint() {
        System.out.println ("this.name can't be used.");
    }
    static void staticMethodExample() {
        System.out.println ("print from static method from derived class");
    }
}

public class InheritenceExamples {
    public static void main(String[] args) {
        Employee e = new Employee ("sadfsf", 10, 100);
//        e.setName("sdfdf");
//        e.setAge (10);
//        e.setEmployeeId (100);

        System.out.println (e.getEmployeeId () + " " + e.getName () + " " + e.getAge ());
        Employee e1 = (Employee) e;
        System.out.println (e1.getEmployeeId () + " " + e1.getName () + " " + e1.getAge ());
        e.display ();
        e.display ("asdfsdf");
//        e.display (10);
        Person p1 = new Person ("asdfsdf", 15);
        p1.display ();
        Employee.staticMethodExample ();
    }

}
