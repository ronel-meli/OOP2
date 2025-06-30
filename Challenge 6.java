
    import java.util.Scanner;
    public class HelloTillShop {
        Scanner scanner = new Scanner(System.in);

        public void showHello() {
            String choice;
            System.out.println("For Hello type h, anything else to stop");
            choice = scanner.next();
            while ("h".equals(choice)) {
                System.out.println("Hello");
                choice = scanner.next();
            }
        }

        public static void main(String[] args) {
            (new HelloTillShop()).showHello();
        }
    }


