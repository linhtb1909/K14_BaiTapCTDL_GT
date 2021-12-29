package com.linhtb2008110307.tieuluancuoiky;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

    

public class HangHoaLinkList {
    Node head = null;
    Node tail = null;
    
    Scanner scanner = new Scanner(System.in);
    public HangHoaLinkList(){
    }

    boolean isEmpty(){
        boolean empty = true;
        if (head == null) {
            empty = true;
        } else {
            empty = false;
        }
        return empty;
    }

    //them du lieu tao kho moi
    void add(String loaiHang,int maHang,String tenHangHoa, double gia, int soLuongTon, String ngayNhap){
        HangHoa hangHoa = new HangHoa(loaiHang,maHang,tenHangHoa, gia,soLuongTon,ngayNhap);
        Node newNode = new Node(hangHoa);
        if(isEmpty()==true){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail  = newNode;            
        }
    }  
    //in danh sách kho hang
    void print(){
        Node current = head;
    
        if(head == null){
            System.out.println("Danh sach rong");
            return;
        }
        System.out.println("danh sach hang hoa");
        while(current != null){
            current.data.inThongTin();
            current = current.next;
        }
    }
    // them vao đau kho hang
    void addHead(){
        HangHoa hangHoa = new HangHoa();
        Node newNode = new Node(hangHoa);
        newNode.data.nhap();
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;            
        }
    }
    // them vao cuoi kho hang
    void addTail(){
        HangHoa hangHoa = new HangHoa();
        Node newNode = new Node(hangHoa);
        newNode.data.nhap();
        if (isEmpty() == true) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;            
        }
    }
    // tim kiem ma cua hang hoa
    Node findProductId(int maHH){
        Node node = null;
        if(isEmpty()== true){
            System.out.println("kho rong");
        }else{
            Node current = head;
            while(current != null){
                if(current.data.maHangHoa == maHH){
                    node = current;
                    
                }
                current = current.next;
            }
        }
        return node;
    }

    //them truoc ma hang hoa tim duoc
    void addPreNode(){
        HangHoa hangHoa = new HangHoa();
        System.out.print("Nhap ma hang hoa can tim: ");
        int maHH = scanner.nextInt();
        Node preNode = findProductId(maHH);
        Node current = head;

        if(preNode == null){
            System.out.println("Khong tim may ma hang hoa");
            return;
        }
        if (head.data.maHangHoa == maHH)
            addHead();
        while (current != null) {          
            if (current.next == preNode) {
                Node newNode = new Node(hangHoa);
                newNode.data.nhap();
                current.next = newNode;
                newNode.next = preNode;
                return;
            }
            current = current.next;            
        }
    }
    
    // them sau ma hang hoa tim duoc
    void addAfterNode(){
        HangHoa hangHoa = new HangHoa();
        System.out.print("Nhap ma hang hoa can tim: ");
        int maHH = scanner.nextInt();
        Node preNode = findProductId(maHH);
        Node current = head;

        if(preNode == null){
            System.out.println("Khong tim may ma hang hoa");
            return;
        }
        while (current != null) {          
            if (current == preNode) {
                Node newNode = new Node(hangHoa);
                newNode.data.nhap();
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;            
        }
    }
    
    // xoa dau kho hang
    void deleteHead(){
        if (isEmpty() == true) {
            System.out.println("kho rong");
        }else{
            head = head.next;            
        }
    }
    // xoa cuoi kho hang
    void deleteTail(){
        if(isEmpty()==true){
            System.out.println("kho rong");
        }else{
            Node current = head;
            while(current != null){
                if(current.next == tail){
                    tail = current;
                    current.next = null;
                }
                current = current.next;
            }
        }
    }
    //xoa khi tim thay ma hang
    void findDelete(){
        System.out.print("Nhap ma hang hoa can xoa");
        int maHH = scanner.nextInt();
        Node preNode = findProductId(maHH);
        if(preNode == head) deleteHead();
        if(preNode == tail) deleteTail();
        Node current = head;
            while(current != null){
                if(current.next == preNode){
                    current.next = preNode.next;
                    break;
                }
                current = current.next;
        }
    }
    /*// sua thong tin hang hoa
    void fixNode() {
        HangHoa hangHoa = new HangHoa();
        System.out.print("Nhap ma hang hoa can sua: ");
        int maHH = scanner.nextInt();
        Node preNode = findProductId(maHH); 
        if(preNode == null){
            System.out.println("Ma hang hoa can sua thong tin khong co trong danh sach!");
        }else{
            if(preNode == head){
            deleteHead();
            addHead();
            }else{
                if(preNode == tail){
                    deleteTail();
                    addTail();
                }else{
                    addPreNode();
                    findDelete();
                }
        }}
    }
        */
        
    // tim kiem thong tin hang hoa theo loai hang hoa
    void findName(){
        scanner.nextLine();
        System.out.print("Nhap loai hang hoa can tim: ");
        String loaiHH = scanner.nextLine();
        Node current = head;
            while(current != null){
                if(current.data.loaiHangHoa.equalsIgnoreCase(loaiHH)){
                    current.data.inThongTin();
                }
                current = current.next;
        }
    }

    // tim kiem thong tin hang hoa theo gia hang hoa
    void findCost(){
        scanner.nextLine();
        System.out.print("Nhap gia hang hoa can tim: ");
        int giaHH = scanner.nextInt();
        Node current = head;
        
            while(current != null){
                if(current.data.giaNhap == giaHH){
                    current.data.inThongTin();
                }
                current = current.next;
        }
    }

    /*
    //tim kiem theo ngay nhap hang hoa
    void findDay(){
        scanner.nextLine();
        
        System.out.print("Ngay nhap hang hoa: ");
        String NgayNHH = scanner.nextLine();
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(NgayNHH);
        Node current = head;
            while(current != null){
                if(current.data.ngayNhapKho.compareTo(NgayNHH)){
                    current.data.inThongTin();
                }
                current = current.next;
        }
    }
    */
    

    //Sap xep tang dan theo gia
    void selectionSort(){
        scanner.nextLine();
            Node current = head;
            
            while(current != null){
                Node newNode = current;
                Node index = current.next;
                while(index != null){
                    if(index.data.giaNhap < current.data.giaNhap){
                        newNode.data = index.data;
                    }
                    index = index.next;
                }
            Node smallerNode = new Node();
            smallerNode.data = newNode.data;
            newNode.data = current.data;
            current.data = smallerNode.data;
            current.data.inThongTin();
            current = current.next;
            }      
    }
    //Sap xep theo ngay nhap
    void selectionSortDay(){
        scanner.nextLine();
            Node current = head;
            Node index = current.next;
            Node newNode = current;
            while(current != null){
                index = current.next;
                while(index != null){
                    if(index.data.ngayNhapKho.before(current.data.ngayNhapKho)){
                        newNode.data = index.data;
                    }
                    index = index.next;
                }
            Node smallerNode = newNode;
            newNode.data = current.data;
            current.data = smallerNode.data;
            current.data.inThongTin();
            current = current.next;
            }      
    }

    //tong so luong hang hoa

    void sumAll(){
        scanner.nextLine();
        Node current = head;
        int sum = 0;
        if(head == null){
            System.out.println("Kho rong");
        }else{
            while (current != null) {
                sum = sum + current.data.soLuongTonKho;
                current = current.next; 
            }
        }
        System.out.println("Tong tat ca hang hoa trong kho la "+sum);         
    }

    // tong gia tri nhap kho

    void sumCost(){
        Node current = head;
        double sum = 0;
        if(head == null){
            System.out.println("Kho rong");
        }else{
            while (current != null) {
                sum = sum + current.data.giaNhap;
                current = current.next; 
            }
        }
        System.out.println("Tong gia tri cua kho la "+sum);
    }

    //so luong tung loai mat hang
    void statitsic(){
        Node current = head;
        int tongThucPham = 0;
        int tongSanhSu = 0;
        int tongDienMay = 0;
        String tp = "thuc pham";
        String ss = "sanh su";
        String dm = "dien may";
        if(head == null){
            System.out.println("Kho rong");
        }else{
            while (current != null) {
                if(current.data.loaiHangHoa.equalsIgnoreCase(tp)){
                    tongThucPham = tongThucPham + current.data.soLuongTonKho;
                }
                if(current.data.loaiHangHoa.equalsIgnoreCase(ss)){
                    tongSanhSu = tongThucPham + current.data.soLuongTonKho;
                }
                if(current.data.loaiHangHoa.equalsIgnoreCase(dm)){
                    tongDienMay = tongThucPham + current.data.soLuongTonKho;
                }
                current = current.next; 
            }
            
            System.out.println(" Tong so luong thuc pham trong kho la: "+tongThucPham+" san pham");
            
            System.out.println("Tong so luong sanh su trong kho la: "+tongSanhSu+" san pham");
            
            System.out.println("TOng so luong do dien may trong kho la: "+tongDienMay+" san pham");
        }
        
    }
    //menu
    void menu(){
        
        int suLuaChon;
        do{
            System.out.println("------------------MENU------------------");
            System.out.println("1. Danh sach hang hoa trong kho.");
            System.out.println("2. Them hang hoa.");
            System.out.println("3. Xoa hang hoa.");
            System.out.println("4. Tim kiem hang hoa.");
            System.out.println("5. Sap xep hang hoa.");
            System.out.println("6. Thong ke hang hoa.");
            System.out.println("Hay chon chuc nang");
            System.out.println("------------------MENU------------------");
            suLuaChon = scanner.nextInt();
            switch(suLuaChon){
                case 1:print();break;

                case 2:int chonthem;
                do{
                    System.out.println("----------------MENU THEM---------------");
                    System.out.println("1. Them hang hoa vao dau danh sach.");
                    System.out.println("2. Them hang hoa vao cuoi danh sach.");
                    System.out.println("3. Them vao truoc ma hang hoa tim duoc.");
                    System.out.println("4. Them vao sau ma hang hoa tim duoc.");
                    System.out.println("5. Danh sach hang hoa trong kho.");
                    System.out.println("Hay chon chuc nang");
                    System.out.println("----------------------------------------");
                    chonthem = scanner.nextInt();
                    switch(chonthem){
                        case 1:addHead();break;
                        case 2:addTail(); break;
                        case 3:addPreNode();break;
                        case 4:addAfterNode();break;
                        case 5:print();break;
                        default: System.out.println("thoat them");
                    }}while(chonthem >= 1 && chonthem <= 5);break;

                case 3:int chonxoa;
                do{
                    System.out.println("----------------MENU XOA----------------");
                    System.out.println("1. Xoa hang hoa o dau danh sach.");
                    System.out.println("2. Xoa hang hoa o cuoi danh sach.");
                    System.out.println("3. Tim ma hang hoa roi xoa.");
                    System.out.println("4. Danh sách hang hoa trong kho.");
                    System.out.println("Hay chon chuc nang");
                    System.out.println("----------------------------------------");
                    chonxoa = scanner.nextInt();
                    switch(chonxoa){
                        case 1:deleteHead();break;
                        case 2:deleteTail(); break;
                        case 3:findDelete();break;
                        case 4:print();break;
                        default: System.out.println("thoat xoa");
                    }}while(chonxoa >= 1 && chonxoa <= 4);break;


                case 4: int chontim;
                do{
                    System.out.println("----------------MENU TIM KIEM---------------");
                    System.out.println("1. Tim hang hoa theo loai.");
                    System.out.println("2. Tim hang hoa theo gia.");
                    System.out.println("Hay chon chuc nang");
                    System.out.println("--------------------------------------------");
                    chontim = scanner.nextInt();
                    switch(chontim){
                        case 1:findName();break;
                        case 2:findCost(); break;
                        default: System.out.println("thoat tim kiem");
                    }}while(chontim >= 1 && chontim <= 2);break;

                case 5:int chonSapXep;
                do{
                    System.out.println("----------------MENU SAP XEP---------------");
                    System.out.println("1. Sap xep hang hoa theo gia.");
                    System.out.println("2. Sap xep theo ngay.");
                    System.out.println("Hay chon chuc nang");
                    System.out.println("-------------------------------------------");
                    chonSapXep = scanner.nextInt();
                    switch(chonSapXep){
                        case 1:selectionSort();break;
                        case 2:selectionSortDay(); break;
                        default: System.out.println("thoat sep xep");
                    }}while(chonSapXep >= 1 && chonSapXep <= 2);break;

                case 6: int chonTong;
                do{
                    System.out.println("----------------MENU THONG KE---------------");
                    System.out.println("1. Tong tat ca hang hoa.");
                    System.out.println("2. Tong Gia Tri Nhap Kho.");
                    System.out.println("3. Tong hang hoa moi loai.");
                    System.out.println("Hay chon chuc nang");
                    System.out.println("-------------------------------------------");
                    chonTong = scanner.nextInt();
                    switch(chonTong){
                        case 1:sumAll();break;
                        case 2:sumCost(); break;
                        case 3:statitsic(); ;break;
                        default: System.out.println("thoat thong ke");
                    }}while(chonTong >= 1 && chonTong <= 3);break;

                default: System.out.println("");
            }}while(suLuaChon >= 1 && suLuaChon <= 6);
    }
}
