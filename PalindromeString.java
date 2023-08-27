import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0 ;
        int j = str.length() - 1 ;
        int flag = 0;
        while( str.charAt(i) != str.charAt(j)){
            flag = 1;
            i++;
            j--;
        }
        if(flag>0){
            System.out.println("not a palindrome");
        }
        else{
            System.out.println("a palindrome");
        }
    }
}
