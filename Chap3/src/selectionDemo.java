
public class selectionDemo {

    public static void main(String[] args) {

        int x = 10, y = 15;

        System.out.println("***begining of program***");

        x = 15;

        if (x > y) {
            System.out.println("x is greater than y");
            System.out.println("The weekend was great");
            int sum = x + y;
            System.out.println("sum value is: " + sum);
        } // end of if
        else if (x < y) {
            System.out.println("x is less than y");
            System.out.println("Today is Monday");
        } // end of else
        else {
            System.out.println("x is equal to y");
            System.out.println("tomorrow is Tuesday!");
        }

        System.out.println("***end of program***");
    } // end of the main method
}
