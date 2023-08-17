import java.util.*;

public class BinarySearch {
    public static void main(String[] args){
        int [] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21};
        int target = 19;

        int showResultIndex = binarySearch(arr , target);

        if(showResultIndex!= -1){
            System.out.println(showResultIndex);
        }
        else{
            System.out.println("Result index not found");
        }
    }

    public static int binarySearch(int [] arr , int target){
        int low = 0;
        int high = arr.length - 1 ;
        
        while(low<=high){
            int mid = (low + high) / 2;

            if ( arr[mid] == target){
                return mid;
            }
            else if(arr[mid]< target){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1 ;
    }
}
