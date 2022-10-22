package Top75;

public class isPalindrome_125 {
    // turn to the lowercase, then remove all the space or \n...
    // ignore the special token : , ....
    public boolean isPalindrome(String s) {
        int start = 0;
        s = s.toLowerCase();
        s = s.replaceAll("\\s+","");
        int end = s.length() - 1;
        if(s.length() <= 1){
            return true;
        }


        while(start <= end){

            while( !( (s.charAt(start) >= 97 && s.charAt(start) <= 122) ||  (s.charAt(start) >= 48 && s.charAt(start) <= 57) ) ){

                start++;
                if(start >= end)
                    return true;
            }

            while( ! ((s.charAt(end) >= 97 && s.charAt(end) <= 122) ||  (s.charAt(end) >= 48 && s.charAt(end) <= 57)) ){
                end--;
            }

            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
}
