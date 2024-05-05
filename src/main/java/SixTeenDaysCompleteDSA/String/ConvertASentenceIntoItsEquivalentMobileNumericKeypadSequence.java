package SixTeenDaysCompleteDSA.String;

public class ConvertASentenceIntoItsEquivalentMobileNumericKeypadSequence {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        convertSentenceToNum(str);
    }
    public static void convertSentenceToNum(String str){
        if(str.isEmpty())return;
        String[] nums = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666"
        ,"7","77","777","7777","8","88","888","9","99","999","9999"};
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==' '){
                ans+=0;
            }else {
                ans+= nums[str.charAt(i)-'A'];
            }
        }
        System.out.println(ans);
    }
}
