/*
 * # Hashing
 * > HashTable (A synchronized implementation of hashing) : This class implements a hash table, which maps keys to values. Any non-null object can be used as a key or as a value.
 * *  
 * 
 * > HashMap (A non-synchronized faster implementation of hashing) : HashMap is also similar to HashTables in Java but it is faster in comparison as it is not synchronized. HashMap is used to store key-value pairs or to map a given value to a given key. The general application of HashMap is to count frequencies of elements present in an array or a list.
 * * 
 * 
 * > LinkedHashMap (Similar to HashMap, but keeps order of elements) 
 * 
 * > HashSet (Similar to HashMap, but maintains only keys, not pair) : The HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance. The class also offers constant time performance for the basic operations like add, remove, contains, and size assuming that the hash function disperses the elements properly among the buckets. HashSet is generally used to keep a check on whether an element is present in a list or not.
 * * 
 * 
 * > LinkedHashSet (Similar to LinkedHashMap, but maintains only keys, not pair)
 * 
 * > TreeSet (Implements the SortedSet interface, Objects are stored in a sorted and ascending order)
 * 
 */
import java.util.*;
public class J06_Hashing {
    public static void main(String[] args) {
        // HashTable
        // hashtablefun();
        
        // HashSet
        // hashsetfun();

        // LinkedhashSet
        linkedhashsetfun();

        // HashMap
        // hashmapfun();

        // LinkedHashMap
        // linkedhashmapfun();

        // TreeSet
        // treesetfun();

    }

    static void hashtablefun(){
        // Hashtable<>
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(1,"Anand");
        System.out.println(ht);
    }
  
// HashMap
    static void hashmapfun(){
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("hello",1); // TC: O(1) (on average)
        hm.put("Hello",2);
        hm.put("anand",3);

        hm.put("hello", hm.get("hello") +1);
        System.out.println(hm);
        System.out.println("isEmpty = " + hm.isEmpty()); // TC: O(1) (on worst case)
        System.out.println("Size = "+hm.size()); // TC: O(1) (on worst case)

        System.out.println( hm.containsKey("Hello")); // TC: O(1)
        System.out.println(hm.containsValue(3)); // TC: O(n)
        System.out.println(hm.get("anand")); // TC: O(1) 
        System.out.println(hm.remove("Hello")); // TC: O(1)
        System.out.println(hm.get("Hello")); // TC: O(1) 

        // Itrating over HashMap
        for(Map.Entry<String,Integer>e : hm.entrySet()){
            System.out.println(e.getKey()+" = "+ e.getValue());
        }

    }

// LinkedHashMap
    static void linkedhashmapfun(){
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
        lhm.put("one", "hello");
        lhm.put("two", "Anand");
        lhm.put("four","kumar.001");

        System.out.println(lhm);
        System.out.println("Getting value for key 'one': " + lhm.get("one")); 
        System.out.println("Size of the map: " + lhm.size()); 
        System.out.println("Is map empty? " + lhm.isEmpty()); 
        System.out.println("Contains key 'two'? "+  lhm.containsKey("two")); 
        System.out.println("Contains value 'kumar" + ".001'? "+ lhm.containsValue("kumar"+ ".001")); 
        System.out.println("delete element 'one': " + lhm.remove("one")); 
        System.out.println(lhm);


    }

// HashSet (duplicate not allowed)
    static void hashsetfun(){
        HashSet<String> hs = new HashSet<String>();
        hs.add("hello"); // add element or return false if exist
        hs.add("Akashay");
        hs.add("Anand");
        hs.add("see");

        hs.remove("hello"); // remove or false
        // Display 
        System.out.println(hs);
        // isEmpty 
        System.out.println(hs.isEmpty());
        
        // check of key 
        // System.out.println(hs.contains("Anand")); 

        // Iterating over hashset
        Iterator<String> i = hs.iterator();
        while(i.hasNext())
            System.out.print(i.next()+" ");
        // Itrating through loop
        for(String s : hs)
            System.out.print(s + " ");
        
        hs.clear();
        System.out.println("\n"+hs.isEmpty());
    }

// LinkedHashSet
    static void linkedhashsetfun(){
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(2);
        lhs.add(3);
        lhs.add(1);
        lhs.add(4);
        
        Iterator<Integer> it = lhs.iterator();
        while(it.hasNext()){
            
        }

        System.out.println( "d = " + lhs.add(2)); // duplicate not allowed ; this won't work becouse '2' already exist ;
        System.out.println("order maintain / no duplicate");
        System.out.println("Original LinkedHashSet:" + lhs);
        System.out.println("Size of LinkedHashSet = " + lhs.size());   
        System.out.println("Removing 1 from LinkedHashSet: " + lhs.remove(1));   
        System.out.println("Trying to Remove 9 which is not "+ "present: " + lhs.remove(9));   
        System.out.println("Checking if 2 is present=" +  lhs.contains(2)); 
        System.out.println("Updated LinkedHashSet: " + lhs);
    }
  
    // TreeSet (duplicate not allowed)
    static void treesetfun() {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("B");
        ts.add("A");
        ts.add("C");

        // Duplicates will nat get insert
        ts.add("A");

        // Elements get stored in default natural 
        // Sorting Order(Ascending) 
        System.out.println("TreeSet: " + ts);

        // Checking if A is present or not
        System.out.println("\nTreeSet contains A or not:" + ts.contains("A"));

        // Removing items from TreeSet using remove()
        ts.remove("A");

        // Printing the TreeSet
        System.out.println("\nTreeSet after removing A:" + ts);

        // Iterating over TreeSet items
        System.out.println("\nIterating over TreeSet:");
        
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}




/*
 * HashSet: 
 * > duplicate values are not allowed
 * > NULL elements are allowed in HashSet
 
 Method	Description
.add()	 Used to add the specified element if it is not present. If the element is already present then skip and return false.
.contains()	Used to return true if an element is present in set.
.iterator()	Used to return an iterator over the element in the set.
.size()	Used to add the specified element if it is not present. If the element is already present then skip and return false.
.remove()	Used to return true if an element is present in set.
.isEmpty()	Used to return an iterator over the element in the set.
.clear()	Used to return an iterator over the element in the set.
 */