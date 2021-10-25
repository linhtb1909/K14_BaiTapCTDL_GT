package com.linhtb2008110307.KiemTraGiuaKy;

import java.util.ArrayList;
import java.util.Scanner;

public class KhochuaApple {
    static ArrayList<Apple> DSApple = new ArrayList<>();
    static Scanner Nhap = new Scanner(System.in);

    public void nhapDanhSach(){
        while(true){

            Apple apple = new Apple();
            apple.NhapThongtin();

            Nhap.nextLine();
            DSApple.add(apple);

            System.out.println("Nhập thêm táo: (Y/N) ?");
            if(Nhap.nextLine().equals("N"))
            break;
        }
    }
    
    public void inDanhSach(){
        for(Apple apple: DSApple){
            apple.inThongTin();
        }
    }

    public void timTheoMau(){
        System.out.println("Màu sắc cần tìm là: ");
        for(Apple apple: DSApple){
            if(Nhap.nextLine().equals(apple.mauSac))
            apple.inThongTin();
        }
    }

}