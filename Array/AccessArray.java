public class AccessArray {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 };

        //Access 2nd element
        System.out.println(arr[2]+ " is second element");

         // Updating first element
        arr[0] = 90;
        System.out.println(arr[0] + "The updated value of 1st index");

         // Traversing and printing array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
