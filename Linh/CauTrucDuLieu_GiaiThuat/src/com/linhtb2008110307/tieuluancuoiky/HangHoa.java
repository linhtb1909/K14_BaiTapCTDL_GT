package com.linhtb2008110307.tieuluancuoiky;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class HangHoa {
    
    String loaiHangHoa;
    int maHangHoa;
    String tenHangHoa;
    double giaNhap;
    int soLuongTonKho;
    Date ngayNhapKho = null;
    Scanner scanner = new Scanner(System.in);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
    
    
public HangHoa(){}

public HangHoa(String loaiHang,int maHang,String tenhang, double gia, int soLuongTon, String ngayNhap){
    loaiHangHoa = loaiHang;
    maHangHoa = maHang;
    tenHangHoa = tenhang;
    giaNhap = gia;
    soLuongTonKho = soLuongTon;
    try {
        ngayNhapKho = simpleDateFormat.parse(ngayNhap);

    } catch (Exception e) {
    }
}

public void nhap(){
    System.out.print("San pham loai: ");
    loaiHangHoa = scanner.nextLine();
    System.out.print("Ma hang hoa: ");
    maHangHoa = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ten hang hoa: ");
    tenHangHoa = scanner.nextLine();
    System.out.println("Gia nhap: ");
    giaNhap = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("So luong nhap: ");
    soLuongTonKho = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Ngay nhap: ");
    try {
        ngayNhapKho = simpleDateFormat.parse(scanner.nextLine());

    } catch (Exception e) {
    }
}
public void inThongTin(){
    System.out.println("Loai Hang: "+loaiHangHoa+"   Ma: "+maHangHoa+"   Ten Hang Hoa: "+tenHangHoa+"   Gia Nhap: "+giaNhap+"        So Luong Ton Kho: "+soLuongTonKho+"        Ngay nhap: "+simpleDateFormat.format(ngayNhapKho));
}
}