class mercedes{
    int speed = 180;
    int milage = 20;
    int manufacture_year = 2020;
}
class Car extends mercedes{
    int speed = 150;
    String color = "white";
    String model = "E350";
    void vijay(String speed){
        System.out.println(speed);
        System.out.println(manufacture_year);
        System.out.println(milage);
        System.out.println(this.color);
        System.out.println(super.speed);
        System.out.println(model);
    }
}
public class Super {
    public static void main(String[] args){
        Car benz = new Car();
        benz.vijay("160");
    }
}
