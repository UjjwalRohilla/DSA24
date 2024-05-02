package Questions.Strings;

public class IfRotatedString {
    public static boolean isRotatedString(String str,String s){
        String newStr = str+str;
        if(newStr.contains(s)){
            return true;
        }
        return false;
    }
}
