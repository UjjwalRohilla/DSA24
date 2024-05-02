package Questions.Strings;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
    public static String countAndSay(int n) {
        if(n==1){
            return "1";
        }
        String str = countAndSay(n-1);
        String s = "";
        int counter = 0;
        for(int i = 0;i<str.length();i++){
            counter++;
            if(i==s.length()-1||str.charAt(i)!=str.charAt(i+1)){
                s = s+counter+s.charAt(i);
                counter = 0;
            }
        }
        return s;
    }
}
