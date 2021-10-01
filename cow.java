package com.linhtb2008110307.tuan02;

public class cow {
    double canNang;
    String mauSac;
    String gioiTinh;

    cow(){
        //Hàm tạo mặc định
    }

    cow(double CN, String mau, String gt){
        canNang = CN;
        mauSac = mau;
        gioiTinh = gt;
    }
    
    void inThongTin(){
        System.out.println("Cân nặng: "+canNang);
        System.out.println("Màu: "+mauSac);
        System.out.println("Giới Tính: "+gioiTinh);
    }
}
