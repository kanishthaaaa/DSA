import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i <= no ; i++){
            if(no % i == 0){
                count ++ ;
            }
        }
        if(count == 2){
            System.out.println(no+"is prime");
        }
        else {System.out.println(no + " is not prime");}
       
        
    }
}
