/* this is difference between HashMap vs HashTable author=srinivas*/ 

package com.cts.Package1;

import java.util.Hashtable;

public class TaskHashTable { 
    public static void main(String[] arg) 
    { 
        // creating a hash table 
        Hashtable<Integer, String> h = 
                      new Hashtable<Integer, String>(); 
  
        Hashtable<Integer, String> h1 = 
                      new Hashtable<Integer, String>(); 
  
        h.put(3, "Hello"); 
        h.put(2, "Welcome"); 
        h.put(1, "for Cognizant"); 
  
        // create a clone or shallow copy of hash table h 
        h1 = (Hashtable<Integer, String>)h.clone(); 
  
        // checking clone h1 
        System.out.println("values in clone: " + h1); 
  
        // clear hash table h 
        h.clear(); 
  
        // checking hash table h 
        System.out.println("after clearing: " + h); 
    } 
} 
