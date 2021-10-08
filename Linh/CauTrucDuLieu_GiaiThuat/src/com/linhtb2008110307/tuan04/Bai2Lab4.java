package com.linhtb2008110307.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2Lab4 {
    static Scanner n = new Scanner(System.in);
    static ArrayList<String> DS = new ArrayList<String>();
    public static void main(String[] args) {
        int luaChon;
        do{
            System.out.println("__________MENU__________");
            System.out.println(">>1. Nhập thông tin.");
            System.out.println(">>2. Xuât danh sách vừa nhập.");
            System.out.println(">>3. Xuất danh sách ngấu nhiên.");
            System.out.println(">>4. Sắp xếp giảm dần và xuất danh sách.");
            System.out.println(">>5. Tìm và xóa họ tên.");
            System.out.println(">>6. Thoát");
            System.out.print("- Nhập vào sự lựa chọn(1->6): ");
            luaChon = n.nextInt();
            switch(luaChon){
                case 1: nhap(); break;
                case 2: xuat(); break;
                case 3: xuatNgauNhien(); break;
                case 4: sapXepVaXuatDS(); break;
                case 5: xoa(); break;
                case 6: break;
                default: System.out.println("Lựa chọn không hợp lệ!");
            }
            System.out.print("Quay lại MENU lựa chọn(1:yes/0:no): ");
            luaChon = n.nextInt();
        } while(luaChon == 1);
    }
    static void nhap(){
        while(true){
            System.out.print("Nhập họ và tên: ");
            n.nextLine();
            String hoTen = n.nextLine();
            DS.add(hoTen);
            System.out.print("Bạn có muốn nhập thêm không(1:yes/0:no): ");
            int a = n.nextInt();
            if(a == 0)
                break; 
        }
    }
    static void xuat(){
        System.out.println("---------DANH SÁCH---------");
        for(String x : DS){
            System.out.printf("Họ và tên: %s\n", x);
            System.out.println("__________________________");
        }
    }
    static void xuatNgauNhien(){
        Collections.shuffle(DS);
        xuat();
    }
    static void sapXepVaXuatDS(){
        Collections.sort(DS);
        Collections.reverse(DS);
        xuat();
    }
    static void xoa(){
        for(String x: DS){
            System.out.println("Nhập tên cần xóa: ");
            String hoTen = n.nextLine();
            if(x == hoTen){
                DS.remove(hoTen);
            }
        }
    }
}
