package com.linhtb2008110307.tuan02;

public class MayTinh {
    /*Máy tính
		Nhà sản xuất
		Năm sản xuất
		Hệ điều hành
		Ram
		CPU
		Giá
		Năm bảo hành*/
        String tenMayTinh;
        String nhaSanXuat;
        int    namSanXuat;
        String HedieuHanh;
        String Ram;
        String CPU;
        String Gia;
        String namBaoHanh;
        void   inThongTinMayTinh(){
            System.out.println("tên máy tính           :"+tenMayTinh);
            System.out.println("nhà sản xuất           :"+nhaSanXuat);
            System.out.println("năm sản xuất           :"+namSanXuat);
            System.out.println("hệ điểu hành           :"+HedieuHanh);
            System.out.println("Ram                    :"+Ram);
            System.out.println("CPU                    :"+CPU);
            System.out.println("Giá một chiếc mấy tính :"+Gia);
            System.out.println("năm bảo hành           :"+namBaoHanh);
        }
    
}
