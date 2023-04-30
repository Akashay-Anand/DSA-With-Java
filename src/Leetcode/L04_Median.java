package Leetcode;

public class L04_Median {
    
}
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int n = (l1+l2);
        int n2 = n;
        if(l1 == 0 && l2 == 0) return 0.0;
        else if( l1 ==0){return (l2%2 !=0 )? nums2[l2/2] :(nums2[(l2/2)-1]+nums2[l2/2])/2.0;
        }
        else if( l2 ==0 ) return (l1%2 !=0)?nums1[l1/2]:(nums1[(l1/2)-1]+nums1[l1/2])/2.0;
        
        else{
            int new_arr[] = new int[n];
    
            for(int i=0;i<l1;i++) new_arr[i] = nums1[i];
		    
            n=n-1; l1 = l1-1; l2 = l2-1;
		    
            while(l2>=0){
		        if(l1 >= 0 && new_arr[l1]>nums2[l2]) new_arr[n--] = new_arr[l1--];
		        else new_arr[n--] = nums2[l2--];
		    }
            if(n2%2 != 0) return new_arr[n2/2] ;
            else return (new_arr[(n2/2)-1]+new_arr[n2/2])/2.0;
                
            } 
    }
}