package Two_Pointer;

import java.util.Arrays;

public class IncreasingSquares {
    static int[] sortSquares(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int[] ans = new int[n];
        int k =n-1;

        while (left <= right){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
//                ans[k--] = arr[left] * arr[left];
                ans[k] = arr[left] * arr[left];
                k--; //stores values from last index, here k represents index of ans array
                left++;
            }else {
                ans[k] = arr[right] * arr[right];
                k--;
                right--;
            }
        }
        return ans;
    }
    static void main(String[] args) {
       int[] arr = {-10, -3,-2,-1,-4,-5};
       int[] ans = sortSquares(arr);
        System.out.println(Arrays.toString(ans));
//       reverse(ans);
//        printArr(ans);
    }
    //    swap method
    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    //    print array
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i :  arr){
            System.out.print(i + " ");
        }
    }
    //   reverse array
    public static void reverse(int[] arr){
        int i=0, j=arr.length-1;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

}
