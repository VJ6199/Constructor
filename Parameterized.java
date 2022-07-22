class Teacher{
    String name;
    String subject;
    double salary;
    public Teacher(String name, String subject, Double salary){
        this.name = name;
        this.subject = subject;
        this.salary = salary;
    }
    void display(Teacher rohit){
        System.out.println(rohit.name);
        System.out.println(rohit.subject);
        System.out.println(rohit.salary);
        System.out.println(this.name);
        System.out.println(this.subject);
        System.out.println(this.salary);
    }
}
public class Parameterized {
    public static void main(String[] args){
        Teacher teacher_0 = new Teacher("vijay", "Java", 25000.0);
        Teacher teacher_1 = new Teacher("rahul", "Python", 25850.0);
        teacher_1.display(teacher_0);
    }
}
