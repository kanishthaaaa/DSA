public class ReverseString{
    public static void main(String[] args){
        String str= "geeks";
        String ans = reverseString(str);
        System.out.println(ans);
    }
    static String reverseString(String str){
        char temp;
        String rstr = "";
        for(int i = 0; i<str.length(); i++){
            temp = str.charAt(i);
            rstr = temp + rstr;
        }
        return rstr;
    }
}