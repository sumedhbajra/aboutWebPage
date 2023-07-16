package constructor.challenges;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    public Customer(){
        this("Kalash", "kalu@gmail.com");
        System.out.println("This is no-args constructor.");
    }

    public Customer(String name, String emailAddress){
        this(name, 5000, emailAddress);
        System.out.println("Constructor with name and email address.");
    }

    public Customer(String name, double creditLimit, String emailAddress){
        System.out.println("This is all field constructor.");
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }



}
