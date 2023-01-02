package DP;

public class DP_322 {
    public int coinChange(int[] coins, int amount) {

        int flag[] = new int[amount+1];

        if (amount == 0)
            return 0;
        for (int j = 0;j<=amount;j++){
            for (int i = 0;i<coins.length;i++){
                if (coins[i]>amount)
                    continue;
                if (j+coins[i] <= amount)
                    if ((flag[j]!=0||j == 0)&&(flag[j+coins[i]]>flag[j]+1||flag[j+coins[i]]==0))
                        flag[j+coins[i]] = flag[j]+1;
            }
        }
        return flag[amount]==0?-1:flag[amount];

    }
}
