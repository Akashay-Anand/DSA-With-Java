public class J00_Maths {
    public static void main(String[] args) {
        // countDigit(10000);  // 1
        
        // palindromeNum(1);  // 2
        
        // FactorialNum(5);  // 3
        // System.out.println(FactorialNumRecurs(5));  // 4
        
        // Trailing_Zero_In_Factorial(100);  // 5

        // GCD_of_2no(11, 9);  // 6
        // System.out.println(GCD_of_2no_Recur(9, 11));  // 7
        // LCM_of_2no(4, 6);  // 8

        // PRIME_no(1031);  // 9
        // Prime_Factor(450);  // 10
        // Prime_Factor_Modified(450);  // 11

        All_diviser(104); // 12
    }
    
// 1 Count Digit
    static void countDigit(int x){
        // method 1 : using strings and its methods
        String str = "" + Math.abs(x);
        System.out.println("Length = "+str.length());

        // method 2 : logics
        int count = 1;
        while(x>9){
            x /= 10;
            count++;
        }
        System.out.println("Length = "+count);
    }
    
// 2 palindrome number
    static void palindromeNum(int x){
        // method 1 : using String and its methods
        String str = "" + x ; // assuming x will be positive
        int flag = 1, n = str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i) != str.charAt(n-i-1) ){
                flag = -1;
                break;
            }
        }
        System.out.println((flag == 1)?"yes":"no");

        // Method 2 : logics (find reverse of that number and compare whether it same or not)   
        int rev = 0,temp = x;
        while(temp >0){
            rev = rev*10 + temp%10;
            temp /= 10;
        }
        System.out.println((x == rev)?"YES":"NO");


    }

// 3 Factorial of number
    static void FactorialNum(int x){
        // method 1
        int ans = 1;
        for(int i = 2; i<=x; i++){
            ans *= i;
        }
        System.out.println("ans is = " + ans);
    }
// 4
    static int FactorialNumRecurs(int x){
        // method 2 recursive solution // not memory effecient becouse every function call will store in stack until execution and that will take O(n) space
        if(x == 0) return 1;
        return x * FactorialNumRecurs(x-1);
    }
    
// 5 Trailing zero in factorial
    static void Trailing_Zero_In_Factorial(int x){
        // method 1 : Find factorial
        // long fact =1;
        int count = 0;
        // commented becouse for big number hanging issue.
        // for(int i=2;i<=x;i++){ 
        //     fact *= i; // overflow issue ; too big number sometimes
        // }
        // System.out.println("Fact: " + fact);
        // while(fact%10 == 0){
        //     count++;
        //     fact /= 10;
        // }
        // System.out.println("Ans: " + count);

        // Method 2 :
        count = 0;
        for(int i=5;i<=x;i *= 5){
            count += x/i;
        } 
        System.out.println("Ans: " + count);
        
        // Method 3 :
        count = 0;
        while(x>=5){
            count += x/5;
            x = x/5;
        }
        System.out.println("Ans: " + count);
    }

// 6 GCD
    static void GCD_of_2no(int a,int b){
        // method 1 brute force 
        int temp = (a>b)?b:a;
        while(temp>0){
            if(a%temp ==0 && b%temp == 0) break;
            temp--;
        }
        System.out.println(temp);
        
        // method 2: Euclide algorithm
        int a1 = a, b1 = b;
        while(a1 != b1){
            if(a1>b1)a1 = a1-b1;
            else b1 = b1-a1;
        }
        System.out.println(a1);

        // method 3: wrong....
        // wrong approach; becouse some times the difference is not a factor of anyone
        // temp = (a>b)?b:a;
        // if(a != b) // to remove '0' division exception
        // if(a%temp != 0 && b%temp == 0){
        //     if(a>b) temp = a%b;
        //     else temp = b%a;
        // }
        // System.out.println(temp);
    }
// 7
    static int GCD_of_2no_Recur(int a, int b){
        // recoursion aproach of eculides algo. for gcd
        if(b==0) return a;
        return GCD_of_2no_Recur(b, a%b);
    }

// 8 LCM 
    static void LCM_of_2no(int a, int b){
        // method 1
        int temp = a;
        a = (a>b)?b:a; // a is min
        b = (temp>b)?temp:b; // b is max
        temp = b;
        while(temp%a != 0){
            temp += b;
        }
        System.out.println(temp);

        // method 2: formula =>>  " (a*b) = gcd(a,b) * lcm(a,b) " 

        int lcm = (a*b)/GCD_of_2no_Recur(a, b);
        System.out.println(lcm);
    }

// 9 prime number
    static void PRIME_no(int x){
        // Method 1 // O(n/2)
        boolean flag = true;
        for(int i = 2; i <= x/2 ; i++){
            if(x%i == 0){
                flag = false;
                break;
            }
        }
        if(x == 1 ) System.out.println("false");
        else System.out.println(flag);

        // method 2 // O(sqrt(n))
        flag = true;
        for(int i = 2; i*i<=x;i++){
            if(x%i == 0){flag = false; break;}
        }
        if(x == 1 ) System.out.println("false");
        else System.out.println(flag);

        // method 3 // we can modify the code by checking divisibility  by 2 & 3 so that we do not have to check for even and odd number after that... 
        System.out.println( PRIME_no_modified(x) );
    }
    static boolean PRIME_no_modified(int x){ // 3 time s faster that method 2
        if(x == 1) return false;
        if(x==2 || x == 3) return true;
        if(x%2 == 0 || x%3 == 0) return false;
        for(int i = 5; i*i<=x ; i += 6)
            if(x%i ==0 || x%(i+2) == 0) return false;
        return true;
    }
// 10 All prime factor
    static void Prime_Factor(int x){
        // method 1 // O(n logn)
        for(int i = 2; i<=x;i++){
            if(PRIME_no_modified(i)){
                int t = i;
                while(x%t == 0){
                    System.out.println(i);
                    t = t*i;
                }
            }
        }
        // method 2
        if(x<=1) System.out.println("No");
        for(int i = 2; i*i<= x;i++ ){
            while(x%i == 0){
                System.out.println(i);
                x = x/i;
            }
        }
        if(x>1) System.out.println(x);
    }
// 11
    static void Prime_Factor_Modified(int x){ //O(sqrt(x))
        if(x<=1) System.out.println("No");
        while (x%2 ==0) {   System.out.println(2); x = x/2;  }
        while (x%3 ==0) {   System.out.println(3);  x = x/3; }
        for(int i = 5;i*i <= x; i += 6){
            while(x%i == 0){ System.out.println(i); x = x/i;  }
            while(x%(i+2) == 0){ System.out.println(i+2); x = x/(i+2);  }
        }
        if(x>3) System.out.println(x);
    }
// 12 
    static void All_diviser(int x){
        // Method 1;
        System.out.println("pair wise");
        for(int i = 1; i*i<=x; i++){
            if( x%i == 0 ){
                System.out.println(i);
                if(x/i != i)
                System.out.println(x/i);
            }    
        }

        // Method 2; sorted order
        System.out.println("sorted order: ");
        int i;
        for(i = 1; i*i < x;i++)
            if(x%i == 0) System.out.println(i);
        for( ; i>=1; i--)
            if(x%i == 0) System.out.println(x/i);
    }
// 13
    static void All_prime(int x){
        
    }
}
