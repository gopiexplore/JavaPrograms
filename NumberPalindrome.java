import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int x=a;
        int rev=0;
        while (a>0){
            rev=(rev*10)+a%10;
            a=a/10;
        }
        if(x==rev){
            System.out.println("Palindrome");
        }else System.out.println("Not A Palindrome");
    }
}
