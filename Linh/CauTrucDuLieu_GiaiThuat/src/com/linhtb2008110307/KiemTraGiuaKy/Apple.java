package com.linhtb2008110307.KiemTraGiuaKy;

import java.util.Scanner;

public class Apple {
    String ID;
    String Khoiluong;
    String mauSac;
    Scanner n = new Scanner(System.in);
    
    Apple(){

    }  

    Apple(String I, String KL, String mS) {
        ID = I;
        KL = Khoiluong;
        mS = mauSac;
    }

    void inThongTin(){
        System.out.println("ID        : "+ID);
        System.out.println("Khối lượng: "+Khoiluong);
        System.out.println("Màu sắc   : "+mauSac);
    }
    void NhapThongtin(){
        System.out.println("ID: ");
        ID = n.nextLine();
        System.out.println("Khối lượng: ");
        Khoiluong = n.nextLine();
        System.out.println("Màu Sắc: ");
        mauSac = n.nextLine();
    }

}
