public class App {
    public static void main(String[] args) {
        System.out.println("main class");
        // InnerApp.main(args);
        // InnerApp obj = new InnerApp();
    }

    static
     class InnerApp {
        public static void main(String[] args) {
            System.out.println(" inner main");
        }
        
    }
}

/*
 * don't need object for inner classes
 * if inner classes are not "static" it can contain 'main()' method 
 * 
 * 
 */