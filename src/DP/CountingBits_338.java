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
}
