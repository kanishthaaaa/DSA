import java.util.Scanner;

class PalindromeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = n;
        int rev = 0 ;
        while(n!=0){
            int digit = n % 10 ;
            rev = rev * 10 + digit;
            n = n / 10 ;
        }
        if(rev == e){
            System.out.println(e+" is a palindrome.");
        }
        else{
            System.out.println(e+" is not a palindrome.");
        }
    }
}