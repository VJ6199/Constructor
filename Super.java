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
        System.out.println("super speed:"+speed);
        System.out.println("manufacture_year:"+manufacture_year);
        System.out.println("milage:"+milage);
        System.out.println("color:"+this.color);
        System.out.println("speed:"+super.speed);
        System.out.println("model:"+model);
    }
}
public class Super {
    public static void main(String[] args){
        Car benz = new Car();
        benz.vijay("160");
    }
}
