package String;

public class ZigzagConversion_6 {

    public String convert(String s, int numRows) {
        int setpart_column = numRows - 1;
        int part = 2 * numRows - 2;
        int size = s.length();

        if(part == 0){
            return s;
        }
        String str[] = new String[numRows];
        for(int i = 0; i < numRows ; i++){
            str[i] = "";
        }
        str[0] += s.charAt(0);
        for(int i = 1; i < size; i++){
            int index = i % part;
            if(index >= numRows){
                str[part - index] += s.charAt(i);
            }
            else{
                str[index] += s.charAt(i);
            }
        }
        String result = "";
        for(String temp : str){
            result += temp;
        }

        return result;
    }
}
