import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String again = "y";
        while(again.equals("y")) {
        System.out.println("Enter two numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        input.nextLine();
        System.out.println("Choose operation");
        System.out.println("+ - * /");
        String operation = input.nextLine();
            if(operation.equals("+"))
            {
                System.out.println(a + b);
            }
            else if(operation.equals("-")) {
                System.out.println(a - b);
            }
            else if(operation.equals("*")) {
                System.out.println(a * b);
            }
            else if(operation.equals("/")) {
                if(b==0){
                    System.out.println("Cannot divide by zero");
                }
                else {
                    System.out.println(a / b);
                }
            }
            System.out.println("Do you want to calculate again? (y/n):");
            again = input.nextLine();
        }



        // TODO: Use a while loop to keep calculating while 'again' is 'y'

        // TODO: Ask user for two numbers

        // TODO: Ask user for the operation (+, -, *, /)

        // TODO: Use if-else to perform the operation

        // TODO: Handle division by zero case

        // TODO: Ask if user wants to continue

        // TODO: Exit the loop and print a thank you message

    }
}
