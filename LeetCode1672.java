// Author : Samridhi Gupta
// Date   : 08/01/2025
// 1672. Richest Customer Wealth
import java.util.Scanner;
public class LeetCode1672 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] accounts = new int[5][5];
        for (int rows = 0; rows < accounts.length; rows++) {
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                accounts[rows][cols] = scan.nextInt();
            }
        }
        System.out.println(new LeetCode1672().maximumWealth(accounts));
    }
    public int maximumWealth(int[][] accounts){
        int max = 0;
        for (int rows = 0; rows < accounts.length; rows++) {
            int sum = 0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                sum += accounts[rows][cols];
            }
                if (sum > max) {
                    max = sum;
    }
}
        return max;
    }
}