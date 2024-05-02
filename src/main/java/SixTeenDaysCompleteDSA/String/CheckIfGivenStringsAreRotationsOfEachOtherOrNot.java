package SixTeenDaysCompleteDSA.String;

public class CheckIfGivenStringsAreRotationsOfEachOtherOrNot{
    private boolean checkIfRotation(String str1,String str2){
        if((str1.isEmpty() && str2.isEmpty()) ||str1.isEmpty() || str2.isEmpty())return false;

        String strTemp = str1+str1;
        return strTemp.contains(str2);
    }
}
