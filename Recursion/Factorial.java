public class Factorial {
    public static int factorial(int n){
        if (n==0||n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
public static void main(String[]args){
        int result=factorial(5);
        System.out.println("Factorial: "+result);
}
}
