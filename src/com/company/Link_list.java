package com.company;

public class Link_list {
    Node first = null;
    public void add_node_at_start(int value){
        if(first==null){
            Node temp=new Node(value);
            first = temp;
        }
        else{
            Node temp2=new Node(value);
            Node temp = null;
            temp = first;
            temp2.Next=first;
            first = temp2;
        }
    }
    public  void display_all_nodes(){
        Node temp=null;
        temp = first;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.Next;
        }
    }
}
