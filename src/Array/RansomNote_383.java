package Array;

import java.util.Hashtable;

public class RansomNote_383 {

        /*
        Hashtable
         */
    public boolean canConstruct(String ransomNote, String magazine) {

        Hashtable<Character, Integer> h = new Hashtable<Character, Integer>();
        for(int i = 0 ; i < magazine.length(); i++){
            if( !h.containsKey(magazine.charAt(i))  ){
                h.put( magazine.charAt(i), 1);
            }
            else{
                h.replace(magazine.charAt(i), h.get( magazine.charAt(i) ) + 1 );
            }
        }
        for(int i = 0 ; i < ransomNote.length(); i++){
            if(  h.containsKey(ransomNote.charAt(i))  ){
                h.replace( ransomNote.charAt(i), h.get( ransomNote.charAt(i) ) - 1 );
                if( h.get( ransomNote.charAt(i) )  == 0 ){
                    h.remove( ransomNote.charAt(i) );
                }
            }
            else{
                return false;
            }
        }
        return true;
    }


    /**
     * array
     *     public boolean canConstruct(String ransomNote, String magazine) {
     *
     *         int array[] = new int[26];
     *         for(int i = 0; i < 26; i++){
     *             array[i] = 0;
     *         }
     *         for(int i = 0; i < magazine.length(); i++){
     *             array[Integer.valueOf(magazine.charAt(i)) - 97 ]++;
     *         }
     *         for(int i = 0; i < ransomNote.length(); i++){
     *             if( array[Integer.valueOf(ransomNote.charAt(i)) - 97] != 0)
     *                 array[Integer.valueOf(ransomNote.charAt(i)) - 97]--;
     *             else{
     *                 return false;
     *             }
     *         }
     *         return true;
     *     }
     */

    /**
     *     public boolean canConstruct(String ransomNote, String magazine) {
     * 		if (ransomNote.length() > magazine.length()) return false;
     *         int[] alphabets_counter = new int[26];
     *
     *         for (char c : magazine.toCharArray())
     *             alphabets_counter[c-'a']++;
     *
     *         for (char c : ransomNote.toCharArray()){
     *             if (alphabets_counter[c-'a'] == 0) return false;
     *             alphabets_counter[c-'a']--;
     *         }
     *         return true;
     *     }
     */
}
