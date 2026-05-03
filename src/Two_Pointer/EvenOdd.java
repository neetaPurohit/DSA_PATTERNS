package Two_Pointer;

public class EvenOdd {
    public static void sortedArrayByParity(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while (left < right){
            if (arr[left] % 2 !=0 && arr[right] % 2 == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] %2 == 0){
                left++;
            }
            if (arr[right] %2 != 0){
                right--;
            }

        }
    }
    static void main(String[] args) {
        int[] arr = {1,3,4,5,6,8};
        sortedArrayByParity(arr);
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
            System.out.print(i + " ");
        }
    }
}
