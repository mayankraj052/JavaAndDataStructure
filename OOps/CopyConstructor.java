// package OOps;
// import java.util.*;

// public class CopyConstructor {
//     // public static void main(String[] args) { 
//     //     int[] vals = {3, 7, 9}; 
//     //     Ex e = new Ex(vals); 
//     //     e.showData(); // prints out [3, 7, 9] 
//     //     vals[0] = 13; 
//     //     e.showData(); // prints out [13, 7, 9] 

//     //     // Very confusing, because we didn't 
//     //     // intentionally change anything about  
//     //     // the object e refers to. 
//     // } 

//     public static void main(String[] args) { 
//         int[] vals = {3, 7, 9}; 
//         Exs e = new Exs(vals); 
//         e.showData(); // prints out [3, 7, 9] 
//         vals[0] = 13; 
//         e.showData(); // prints out [3, 7, 9] 

//        // changes in array values will not be  
//        // shown in data values.  
//     } 
// }

// //code illustrating shallow copy 
// class Ex { 

//     private int[] data; 

//     // makes a shallow copy of values 
//     public Ex(int[] values) { 
//         data = values; 
//     } 

//     public void showData() { 
//         System.out.println( Arrays.toString(data) ); 
//     } 
// } 

// class Exs { 

//     private int[] data; 

//     // altered to make a deep copy of values 
//     public Exs(int[] values) { 
//         // data = new int[values.length]; 
//         // for (int i = 0; i < data.length; i++) { 
//         //     data[i] = values[i]; 
//         // } 
//         data=values.clone();
//     } 

//     public void showData() { 
//         System.out.println(Arrays.toString(data)); 
//     } 
// } 

import java.util.Arrays;

class LazyCopy {
    private int[] data;
    private int refCount; // Reference Counter

    public LazyCopy(int[] values) {
        this.data = values; // Shallow Copy Initially
        this.refCount = 1;  // 1 object shares this data
    }

    // Custom Copy Constructor
    public LazyCopy(LazyCopy obj) {
        this.data = obj.data; // Initially, shallow copy
        this.refCount = obj.refCount + 1; // Increment reference count
    }

    // Modify method (Lazy Deep Copy)
    public void modify(int index, int newValue) {
        if (refCount > 1) { 
            // Deep copy when modification is attempted on a shared object
            this.data = data.clone(); // Creates a separate copy
            this.refCount = 1; // Now only this object has a copy
        }
        this.data[index] = newValue;
    }

    public void showData() {
        System.out.println("Data: " + Arrays.toString(data) + " | RefCount: " + refCount);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        
        LazyCopy obj1 = new LazyCopy(arr);
        LazyCopy obj2 = new LazyCopy(obj1); // Initially shallow copy
        
        obj1.showData();  // Data: [1, 2, 3, 4, 5] | RefCount: 1
        obj2.showData();  // Data: [1, 2, 3, 4, 5] | RefCount: 2
        
        obj1.modify(2, 99); // Modification triggers deep copy
        
        obj1.showData();  // Data: [1, 2, 99, 4, 5] | RefCount: 1 (Deep Copied)
        obj2.showData();  // Data: [1, 2, 3, 4, 5] | RefCount: 2 (Unchanged)
    }
}

