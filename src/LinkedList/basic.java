package LinkedList;

import java.util.*;
public class basic{
    public static void main(String[] args){
     LinkedList list =new LinkedList();
     list.insert(5);
     list.insert(6);
        list.insert(3);
        list.insert(8);
        list.insert(0);

     list.insertbetween(3,7);
     list.print();
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    public void insert(int data){
        Node newdata= new Node(data);
        if(head==null){
            head=newdata;
        }
        else{
            Node temp=head;
            {
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newdata;
            }
        }
    }
    public void insertbetween(int pos, int data){
        Node temp=head;
        while(temp!=null && temp.data!=pos){
            temp=temp.next;
        }
        if(temp!=null){
        Node new1 = new Node(data);
        new1.next=temp.next;
        temp.next=new1;
        }
        else{
            System.out.println("Node not found");
        }
    }
    public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    }
    public void printname(String s ){
        
    }
}
