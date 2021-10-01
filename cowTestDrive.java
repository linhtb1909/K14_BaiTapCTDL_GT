package com.linhtb2008110307.tuan02;

public class cowTestDrive {
    public static void main(String[] args) {
        cow cow;
        cow = new cow();

        cow.canNang = 15.1;
        System.out.println("Cân nặng: "+cow.canNang);

        System.out.println();

        cow = new cow(11.1, "Nâu", "Đực");
        cow.inThongTin();

    }
}
