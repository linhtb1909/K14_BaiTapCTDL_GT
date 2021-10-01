package com.linhtb2008110307.tuan03;

public class Bai2Lab3 {
    public static void main(String[] args) {
        int n;
        int dem = 0;
        for(int i = 1;i <= 10;i++)
            for(int j = 1;j < 10;j++)
            {
                n = i * j;
                System.out.printf("%dx%2d=%2d  ", j, i, n);
                dem++;
                if(dem % 9 == 0)
                    System.out.print("\n");
		}
    }
}
