package PrefixSumApproach;

import java.util.Scanner;

public class RangeQuery {

    static void prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};

        prefixSum(arr);  // in-place prefix

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {
            System.out.println("Enter range (1-based l r):");
            int l = sc.nextInt();
            int r = sc.nextInt();

            // convert 1-based → 0-based
            l--;
            r--;

            int ans;
            if (l == 0) {
                ans = arr[r];
            } else {
                ans = arr[r] - arr[l - 1];
            }

            System.out.println("Sum: " + ans);
        }

        sc.close();
    }
}