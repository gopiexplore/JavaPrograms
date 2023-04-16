import java.util.Scanner;

public class Factorial {
    public static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
        else  return  n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to Find Factorial");
        int n=s.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial is "+fact);
    }
}
