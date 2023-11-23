import java.util.Scanner;

public class recursion1 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter an index for a Fibonacci number: ");
    int index = input.nextInt();
    double result = recursionFunction(index);

    System.out.println("The Fibonacci number at index " + index + " is " + result);
    }
    
    public static double recursionFunction(int index) {
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else
            return recursionFunction(index - 1) + recursionFunction(index - 2);
    }
}
    
