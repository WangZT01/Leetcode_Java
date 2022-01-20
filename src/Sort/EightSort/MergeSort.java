package Sort.EightSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {29, 38, 74, 78, 24, 75, 42, 33, 21, 62, 18, 77, 30, 16};
        printArray("排序前：",a);
        MergeSort(a);
        printArray("排序后：",a);
    }

    private static void printArray(String pre,int[] a) {
        System.out.print(pre+"\n");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
    }
    private static void MergeSort(int[] a){
        System.out.println("开始排序");
        Sort(a, 0, a.length - 1);
    }
    private static void Sort(int[] a, int left, int right){

        if(left >= right){
            return;
        }
        int mid = (left + right)/2;
        Sort(a, left, mid);
        Sort(a, mid+1, right);
        merge(a,left,mid,right);
    }
    private  static void merge(int[] a, int left,int mid, int right){
        int[] t = new int[a.length];
        int r1 = mid + 1;
        int tIndex = left;
        int cIndex = left;
        while(left <= mid && r1 <= right){
            if(a[left] <= a[r1]){
                t[tIndex++] = a[left++];
            }
            else
                t[tIndex++] = a[r1++];
        }
        while(left <= mid){
            t[tIndex++] = a[left++];
        }
        while(r1 <= right){
            t[tIndex++] = a[r1++];
        }

        // TODO Auto-generated method stub
        //从临时数组拷贝到原数组
        while(cIndex<=right){
            a[cIndex]=t[cIndex];
            //输出中间归并排序结果
            System.out.print(a[cIndex]+"\t");
            cIndex++;
        }
        System.out.println();
    }
}
