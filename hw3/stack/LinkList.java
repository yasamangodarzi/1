package com.company;

public class LinkList {
        Node head;

        class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }
    public void add(String data) {
        int new_data = Integer.valueOf(data);
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }
    public int getNode(int index)
    {
        Node current = head;
        int count = 0;
        while (current != null)
        {
            if (count == index)
                return current.data;
            count++;
            current = current.next;
        }
        return 0;
    }
    public int sizeLinklist() {
        Node temp = head;
        int count = 0;
        int size = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}