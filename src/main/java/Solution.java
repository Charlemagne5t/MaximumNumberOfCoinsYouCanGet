import java.util.Arrays;

public class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int sum = 0;
        int count = piles.length / 3;
        int i = piles.length - 2;
        while (count != 0) {
            sum += piles[i];
            i = i - 2;
            count--;
        }
        return sum;
    }
}