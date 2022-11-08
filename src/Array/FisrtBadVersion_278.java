package Array;

public class FisrtBadVersion_278 {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(isBadVersion(mid)){

                if(isBadVersion(mid - 1)){
                    right = mid - 1;
                }
                else{
                    return mid;
                }
            }
            else{

                if(isBadVersion(mid + 1)){
                    return mid + 1;
                }
                else{
                    left = mid + 1;
                }

            }
        }
        return -1;
    }

    private boolean isBadVersion(int mid) {
        return false;
    }

}
