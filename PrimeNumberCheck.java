import java.util.Scanner;

public class PrimeNumberCheck {
    static  void primeNumber(int n){
        int flag=0;
        if(n==0 || n==1){
            flag=1;
        }
        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Not a Prime");
        }
        else System.out.println("Prime");
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Number to check it is prime or not");
        int n=s.nextInt();
        primeNumber(n);
    }
}
