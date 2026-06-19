
class Car { // class blueprint
    String color;

    void speed() {
        System.out.println("Running");
    }

}

public class OOP {

    public static void main(String[] args) {
        Car myCar = new Car(); // object created
        myCar.color = "Red";
        myCar.speed();
    }

}
