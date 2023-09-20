import java.util.Scanner;

class TwoDarrays{
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int row = 0 ; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        System.out.println("2-D Array");
        for(int row = 0 ; row < arr.length; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col]);
            }
            System.out.println();
        }
    }
}