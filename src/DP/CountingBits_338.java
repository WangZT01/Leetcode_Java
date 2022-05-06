package DP;

public class CountingBits_338 {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        int power = 0;
        a[0] = 0;
        int n2 = (int) Math.pow(2, power);
        for(int i = 1; i <= n; i++){

            if(i == n2){
                a[i] = 1;
                power++;
                n2 = n2 * 2;
            }
            if(i < n2){
                a[i] = 1 + a[i - n2/2];
            }
        }
        return a;
    }

    /*
    Number in binary add a zero means it is twice bigger than before.

    class Solution {
public int[] countBits(int n) {
int x = 2;
int i = 2;
int[] ar = new int[n+1];

    if(n==0)
    {
        ar[0] = 0;
        return ar;
    }
    if(n==1)
    {
        ar[0] = 0;
        ar[1] = 1;
        return ar;
    }

    ar[0] = 0;
    ar[1] = 1;
    while(i<=n)
    {
        if(x%2==0)
        {
            ar[i] = ar[i/2];
        }else{
            ar[i] = 1+ar[i/2];
        }
        i++;
        x++;
    }
    return ar;

}
     */
}
