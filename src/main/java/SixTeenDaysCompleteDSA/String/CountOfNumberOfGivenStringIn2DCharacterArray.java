package SixTeenDaysCompleteDSA.String;

public class CountOfNumberOfGivenStringIn2DCharacterArray {
    public static void main(String[] args) {
        char[][] ch = {
                {'D','D','D','G','D','D'},
                {'B','B','D','E','B','S'},
                {'B','S','K','E','B','K'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','E'},
                {'D','D','D','D','D','G'}
        };
        String str = "GEEKS";
        System.out.println(countInArray(ch,str));

    }
    public static int countInArray(char[][] ch,String str){
        int count = 0;
        int strSize = str.length();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                count += solve(i,j,str,ch,strSize,0);
            }
        }
        return count;
    }

    private static int solve(int i, int j, String str, char[][] ch, int strSize, int idx) {
        int found = 0;
        if(i>=0 && j>=0 && i<ch.length && j<ch[0].length && ch[i][j]==str.charAt(idx)){
            char temp = ch[i][j];
            ch[i][j] = 0;
            idx++;
            if(idx>=strSize){
                found = 1;
            }else {
                found+=solve(i-1,j,str,ch,strSize,idx);
                found+=solve(i+1,j,str,ch,strSize,idx);
                found+=solve(i,j-1,str,ch,strSize,idx);
                found+=solve(i,j+1,str,ch,strSize,idx);
            }
            ch[i][j] = temp;
        }
        return found;
    }
}
