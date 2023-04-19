// import java.util.Arrays;
// import java.util.Collections;
public class J05_Sorting {
    public static void main(String[] args) {
        // int[] arr = {13, 7, 6, 45, 21, 9, 2, 100};
        // Integer[] arr2 = {13, 7, 6, 45, 21, 9, 2, 100};
        // Arrays.sort(arr); // sort array
        // Arrays.sort(arr,1,4); // sort subarray;
        // Sorts arr[] in descending order
        // Arrays.sort(arr2,Collections.reverseOrder());

        // System.out.printf("Modified arr[] : %s", Arrays.toString(arr));
    }
// 1 ; Insertion Sort // TC: O(n^2)
    static void Insertion_sort(int[] arr){
        int n = arr.length;
        int key,j;
        for(int i=1;i<n;i++){
            key = arr[i];
            j = i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
// 2 ; Bubble Sort // TC: O(n^2)
    static void Bubble_Sort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0;i<n-1;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
// 3 ; Selection Sort // TC: O(n^2)
    static void Selection_Sort(int[] arr){
        int min_idx =0, n = arr.length;
        int temp = 0;
        for(int i = 0; i<n-1; i++){
            min_idx = i;
            for(int j = i+1; j < n; j++)
                if(arr[j]<arr[min_idx]) 
                    min_idx = j;
            
            temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }
    }
// 4 ; Quick Sort

}
