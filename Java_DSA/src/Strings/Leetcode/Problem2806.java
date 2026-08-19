package Strings.Leetcode;

public class Problem2806 {

    public static int accountBalanceAfterPurchase(int purchaseAmount) {
        int rounded = ((purchaseAmount + 5) / 10) * 10;
        return 100 - rounded;
    }

    public static void main(String[] args) {
        int purchaseAmount = 15;

        System.out.println(accountBalanceAfterPurchase(purchaseAmount));
    }
}
