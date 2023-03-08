package Array;

public class IsSubsequence_392 {
    public boolean isSubsequence(String s, String t) {
        int spoint = 0;
        int j = 0;
        for(int i = 0 ; i < s.length(); i++){
            for(; j < t.length(); j++){
                if(s.charAt(i) == t.charAt(j)){
                    spoint++;
                    j++;
                    break;
                }
            }
        }
        return (spoint == s.length());

    }
}
