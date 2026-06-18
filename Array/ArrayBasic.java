public class ArrayBasic {

    public static void main(String[] args) {

        // Primitive array
        int[] arr = { 10, 20, 30, 40 };
        int n = arr.length;

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();

        // Non-primitive array (String objects)
        String[] names = { "Lakshit", "Rahul", "Pankaj" };

        System.out.print("Non-Primitive Array -> ");
        for (String name : names)
            System.out.print(name + " ");
    }
}