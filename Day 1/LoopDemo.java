public class LoopDemo {
    public static void main(String[] args) {

        // 1 . For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i=" + i);
        }

        // while loop
        System.out.println("\n while loop:");
        int x = 1;
        while (x <= 10) {
            System.err.println("x=" + x);
            x++;
        }

        // do-while loop
        System.err.println("\n Do-while loop:");
        int j = 1;
        do {
            System.err.println("j :" + j);
            j++;
        } while (j <= 5);


        //For-each loop

        System.err.println("For-each loop: ");
        int[] numbers= {10,20,30,40,50,60};

        for(int num:numbers){
            System.out.println("numbers:" +num);
        }

 
    }
}