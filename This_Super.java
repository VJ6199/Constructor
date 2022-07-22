class Student{
    String name;
    int roll_number;
    char section;
    Student(String name, int roll_number, char section){
        this.name = name;
        this.roll_number = roll_number;
        this.section = section;
    }
}
class School extends Student{
    int marks;
    School (String name, int roll_number, char section, int marks){
        super(name,roll_number,section);
        this.marks = marks;
    }
    void display(){
        System.out.println("name:"+ name +", roll number:"+roll_number +", section: "+  section +", marks: " +marks);
    }
}
public class This_Super {
    public static void main(String[] args){
        School VPS = new School("vijay"  ,   21  ,  'b'   , 576  );
        VPS.display();
    }
}
