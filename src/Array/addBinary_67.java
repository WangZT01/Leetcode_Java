package Array;

public class addBinary_67{

    public String addBinary(String a, String b) {

        if (a.length() < b.length()) {
            String t = a;
            a = b;
            b = t;
        }
        char arr[] = a.toCharArray();
        int add = 0;
        for (int i = b.length() - 1; i >= 0; i--) {
            int aIndex = i + a.length() - b.length();
            int j = Integer.valueOf(arr[aIndex] - 48) + Integer.valueOf(b.charAt(i) - 48) + add;
            if (j == 2) {
                arr[aIndex] = '0';
                add = 1;
            } else if (j == 3) {
                arr[aIndex] = '1';
                add = 1;
            } else {
                arr[aIndex] = (char) (j + 48);
                add = 0;
            }

        }
        for (int i = a.length() - b.length() - 1; i >= 0; i--) {
            int j = Integer.valueOf(arr[i] - 48) + add;
            if (j == 2) {
                arr[i] = '0';
                add = 1;
            } else {
                arr[i] = (char) (j + 48);
                add = 0;
            }
        }
        if (add == 1) {

            return "1" + String.valueOf(arr);
        } else {
            return String.valueOf(arr);
        }
    }

}
