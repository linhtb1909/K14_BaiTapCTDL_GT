package com.linhtb2008110307.tuan02;

import javax.print.DocFlavor.STRING;

public class NhanVien {
  /*  Nhân viên
		tên nhân viên
		lương
		địa chỉ
		bộ phận làm việt
		Ngày sinh (dùng chuỗi)*/

        String tenNhanVien;
        String luong;
        String diaChi;
        String boPhanLamViec;
        String ngaySinh;
        void inThongTinNhanVien(){
            System.out.println(" tên nhân viên  :"+tenNhanVien);
            System.out.println("lương           :"+luong);
            System.out.println("địa chỉ         :"+diaChi);
            System.out.println("bộ phận làm việc:"+boPhanLamViec);
            System.out.println("ngày sinh       :"+ngaySinh);
        }

}
