/*
public class LL {

   Node head;
   private int size;

   LL() {
    this.size = 0;
   }

    class Node {
        String data;
        Node next;
 
        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first, last
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print
    public void printList() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete First
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }
    // delete Last
    public void deleteLast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;// head.next = null -> lastnode = null
        while (lastNode.next != null) { // null.next
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;  
    }

    public int getSize() {
        return size;
    }
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        list.addLast("list");
        list.printList();

        list.addFirst("this");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());

    }
}

*/

import java.util.*;
public class LL{

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);

        list.addFirst("this");
        list.add("list");
        System.out.println(list);

        System.out.println(list.size());

        for (int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("null");

       // oveFirst();
       // ut.println(list);

       // oveLast();
       // System.out.println(list);


       list.remove(3);
       System.out.println(list);
    }
}
