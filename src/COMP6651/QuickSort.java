package COMP6651;

public class QuickSort {
    public static void QuickSort(int arr[], int low, int high){
        if(low > high){
            return;
        }
        int i, j, temp, t;
        temp = arr[(low + high)/2];
        int change = arr[(low + high)/2];
        arr[(low + high)/2] = arr[low];
        arr[low] = change;
        i = low;
        j = high;
        while(i < j){
            for(; j > i; j--){
                if( arr[j] < temp){
                    break;
                }
            }
            for(; i < j; i++){
                if(arr[i] > temp){
                    break;
                }
            }
            if(i < j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        QuickSort(arr, low, i-1);
        QuickSort(arr, i+1, high);
    }
    public static void main(String[] args){
        int[] arr = {29, 38, 74, 78, 24, 75, 42, 33, 21, 62, 18, 77, 30, 16};
        QuickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
