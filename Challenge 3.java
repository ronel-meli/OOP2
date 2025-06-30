import java.util.Scanner;

public class choices {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int age;

            System.out.println("Age Verification System");

            while (true) { // Keeps running until valid input is given
                System.out.print("Enter your age: ");

                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();

                    if (age >= 18) {
                        System.out.println(" Access granted! You are " + age + " years old.");
                        break; // Exit the loop
                    }
                    else if (age > 0) {
                        System.out.println("Sorry, you must be 18 or older.");
                        break; // Exit after denying access
                    }
                    else {
                        System.out.println("Invalid age. Please enter a positive number.");
                    }
                }
                else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // Clear the invalid input
                }
            }

        }
    }

