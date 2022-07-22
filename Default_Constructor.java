class Professor{
    String name;
    String Specialization;
    double contact_number;
    int salary;
    public Professor(){
        name = "vijay";
        Specialization = "Java";
        contact_number = 603506666;
        salary = 40000;
    }
        }
        class University extends Professor{
    String name;
    String address;
    String phone_num;
        }

public class Default_Constructor {
public static void main(String[] args) {
    Professor vijay = new Professor();
    System.out.println(vijay.name);
    System.out.println(vijay.Specialization);
    System.out.println(vijay.contact_number);
    System.out.println(vijay.salary);
    University JNIT = new University();
    System.out.println(JNIT.name);
    System.out.println(JNIT.address);
    System.out.println(JNIT.phone_num);
}
}