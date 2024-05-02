package SixTeenDaysCompleteDSA.String;

public class AllSubSequenceString {
    public static void main(String[] args) {
        subSequence("abc");
    }
    private static void subSequence(String str){
        print("",str);
    }

    private static void print(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        print(p+ch,up.substring(1));
        print(p,up.substring(1));
    }
}
