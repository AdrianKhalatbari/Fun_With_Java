package test;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args){
        LinkedList<String> testLinkedList = new LinkedList<String>();
        testLinkedList.add("Dave");
        testLinkedList.add("Lucca");
        testLinkedList.add("Shivan");
        Iterator iterator = testLinkedList.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
