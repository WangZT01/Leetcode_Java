package Array;

public class KClosestPointstoOrigin_973 {
    public int[][] kClosest(int[][] points, int k) {

        int[][] array2 = new int[k][2];
        quickSort(points, 0, points.length - 1);

        /*
        for(int i = 0; i < points.length; i++){
            System.out.println(points[i][0]+ " " +points[i][1]);
        }
        */

        for(int i = 0 ; i < array2.length ; i++){
            array2[i] = points[i].clone();
        }
        return array2;
    }

    public static void quickSort(int[][] points, int low, int high){
        int i, j;
        int t[];
        if(low > high){
            return;
        }
        i = low;
        j = high;
        int temp[] = points[(low + high)/2];
        int tempnum = temp[0] * temp[0] + temp[1] * temp[1];
        int change[] = points[(low + high)/2];
        points[(low + high)/2] = points[low];
        points[low] = change;
        while(i < j){
            while(tempnum <= points[j][0]*points[j][0] + points[j][1]*points[j][1] && i < j){
                j--;
            }
            while(tempnum >= points[i][0]*points[i][0] + points[i][1]*points[i][1] && i < j){
                i++;
            }
            if(i < j){
                t = points[j];
                points[j] = points[i];
                points[i] = t;
            }
        }
        points[low] = points[i];
        points[i] = temp;
        quickSort(points, low, j-1);
        quickSort(points, j+1, high);
    }
}
