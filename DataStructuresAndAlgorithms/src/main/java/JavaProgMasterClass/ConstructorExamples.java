package JavaProgMasterClass;

class VipCustomer {
    String name;
    int creditLimit;
    String emailAddress;

    protected void displayName() {
        System.out.println (this.getName ());
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "empty");
    }

    public VipCustomer() {
        this("Empty", 0, "Empty");
    }

}
public class ConstructorExamples {
    public static void main(String[] args) {
        VipCustomer cu = new VipCustomer ("Venkatesh", 10000, "itsvenkatesh@gmail.com");
        System.out.println (cu.getName ());
        System.out.println (cu.getCreditLimit ());
        System.out.println (cu.getEmailAddress ());

        cu.displayName ();
    }
}
