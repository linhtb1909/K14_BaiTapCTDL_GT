package com.linhtb2008110307.KiemTraGiuaKy;

import java.util.Scanner;

public class LinkedlistTestDrive {
    public static void main(String[] args) {
        Linkedlist pNDS = new  Linkedlist();
        Scanner nhap = new Scanner(System.in);

        do {
            System.out.println("---------------MENU----------------");
            System.out.println("1)  Add Head                       |");
            System.out.println("2)  Add Tail                       |");
            System.out.println("3)  In DS                          |");
            System.out.println("4)  Kết Thúc.                      |");
            System.out.println("-----------------------------------");

            System.out.println("Chọn chức năng (chọn số): ");
            int key = nhap.nextInt();

            switch (key) {
            case 1:
                pNDS.addHead();
            case 2:
                pNDS.addTail();
                break;
            case 3:
                pNDS.inDanhSach();
                break;
            case 4:
                System.out.println("Kết Thúc!");
                System.exit(0);
                break;
            }

            System.out.println("Quay về MENU (y/n)?: "); // tạo nút quay về mỗi lần sài 1 chức năng !
            nhap.nextLine();

        } while (nhap.nextLine().equals("y"));
    }
}
