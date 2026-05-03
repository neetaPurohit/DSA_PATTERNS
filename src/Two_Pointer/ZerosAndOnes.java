package Two_Pointer;

public class ZerosAndOnes {

//    brute force approach:-

//    public static void  sort(int[] arr){
//        int n = arr.length;
//        int zeros = 0;
//
////        count number of zeros
//        for (int i=0; i<n; i++){
//            if (arr[i] == 0){
//                zeros++;
//            }
//        }
////        0 to zeros-1 add --> 0 , zeros to n-1 add 1
//        for (int i = 0; i<n; i++){
//            if (i < zeros){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//        }
//
//    }

//   optimized solution
    public static void sort(int[] arr){
        int n = arr.length;
//        two pointers
        int left = 0;
        int right = n-1;

        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }

    }
    static void main(String[] args) {
      int[] arr = {1,0,0,0,1,0};
        System.out.println("sorted array");
//        sort(arr);
//        printArr(arr);
        sort(arr);
        printArr(arr);
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
            System.out.println(i + " ");
        }
    }
}
