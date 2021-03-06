import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ds_array_and_arraylist {

  public static void array() {
    /*
      An array is a basic data structure to store a collection of elements sequentially.
      Each element in the array can be accessed by index.
    */

    // Array

    int[] a0 = new int[5];            // initialise, 1st method
    int[] a1 = {1,2,3};               // initialise, 2nd method
    
    // Standard
    int length = a1.length;           // length of the array
    int first = a1[0];                // access an element
    a1[1] = 4;                        // modifying an element

    for (int i=0; i<length; ++i) {    // iterating over the array, 1st method
      System.out.println(a1[i]);  
    }

    for (int item : a1) {             // iterating over the array, 2nd method
      System.out.println(item);
    }

    Arrays.sort(a1);                  // sort using the standard Arrays library


    // 2D array

    int[][] arr = new int[2][5];           // intialise, 1nd method
    
    int[][] b_arr = new int[2][];          // initialise, 2nd method
    b_arr[0] = new int[3];
    b_arr[1] = new int[5];
    
    for (int i=0; i<arr.length; ++i) {     // iterate the columns
      System.out.println(arr[i]);
    }

    for (int i=0; i<arr.length; ++i) {     // iterate both columns and rows
      for (int j=0; arr[i]!= null && j<arr[i].length; ++j) {
        System.out.println(arr[i][j]);
      }
    }

  }

  
  public static void arrayList() {
    /*
      An array has a fixed capacity and we need to specify the size of the array when we initialise it.
      Dynamic array (ArrayList) is an array with all its features (random access), but with variable size.
    */
 
    ArrayList<Integer> v0 = new ArrayList<>();  // initialise, 1st method
    ArrayList<Integer> v1;                      // initialise, 2nd method

    Integer[] a = {0, 1, 2, 3, 4};
    v1 = new ArrayList<>(Arrays.asList(a));     // cast an array to an ArrayList

    ArrayList<Integer> v2 = v1;                 // another reference to v1
    List<Integer> v3 = new ArrayList<>(v1);     // the actual copy fo v1

    // standard
    v1.size();                                  // size of the ArrayList
    v1.set(0, 5);                               // modify element (set element)
    v1.get(0);                                  // access element (get element)
    v1.add(-1);                                 // add element at the end
    v1.add(1, 6);                               // add element at the specified position
    v1.addAll(v2);                              // add all elements of anothe ArrayList
    v1.remove(v1.size()-1);                     // delete the last element
    
    // additional
    v1.clear();                                 // removes all elements
    v1.contains(4);                             // check if object is in the ArrayList
    v1.indexOf(4);                              // returns the index of the object
    v1.isEmpty();                               // check if the ArrayList is empty
    v1.remove(1);                               // remove element by index
    v1.subList(1, 3);                           // subList from index to index of the initial ArrayList
    v1.toArray();                               // makes an array from the ArrayList


    for (int i=0; i<v1.size(); ++i) {           // iterate over the ArrayList, 1st method
      System.out.println(v1.get(i));            
    }

    for (int item : v1) {                       // iterate over the ArrayList, 2nd method
      System.out.println(item);            
    }
    

    Collections.sort(v1);                       // sort using the standard Collection library
    Collections.sort(v1, Collections.reverseOrder()); // sort in reverse order

  }
  

  public static void two_pointer_technique() {
    /*
      Two-Pointer Technique:

      1. We can use two pointers at the same time to do the iteration: 
         one starts from the first element and another starts from the last element.

         We can use this, for example, to swap first and last elements in the array.
         
         // int[] v, int N
         int i = 0;
         int j = N - 1;
         while (i < j) {
             int temp = v[i];
             v[i++] = v[j];
             v[j--] = temp;
         }

      2. We can also use two pointers with different steps to solve problems.

         We can use this for "Given an array and a value, remove all instances 
         of that value in-place and return the new length."
         - One pointer is still used for the iteration while
           the second one always points at the position for next addition.
         
         // int[] nums, int val
         int k = 0;
         for (int i = 0; i < nums.length; ++i) {
             if (nums[i] != val) {
                 nums[k] = nums[i];
                 k++;
             }
         }
      
       3. Sliding Window using 2 pointers

          Когда нам нужно просуммировать промежуток внутри array и двигать его направо, при
          этом сохраняя его сумму, то можно использовать первый pointer как левое начало 
          этого отрезка, а правый от начала до конца, пока сумма не будет равна нужной и потом двигать
          оба pointers направо удовлетворяя условию.

          Это вместо того, чтобы по array проходить несколько раз
    */
  }
  
}