package com.linhtb2008110307.tuan04;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1Lab4 {
    public static void main(String[] args) {
        double b;
        String a;
        double tong = 0;
        Scanner n = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while(true){
            System.out.printf("Nhập phần tử thứ %d: ", list.size());
            b = n.nextDouble();
            list.add(b);
            n.nextLine();
            System.out.println("Bạn có muốn nhập thêm không(Y/N): ");
            a = n.nextLine();
            if(a.equals("N"))
                 break;
        }
        System.out.println("---Các phần tử của list---");
        for(Double x : list){
            System.out.printf("+ %.2f\n", x);
            tong += x;
        }
        System.out.println("Tổng các phần tử là: tổng = " + tong);
        n.close();
    }

}
