/* this is difference between LinkedList vs Vector author=srinivas*/ 

package com.cts.Package1;

import java.util.*; 

public class SampleLinkedList 
{ 
    public static void main(String args[]) 
    { 
        // Creating object of class linked list 
        LinkedList<String> ob = new LinkedList<String>(); 
  
        // Adding elements to the linked list 
        ob.add("Anil"); 
        ob.add("Bhargav"); 
        ob.addLast("Srinivas"); 
        ob.addFirst("Durga"); 
        ob.add(2, "Eshwar"); 
        ob.add("Fanish"); 
        ob.add("Ravi"); 
        System.out.println("Linked list after insertion : " + ob); 
  
        // Removing elements from the linked list 
        ob.remove("Bhargav"); 
        ob.remove(3); 
        ob.removeFirst(); 
        ob.removeLast(); 
        System.out.println("Linked list after deletion: " + ob); 
  
        // Finding elements in the linked list 
        boolean status = object.contains("Eshwar"); 
  
        if(status) 
            System.out.println("List contains the element 'Eshwar' "); 
        else
            System.out.println("List doesn't contain the element 'Eshwar'"); 
  
        // Number of elements in the linked list 
        int size = ob.size(); 
        System.out.println("Size of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = ob.get(2); 
        System.out.println("Element returned by get() : " + element); 
        ob.set(2, "Yashawi"); 
        System.out.println("Linked list after change : " + ob); 
    } 
}