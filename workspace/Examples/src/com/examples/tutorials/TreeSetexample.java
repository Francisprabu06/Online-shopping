package com.examples.tutorials;
import java.util.*;  
public class TreeSetexample implements Comparable<TreeSetexample>{  
int id;  
String name,author,publisher;  
int quantity;  
public TreeSetexample(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
public int compareTo(TreeSetexample b) {  
    if(id>b.id){  
        return 1;  
    }else if(id<b.id){  
        return -1;  
    }else{  
    return 0;  
    }  
}  
}  
class TreeSetExample {  
public static void main(String[] args) {  
    Set<TreeSetexample> set=new TreeSet<TreeSetexample>();  
    //Creating Books  
    TreeSetexample b1=new TreeSetexample(121,"Let us C","Yashwant Kanetkar","BPB",8);  
    TreeSetexample b2=new TreeSetexample(233,"Operating System","Galvin","Wiley",6);  
    TreeSetexample b3=new TreeSetexample(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    //Adding Books to TreeSet  
    set.add(b1);  
    set.add(b2);  
    set.add(b3);  
    //Traversing TreeSet  
    for(TreeSetexample b:set){  
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }  
}  
}  

