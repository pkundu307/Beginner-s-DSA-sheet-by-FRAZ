public class buyandsellstock {

    public static int maxProfit(int[] p) {
        int min = p[0];
        int max = 0;
        int profit = 0;
        for (int i : p) {
            min = Math.min(i, min);
            profit = (i - min);
            max = Math.max(profit, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }
}
