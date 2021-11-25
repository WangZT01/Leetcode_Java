package Sort;
import java.util.*;
import java.util.concurrent.BlockingQueue;



public class MergeIntervals_56 {

    public int[][] merge(int[][] intervals) {


        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(intervals[0][0]);
        arrayList.add(intervals[0][1]);
        for(int i = 1; i < intervals.length; i++){
            boolean result = true;
            for(int j = 0; j < arrayList.size(); j += 2){

                if(intervals[i][0] < arrayList.get(j)){
                    arrayList.remove(j);
                    arrayList.add(j, intervals[i][0]);
                    if(intervals[i][1] > arrayList.get(j+1)){
                        arrayList.remove(j+1);
                        arrayList.add(j+1, intervals[i][1]);
                    }
                    result = false;
                    break;
                }
                else if(intervals[i][0] < arrayList.get(j+1)){
                    if(intervals[i][1] > arrayList.get(j+1)){
                        arrayList.remove(j+1);
                        arrayList.add(j+1, intervals[i][1]);
                    }
                    result = false;
                    break;
                }
            }
            if(result){
                arrayList.add(intervals[i][0]);
                arrayList.add(intervals[i][1]);
            }
        }


        Stack<Integer> q = new Stack<Integer>();

        q.add(arrayList.get(0));
        q.add(arrayList.get(1));
        for(int i = 2; i < arrayList.size(); i+=2){

            if(arrayList.get(i) <= q.peek()){
                q.pop();
                q.push(arrayList.get(i));
            }
            else {
                q.push(arrayList.get(i));
                q.push(arrayList.get(i+1));
            }
        }
        int s = q.size();
        int [][] result = new int[s/2][2];

        for (int i = s/2-1; i >= 0 ; i--) {
            for (int j = 1; j >= 0 ; j--) {
                result[i][j] = q.peek();
                q.pop();
            }
        }
        return result;
    }

}
