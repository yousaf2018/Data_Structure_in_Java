package com.company;
public class Main {

    public static void main(String[] args) {
        Link_list Link=new Link_list();
        Link.add_node_at_start(5);
        Link.add_node_at_start(55);
        Link.add_node_at_start(555);
        Link.add_node_at_start(5555);
        Link.add_node_at_start(55555);
        Link.add_node_at_start(555555);
        Link.display_all_nodes();
    }
}
