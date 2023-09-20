public class LinearSearch {
    // public static void main(String[] args) {
    //     //searching for the target in the array
    //     int[] list = {23,4,22,8,7,67,1};
    //     int target = 2;
    //     int ans = linearSearch(list , target);
    //     System.out.println(ans);
    // }
    // static int linearSearch(int[] list, int target){
    //     //checking for the target
    //     for(int i = 0 ; i < list.length ; i++){
    //         if(target == list[i]){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    //searching for a character in a string
    public static void main(String[] args) {
        String name = "Kanishtha Sahu";
        char target = 'S';
        int ans = searchInString(name, target);
        System.out.println(ans);
    }
    static int searchInString(String name, char target){
        for(int i = 0 ; i < name.length(); i++){
            if(name.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }
}
