public class Variables {
void showIntrest() {
    double amount;
    double intrest;
    amount = 1200.00;
    System.out.println("amount: " + amount);
    intrest = 3.0;
    amount = amount * (100 + intrest) / 100;
    System.out.println("after a year:" + amount);
    amount = amount * (100 + intrest) / 100;
    System.out.println("after 2 years: " + amount);
}
    public static void main(String[]args){
        (new Variables()).showIntrest();

    }
}


