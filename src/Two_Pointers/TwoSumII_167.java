package Two_Pointers;

public class TwoSumII_167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] an = new int[2];
        int last = numbers.length - 1;
        int first = 0;
        int sum = numbers[last] + numbers[first];
        while(last > first){
            if(sum == target){
                an[0] = first + 1;
                an[1] = last + 1;
                break;
            }
            else if(sum < target){
                first++;
                sum = numbers[last] + numbers[first];
            }
            else{
                last--;
                sum = numbers[last] + numbers[first];
            }
        }
        return an;
    }
}
