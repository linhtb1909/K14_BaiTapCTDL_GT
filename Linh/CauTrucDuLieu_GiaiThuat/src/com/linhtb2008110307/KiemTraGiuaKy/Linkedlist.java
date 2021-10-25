package com.linhtb2008110307.KiemTraGiuaKy;

import java.util.Scanner;

public class Linkedlist {
    Node head = null;
    Node tail = null;

    static Node ds = new Node(); 
    Scanner nhap = new Scanner(System.in);

    public void addTail() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addHead() {
        Node newNode = new Node();
        newNode.nhapThongTin();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void inDanhSach() {
        Node current = head;

        if (head == null) {
            System.out.println("Trống");
        } else {
            System.out.println("Các biến là:  ");
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void removeTail() {
        Node tam = head;
        if (head == null) {
            System.out.println("Trống");
            return;
        }
        while (tam != null) {
            if (tam.next == tail) {
                tail = tam;
                tail.next = null;
                return;
            }
            tam = tam.next;
        }
    }
}
