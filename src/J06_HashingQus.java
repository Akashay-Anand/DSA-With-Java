import java.util.*;
public class J06_HashingQus {
    public static void main(String[] args) {
        // int[] arr1 = {1,1,1,2,3,4,2,3,2,4,5,6};
        // freq(arr1);
        // int[] arr2 = {4,2,-4,1,6};
        // zeroSumsubarray(arr2);

        int[] arr3 = { 15, 2, 4, 8, 9, 5, 10, 23 };
        x_Sumsubarray(arr3, 23);
    }
    
    // Count frequency
    static void freq(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
    // sub array with zero sum
    static void zeroSumsubarray(int[] arr){
        boolean flag = false;
        int sum = 0;
        // method 1 : TC= O(n^2)
        /* 
        for(int i=0;i<arr.length-1;i++){
            sum = 0;
            for(int j = i;j<arr.length;j++){
                sum += arr[j];
                if(sum == 0) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        System.out.println(flag?"True":"False");
        */

        // method 2
        HashSet<Integer> hs = new HashSet<>();
        sum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(sum == 0 || hs.contains(sum)){
                flag = true;
                break;
            }else{
                sum += arr[i];
                hs.add(sum);
            }
        }
        System.out.println(flag?"True":"False");
    }

    static void x_Sumsubarray(int[] arr, int sum){
        int cur_sum = arr[0], start=0;
        boolean flag = false;
        for(int i=1;i<arr.length;i++){
            while(cur_sum>sum && start < i-1){
                cur_sum = cur_sum - arr[start];
                start++;
            }
            
            if(cur_sum == sum){
                int p = i-1;
                System.out.println("Sum found between indexes " + start + " and " + p);
                flag = true;
                break;
            }

            if(i<arr.length) cur_sum = cur_sum + arr[i];
        }
        if(!flag) System.out.println("Not Found");
    }

    static void L_sa_with_equal01(int arr[]){
        // HashMap

    }
}