public class App {
    public static void main(String[] args) {
        System.out.println("main class");
        
        System.out.println("GCD : " + gcd(18, 12));

    }   
    static int gcd(int a, int b){
        if (a == 0)
        return b;
        if (b == 0)
        return a;
    
        // base case
        if (a == b)
            return a;
    
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
        
    }
}

/*
 * don't need object for inner classes
 * if inner classes are not "static" it can contain 'main()' method 
 * 
 * 
 */