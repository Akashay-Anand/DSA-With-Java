public class J02_Bitwise {
    public static void main(String[] args) {
        
        // & == and
        // | == or
        // ~ == not
        // ^ == xor

        System.out.println("And " + (2&3));
        System.out.println("OR " + (2|3));
        System.out.println("EOR " + (2^3));
        System.out.println("NOT " + ~2);

        // << == left shift 
        // >> == right shift 

        

    }
    // this code checks wether the k'th bit is set or not

// static void bit_k_set(int n, int k){
// 	    int x = 1;
// 	    int temp = n;
	    
// 	    // Method 1 
// 	    for(int i = 0; i< (k-1); i++){
// 	        x = x*2;
// 	    }
// 	    if((temp & x) != 0)
// 	    System.out.println("Yes");
// 	    else 
// 	    System.out.println("No");
	    
// 	    // Method 2
// 	    for(int i = 0; i<(k-1); i++){
// 	        temp = temp/2;
// 	    }
// 	    if((temp & 1) != 0)
// 	    System.out.println("Yes");
// 	    else System.out.println("No");
	    
// 	    // Method 3
// 	    x = (1<<(k-1));
// 	    if((n & x) != 0) 
// 	    System.out.println("Yes");
// 	    else 
// 	    System.out.println("No");

//         // Method 4	    
//         x = (n>>(k-1));
//         if((x & 1) != 0)
//         System.out.println("Yes");
//         else 
//         System.out.println("No");
	    
// 	}

// // Count number of set bits of a number

// static void count_set_bits(int n){
//         int x = 0;
//         int temp = n;
//         // Method 1
//         for(int i = 1; i<=n; i=i*2){
//             if((n&i) != 0) x++;
//         }
//         System.out.println(x);
        
//         // Method 2
//         x = 0;
//         while(temp>0){
//             // if (temp%2 == 1) x++;
//             x = x + (temp & 1);
//             temp= temp/2;
//         }
//         System.out.println(x);
        
//         // Method 3
//         // Brian Kerningam's Algorithm
//         // traverse througt only the set bits ; TC: Thita(set bit count);
//         x = 0;
//         temp = n;
//         while(temp > 0){
//             temp = temp & (temp-1);
//             x++;
//         }
//         System.out.println(x);
// }
//     // Method 4 ; for 32 bit number only ;Table based aproach // TC: O(1)
//     // the idea is to set count bits in 'O(1)' time with some preprocessing involved
//     //
    
//     int tbl[] = new int[256];
//     static void initialize(){
//         tbl[0] = 0;
//         for(int i = 1; i< 256; i++)
//             tbl[i] = tbl[i & (i-1)] + 1;
//     }
//     static void countSetBits(int n){
//        return tbl[n & 255] + tbl[(n>>8) & 255] + tbl[(n>>16) & 255] + tbl[(n>>24)];
//     }
    
// // check whether the number is power of 2 or not

// static boolean power_of_2(int n){
//         int x= 0;
//         if(n==0) return false;
//         while(n !=1){
//             if(n%2 != 0) return false;
//             n = n/2;
//         }
//         return true;
// }
	
// 	// Method 2; O(1) ; Brian Kerningam algorithm ;
// 	static boolean power_of_2Brian(int n){
// 	    if(n==0) return false;
// 	    return ((n & (n-1)) == 0);
	    
// 	   // return (n && ((n&(n-1)) == 0)); // single line code try in c++
// 	}

//     // a array have odd occurance of one number,"rest are even".. find that number;
//     // '^' property: x^x = 0; x^0 = x;
//     // TC: Theta(n); Aux Space: O(1)
//     static void odd_num(int arr[] ,int n){
//         int ans = arr[0];
//         for(int i = 1; i<n; i++ )
//             ans = ans ^ arr[i];
        
//         System.out.println(ans);
//     }
    
    
//         // a array have odd occurance of one number,"rest are even".. find that number;
//     // '^' property: x^x = 0; x^0 = x;
//     // TC: Theta(n); Aux Space: O(1)
//     static void odd_num(int arr[] ,int n){
//         int ans = arr[0];
//         for(int i = 1; i<n; i++ )
//             ans = ans ^ arr[i];
        
//         System.out.println(ans);
//     }
    
//     // code to find two numbers with odd occurance in array; the array should have two odd accurance only
//     static void oddAppearing(int arr[], int n)
//     {
//         int xor = 0, res1 = 0, res2 = 0; 
        
//         for (int i = 0; i < n; i++) 
//             xor = xor ^ arr[i]; 
        
//         // this finds a number which has only 1 bit set and the set bit corresponds to last set bit of xor
//         int sn = xor & (~(xor - 1)); 
  
//         for (int i = 0; i < n; i++) 
//         { 
//             if ((arr[i] & sn) != 0) 
//                 res1 = res1 ^ arr[i]; 
//             else
//                 res2 = res2 ^ arr[i]; 
//         } 
//         System.out.println( res1 + " " + res2);
//     }
    
    
//     // print all subset of a String
//     // no overhed of recursion ; TC: Theta(2^n * n) ; 
//     static void printPowerSet(String str)
//     {
//     	int n = str.length();

//     	int powSize = (int)Math.pow(2, n);

//     	for(int counter = 0; counter < powSize; counter++)
//     	{
//     		for(int j = 0; j < n; j++)
//     		{
//     			if((counter & (1 << j)) != 0)
//     				System.out.print(str.charAt(j));
//     		}
    		
//     		System.out.println();
//     	}
//     }

}


/*
 * 8421
 * 0000 = 0
 * 0001 = 1
 * 0010 = 2
 * 0011 = 3
 * 0100 = 4
 * 0101 = 5
 * 0110 = 6
 * 0111 = 7
 * 1000 = 8
 * 1001 = 9
 * 1010 = 10
 * 1011 = 11
 * 
 * 
 */