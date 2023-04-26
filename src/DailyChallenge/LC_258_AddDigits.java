package DailyChallenge;

// import java.util.HashSet;

/**
 * LC_258_AddDigits
 * 26/04/2023
 */
public class LC_258_AddDigits {
    public static void main(String[] args) {
        // HashSet<Integer> hs = new HashSet<>( );
        // hs.c
    }
}

class Solution {
    public int addDigits(int num) {
        // base case
        if(num<10) return num;

        int x = 0;
        int temp;
        while(num>0){
            x += num%10;
            num = num/10;
            if(x>9){
                temp = x%10;
                x = x/10;
                x += temp;
            }
        }
        return x;
    }
}