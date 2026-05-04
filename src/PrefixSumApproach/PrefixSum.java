package PrefixSumApproach;
public class PrefixSum {
//    using extra array
//    static  int[] prefixSum(int[] arr){
//        int n = arr.length;
//        int[] pref = new int[n];
//        pref[0] = arr[0];
//
//        for (int i=1; i<n; i++){
//            pref[i] = pref[i-1] + arr[i];
//        }
//        return pref;
//    }

//    optimized approach
         static int[] prefixSum(int[] arr){
             int n = arr.length;
             for (int i=1; i<n; i++){
                 arr[i] = arr[i-1] + arr[i];
             }
             return arr;
         }

    static void main(String[] args) {
         int[] arr = {1,2,3,4,5};
         int[] ans = prefixSum(arr);
         printArr(ans);
    }
    //    print array
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i :  arr){
            System.out.print(i + " ");
        }
    }
}
