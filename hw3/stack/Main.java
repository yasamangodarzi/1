package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkList linkList = new LinkList();

        String input = sc.nextLine();
        String[] data = input.split(" ");
        for (int i = 0; i < data.length; i++) {
            linkList.add(data[i]);
        }
        Stack stack = new Stack(linkList.sizeLinklist());
        for (int i = 0; i < linkList.sizeLinklist(); i++) {
            stack.push(linkList.getNode(i));
        }
        for (int i = 0; i < linkList.sizeLinklist(); i++) {
            System.out.print(stack.pop());
            System.out.print(" ");
        }
    }
    }

