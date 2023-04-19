public class J03_Arrays {
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,5,4,6,2}, n= 8;

        System.out.println(repeat_element(arr, n));
    }

// 1 ; pair of 3 which sum is equal to k, arr is sorted
    static void Triplet_in_arr(int k, int[] arr){

    }
// 2 ; find which element is repeated
    /*  Constraints: 
    > arr size : n >= 2
    > only one element repeat any number of time
    > all the element from 0 to max(arr) are present.
    > arr element start from 1(if it start from 0... add 1 to it);
    */
    static int repeat_element(int arr[], int n)
	{   // added 1 in arr[]... becouse arr[] contains '0';
		int slow = arr[0]+1, fast = arr[0]+1;

		do{
			slow = arr[slow]+1;
			fast = arr[arr[fast]+1]+1;
		
		}while(slow != fast);
		
		slow = arr[0]+1;

		while(slow != fast)
		{
			slow = arr[slow]+1;
			fast = arr[fast]+1;
		}
		return slow-1;
	}

// 3 ; Median of two sorted Array
    static double Median_2arr(int arr1[], int arr2[], int n1, int n2)
	{ // note: arr1 size is smallar that arr2 .. given(n1<=n2)
		int begin1 = 0, end1 = n1;

		while(begin1 <= end1)
		{
			int i1 = (begin1 + end1) / 2;
			int i2 = ((n1 + n2 + 1) / 2 )- i1;

			int min1 = (i1 == n1)?Integer.MAX_VALUE:arr1[i1];
			int max1 = (i1 == 0)?Integer.MIN_VALUE:arr1[i1 - 1];
			
			int min2 = (i2 == n2)?Integer.MAX_VALUE:arr2[i2];
			int max2 = (i2 == 0)?Integer.MIN_VALUE:arr2[i2 - 1];

			if(max1 <= min2 && max2 <= min1)
			{
				if((n1 + n2) % 2 == 0)
					return ((double)Math.max(max1, max2) + Math.min(min1, min2)) / 2;
				else
					return (double) Math.max(max1, max2);
			}
			else if(max1 > min2)
				end1 = i1 - 1;
			else 
				begin1 = i1 + 1;
		}
		return -1;
	}

// 4 ; minimize the maximum page 
    public static boolean isFeasible(int arr[],int n,int k, int ans){
        int req=1,sum=0;
        for(int i=0;i<n;i++){
            if(sum+arr[i]>ans){
                req++;
                sum=arr[i];
            }
            else{
                sum+=arr[i];
            }
        }
        return (req<=k);
    }
    public static int minPages(int arr[],int n, int k){
        int sum=0,mx=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            mx=Math.max(mx,arr[i]);
        }
        int low=mx,high=sum,res=0;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasible(arr,n,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }

}
