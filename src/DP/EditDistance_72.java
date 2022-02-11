package DP;

public class EditDistance_72 {
    public int minDistance(String word1, String word2) {
        int word1length = word1.length();
        int word2length = word2.length();
        int bp[][] = new int[word1length + 1][word2length + 1];
        for(int i = 1; i < word1length+1; i++){
            bp[i][0] = bp[i - 1][0] + 1;
        }
        for(int j = 1; j < word2length+1; j++){
            bp[0][j] = bp[0][j - 1] + 1;
        }
        for(int i = 1; i < word1length; i++){
            for(int j = 1; j < word2length; j++){
                if(word1.charAt(i) == word2.charAt(j)){
                    bp[i][j] = bp[i-1][j-1];
                }
                else{
                    bp[i][j] = Math.min(bp[i-1][j], bp[i][j-1]);
                    bp[i][j] = Math.min(bp[i][j], bp[i-1][j-1])+1;
                }
            }
        }
        return bp[word1length][word2length];
    }
}
