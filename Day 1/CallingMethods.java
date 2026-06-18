
public class CallingMethods {
    // 1. Calling a User-Defined Method
    void hello() {
        System.out.println("This is a user defined method calling");
    }

    public static void main(String[] args) {
        CallingMethods obj = new CallingMethods(); // create object
        obj.hello();

    }
}
