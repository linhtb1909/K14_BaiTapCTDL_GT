package com.linhtb2008110307.KiemTraGiuaKy;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args){
        KhochuaApple pNKhochuaApple = new KhochuaApple();
        Scanner Nhap = new Scanner(System.in);

        do{
            System.out.println("==========meNu==========");
            System.out.println("1) Nhập danh sách Apple ");
            System.out.println("2) In danh sách Apple   ");
            System.out.println("3) Tìm theo màu         ");
            System.out.println("4) END                  ");
            System.out.println("________________________");
            System.out.println("Chọn chức năng:         ");
            int key = Nhap.nextInt();

            switch (key) {
            case 1:
                pNKhochuaApple.nhapDanhSach();
                break;
            case 2:
                pNKhochuaApple.inDanhSach();
                break;
            case 3:
                pNKhochuaApple.timTheoMau();
                break;
            case 4:
                System.out.println("END");
                System.exit(0);
                break;
            }
            System.out.println("Quay về meNu(Y/N)?: ");
            Nhap.nextLine();

        }
        while (Nhap.nextLine().equals("Y"));
    }
}
