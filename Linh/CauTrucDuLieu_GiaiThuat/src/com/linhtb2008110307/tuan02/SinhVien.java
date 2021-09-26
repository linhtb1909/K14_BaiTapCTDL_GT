package com.linhtb2008110307.tuan02;

import javax.print.DocFlavor.STRING;

public class SinhVien {
    String HovaTen;
    int namSinh;
    String MSSV;
    int tuoi;
    String queQuan;
    String lop;
    void inThongTinSinhVien(){
        System.out.println("mã số sinh viên    :"+MSSV);
        System.out.println("lớp                :"+lop);
        System.out.println("họ và tên sinh viên:"+HovaTen);
        System.out.println("năm sinh           :"+namSinh);
        System.out.println("tuổi               :"+tuoi);
        System.out.println("quê quán           :"+queQuan);
    }
    
}
