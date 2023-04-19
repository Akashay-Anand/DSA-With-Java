/**
 * J_04_Searching
 */
public class J04_Searching {
    public static void main(String[] args) {
        // int[] arr1 = {1,3,5,7,9,10,12,15,17};
        // int[] arr2 = {2,3,3,5,6,6,6,6,6,6,6,6};
        // int[] arr3 = {0,0,0,0,1,1,1,1,1};
        // System.out.println("BS: " +Binary_search(arr1 , 5)); // 1 
        // System.out.println("RBS: " +Recursive_BSearch(arr1, 5, 0, 7)); // 2

        // System.out.println("FO: "+first_Occurrence(arr2, 6)); // 3
        // System.out.println("LO: "+Last_Occurrance(arr2, 6)); // 4
        // System.out.println("Count: " +Count_Occurrence(arr2, 6)); // 5
        // System.out.println("count 1: " + Count_1s_in_sorted_array(arr3, 1) ); // 6
        // System.out.println("infiniteS: "+search_in_infinite_Arr(arr3, 9)); // 7
        System.out.println("sqrt: " +Squareroot(25)); // 8
        //9
        //10
    }

    // 1 ; itrative  BS
    static int Binary_search(int[] arr ,int item){
        // work with sorted array ; 
        // find mid compare with item update pointers
        int start = 0, end = arr.length-1 , mid = 0;
        while(start<=end){
            mid = (start+end) /2;
            if(arr[mid] == item) return mid;
            if(item < arr[mid]) end = mid-1;
            else start = mid +1;
        }
        return -1;
    }
// 2 ; recursive
    // in general for 'n' size array we need O(log n) recursive call
    // SO recursive call stak holds O(log n) call 
    // auxiliary space required is O(log n);
    static int Recursive_BSearch(int[] arr, int item, int start, int end){
        if(start>end) return -1;
        int mid = (start+end)/2;
        if(item == arr[mid]) return mid;
        else if(item > arr[mid]) return Recursive_BSearch(arr, item, mid+1, end);
        else return Recursive_BSearch(arr, item, start, mid-1);

    
    }
// 3 ; first occurance of the given element(item)
    static int first_Occurrence(int[] arr,int item){
    // Method-1: TC = O(n) 
        // for(int i=0;i<arr.length;i++){
        //     if(item == arr[i]) return i;
        // }
    // Method-2: TC = O(log n) ; BT
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start+end) / 2;
            if(item < arr[mid]) end = mid-1;
            else if(item > arr[mid]) start = mid+1;
            else{
                if(mid == 0 || arr[mid-1] != item) return mid;
                else end = mid-1; 
            }
        }
        return -1;
    }
// 4 ;
    static int Last_Occurrance(int[] arr, int item){
        int start = 0, end = arr.length - 1;
        while(start <= end){
            int mid = (start+end) / 2;
            if(item < arr[mid]) end = mid-1;
            else if(item > arr[mid]) start = mid+1;
            else{
                if(mid == arr.length - 1 || arr[mid+1] != item) return mid;
                else start = mid+1; 
            }
        }

        return 0;
    }
// 5 ; count number of occurrence in sorted array
    static int Count_Occurrence(int[] arr, int item){
        // Method-1: TC O(n);
        // int count = 0;
        // for(int i = 0; i<arr.length;i++){
        //     if(arr[i] == item) count++;
        // }
        // return count;

        // Method-1: TC O(log n);
        int first = first_Occurrence(arr, item);
        if(first == -1)
            return 0;
        else return (Last_Occurrance(arr, item) - first + 1);
    }
// 6; 
    static int Count_1s_in_sorted_array(int[] arr, int item){
        int start = first_Occurrence(arr, 1);
        if(start != -1) return  arr.length - start;
        else return 0;
    }
// 7; Unbounded Binary Search ; Infinite sized array
    static int search_in_infinite_Arr(int[] arr , int item){
        if(arr[0] == item) return 0;
        int high = 1;
        while(arr[high] < item)
            high = high*2;
        if(arr[high] == item) return high;
        int low = (high/2) + 1;
        // BS
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == item) return mid;
            if(arr[mid] > item) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
// 8; find Squareroot of n ; floor value if not perfect square
    static int Squareroot(int n){
        // using binary search 
        // TC: O(log n)
        
        // base case (if we assign right = n/2) we have to check for '1'
        // we ca avoid this base case by assign. (right = n)
        if(n == 1) return 1; 

        int low = 1, high = n/2; // use long 
        while(low<=high){
            int mid = low + (high - low)/2; // number can be to big // use long
            if(mid * mid == n) return mid;
            if(mid*mid > n) high = mid-1;
            else low = mid+1;
        }
        return high;
    }
// 9; search in rotated array // sorted array
    static int Search_in_rotated_arr(int[] arr, int item){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid] == item) return mid;
            if(arr[low] < arr[mid]){
                if(arr[low]<=item && arr[mid]>item) high = mid-1;
                else low = mid +1;
            }else{
                if(arr[mid]<item && arr[high]>=item) low = mid+1;
                else high = mid-1;
            }
        }
        return -1;
    }
// 10;
    static int Peak_Element(int[]arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high)>>1;
            if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length - 1 || arr[mid + 1] <= arr[mid]))
			    break;
	
	    	if (mid > 0 && arr[mid - 1] > arr[mid])
		    	high = mid - 1;
	    	else
		    	low = mid + 1;
        }
        return mid;
    }
}