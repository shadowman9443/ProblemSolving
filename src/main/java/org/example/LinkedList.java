package org.example;

public class LinkedList {
    class Node{
        private int value;
        Node next = null;

        public Node(int value) {
            this.value = value;

        }
    }

    Node head ;
    int size = 0;
    public LinkedList() {
        head = null;
    }


    public int get(int index){
        if(index>=size||index<0) return -1;
        Node temp = head;
        for(int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp != null ? temp.value : 0;
    }
    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }
    public void addAtTail(int val) {
       if(head == null){
           Node node = new Node(val);
       }else{
           Node temp = head;
           while (temp.next!=null){
               temp= temp.next;
           }
           temp.next = new Node(val);

       }
       size++;

    }
    public void addAtIndex(int index, int val) {
        if(index == size){
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        }else if (head == null) {
            head = new Node(val);
        }
        else{
            Node newNode = new Node(val);
            Node previous = null;
            Node current = head;

            for(int i = 0;i<index;i++){
               previous = current;
               current = current.next;
            }
            previous.next = newNode;
            newNode.next = current;

        }
        size++;
    }
    public void deleteAtIndex(int index) {
        if(index < 0 || index>size) return;
        if (index == 0) {
            head = head.next; // Change head
            return;
        }
        Node previous = null;
        Node current = head;

        for(int i = 0;i<index;i++){
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        size --;
    }
}
