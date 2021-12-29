package com.linhtb2008110307.tieuluancuoiky;

public class Node {
    HangHoa data;
    Node next;

    //lien ket
    public Node(){}

    public Node(HangHoa hangHoa){
        data = hangHoa;
        next = null;
    }
    public Node(HangHoa hangHoa, Node node){
        data = hangHoa;
        next = node;
    }
}
